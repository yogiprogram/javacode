package com.encapsulation;

public class EncapsulationDemo {
	private int ssn;
	private String empName;
	private int age;
	
	
	public int getempSSN(){
		return ssn;
	}
	
	public String getempName(){
		return empName;
		
	}
	
	
	public int getempAge(){
		return age;
	}
	
	
	public void setEmpAge(int newValue){
		age = newValue;
	}
	
	public void setEmpSsn(int newValue){
		ssn = newValue;
	}
	
	public void setEmpName(String newValue){
		empName = newValue;
	}
	
}
 class EnpTest {
	public static void main(String args[]){
		EncapsulationDemo obj =new EncapsulationDemo();
		obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSsn(112233);
        System.out.println("Employee Name: " + obj.getempName());
        System.out.println("Employee SSN: " + obj.getempSSN());
        System.out.println("Employee Age: " + obj.getempAge());
   } 
}