package com.encapsulation;

public class EncapTest extends EncapsulationDemo {
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
