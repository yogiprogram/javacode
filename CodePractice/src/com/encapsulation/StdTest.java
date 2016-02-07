package com.encapsulation;

public class StdTest extends StudentRecord {
	public static void main(String args[]){
		StudentRecord obj= new StudentRecord();
		obj.setFirstName("Kavita");
	    obj.setLastName("Shivade");
	    obj.setAge(25);
	    obj.setAddress("pune");
	    
	    System.out.println("FIRST NAME:" +obj.getFirstName());
	    System.out.println("LAST NAME:" +obj.getLastName());
	    System.out.println("AGE:" +obj.getAge());
	    System.out.println("ADDRESS:" +obj.getAddress());
	    
	    
	}

}
