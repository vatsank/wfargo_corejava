package com.training.poly.ifaces;

public interface Automobile {

	
	// Interface has only Constant - public static final
	public String NAME = "Automobile  Quotation Printing";
	
	// All the Method in the Interface are Implicitly public and Abstract
	
	public String getModel();
	public double getPrice();
	public String getColor();
	
}
