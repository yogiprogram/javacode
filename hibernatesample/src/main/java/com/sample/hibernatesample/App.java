package com.sample.hibernatesample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.hibernatesample.dao.EmployeeDaoImpl;
import com.sample.hibernatesample.dao.PersonDaoImpl;
import com.sample.hibernatesample.domain.Address;
import com.sample.hibernatesample.domain.DepartmentDetail;
import com.sample.hibernatesample.domain.Employee;
import com.sample.hibernatesample.domain.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "######## Start ########" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext-config.xml");
        
        EmployeeDaoImpl daoImpl = applicationContext.getBean(EmployeeDaoImpl.class);
        PersonDaoImpl personDaoImpl = applicationContext.getBean(PersonDaoImpl.class);
        
        //Manytoone
       /* DepartmentDetail departmentDetail = new DepartmentDetail();
        departmentDetail.setDepId(1);
        departmentDetail.setDepName("comp");
        daoImpl.add(departmentDetail);
        
        Employee employee = new Employee();        
        employee.setId(1);
        employee.setFirstName("yogesh");
        employee.setLastName("Wadile");
        employee.setDepartmentDetail(departmentDetail);
        daoImpl.add(employee);
        
        Employee employeeTwo = new Employee();        
        employeeTwo.setId(2);
        employeeTwo.setFirstName("kavita");
        employeeTwo.setLastName("Wadile");
        employeeTwo.setDepartmentDetail(departmentDetail);
        daoImpl.add(employeeTwo);
        */
        
        /*ArrayList<DepartmentDetail> departmentList = daoImpl.get();
        System.out.println("=====================================");
 
        for( DepartmentDetail departmentDetail1 : departmentList){
        	System.out.println("Dept Id   : "+ departmentDetail1.getDepId());
        	System.out.println("Dept Name : "+ departmentDetail1.getDepName());
        	Set<Employee> employees = departmentDetail1.getEmployees();
        	for(Employee employee1 : employees)
        		System.out.println(employee1.toString());
        }
        */
        
        Person person = new Person();

		person.setAge(10);
		person.setName("Yogesh Wadile");
		Address address = new Address();
		address.setLineOne("Line one");
		address.setLineTwo("line two");
		address.setMobileNumber("91 9096321090");
		person.setAddress(address);
		personDaoImpl.add(person);
		
		
		System.out.println("===== Get person detail =====");
		Person person2 = personDaoImpl.get(2);
		System.out.println("======== Detail ===== ");
		System.out.println(person2.getPid());

	}
}
