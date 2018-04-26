package com.training;

public class Application {

	public static void main(String[] args) {
	
		Patient ram = new Patient();   // Object is created with out any value and added in further stages
		
		ram.setPatientId(101);
		ram.setPatientName("Ramesh Kumar");
		ram.setMobileNumber(9494940);
		
		System.out.println(ram.getPatientName());
		
		
		  
		Patient shyam = new Patient(102,"Shyam Lal",7886868L);   // Object is created we all the values
		
		System.out.println(shyam.getPatientName());
		
		
		Patient ganesh = new Patient(103); // Object is created with Partial values
		
		System.out.println(ganesh.getPatientName());
       System.out.println(ganesh.getMobileNumber());
    
       System.out.println(ganesh.purchaseMedicine("Glycomet"));
       
       System.out.println(ram);
		
	}

}
