package com.training.poly.example2.utils;

import com.training.poly.example2.domains.*;
import com.training.poly.example2.ifaces.Billable;

public class QuoteManager {

	
	public void showQuote(Item obj,int qty)
	{
		Billable polyItem = (Billable)obj;   // Casting

		System.out.println("Item Name :"+obj.getItemNumber());
				System.out.println("Item Name :"+obj.getItemName());
		System.out.println("Rate Per Unit "+obj.estimate());
		System.out.println("Quantity :="+ qty);
		
		System.out.println("Rent Amount :="+polyItem.calculateAmount(obj, qty));   // Run Time Polymorphism is working here
	
	}
	
	// Factory Method is Implemented Here - A Method Which returns Object of Subtypes based on some condition
	public Item getItem(int key)
	{
		
		  switch (key) {
		case 1:
			return new Television(101,"Samsung LED TV");
		case 2:
			return new AirCooler(102,"LLoyd Cooler");
		case 3:
			return new Sofa(103,"Nilkamal Sofa");
		default:
			return null;
		}
	}
}
