package com.training.library;

public class Librarian {

	private long employeeId;
	private String name;
	private String location;
	
	
	@Override
	public  String toString() {
	
		 String fromSuper = super.toString();
		 		 
		return this.name + ","+ this.location  + fromSuper;
		
	}
	public Librarian() {
		super();
	}
	public Librarian(long employeeId, String name, String location) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.location = location;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
