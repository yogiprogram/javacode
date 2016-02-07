package com.encapsulation;

public class StudentRecord {
	private String FirstName;
	private String LastName;
	private int Age;
	private String Address;
	
	public String getFirstName(){
		return FirstName;
	}
	
	public String getLastName(){
		return LastName;
	}
	
	
	public int getAge(){
		return Age;
	}
	
	public String getAddress(){
		return Address;
	}
	
	
	public void setFirstName(String newValue){
		FirstName =newValue;
	}
	
	

	public void setLastName(String newValue){
		LastName =newValue;
	}
	

	public void setAge(int newValue){
		Age =newValue;
	}
	
	

	public void setAddress(String newValue){
		Address =newValue;
	}
	
	
	

}
