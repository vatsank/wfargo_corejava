package com.training.domains;

import java.util.List;

public class Application {

	public static void print(List<Customer> custList){
		
		
		for(Customer eachCustomer : custList)
		{
			System.out.println(eachCustomer);
		}
	}
	public static void main(String[] args) {


		
		 CustomerManager mgr = new CustomerManager();
		 
		  mgr.add(new Customer(101,"Ramesh",98595959));
		  mgr.add(new Customer(102,"Suresh",78596959));
		  mgr.add(new Customer(103,"Anand",68598959));
		  mgr.add(new Customer(104,"Zamin",68534359));
		  
		  
		  print(mgr.findAll());
		  
		  System.out.println("============SORTED BY NAME ====================");
		  print(mgr.getSortedList());
	}

}
