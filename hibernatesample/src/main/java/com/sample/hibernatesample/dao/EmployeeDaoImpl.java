package com.sample.hibernatesample.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.hibernatesample.domain.DepartmentDetail;
import com.sample.hibernatesample.domain.Employee;
import com.sample.hibernatesample.domain.Person;

import antlr.collections.List;

@Repository
public class EmployeeDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void add(Employee employee){
		Session session = this.sessionFactory.getCurrentSession();
		session.save (employee);
	}
	
	@Transactional
	public void add(DepartmentDetail departmentDetail) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(departmentDetail);
	}
 
	@Transactional
	public ArrayList<DepartmentDetail> get() {
		Session session = this.sessionFactory.getCurrentSession();
		return   (ArrayList<DepartmentDetail>) session.createQuery("From DepartmentDetail" ).list();
	}
}
