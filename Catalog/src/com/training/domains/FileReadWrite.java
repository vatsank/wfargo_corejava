package com.training.domains;
import java.util.*;
import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {

		
		TreeSet<Customer> custList = new TreeSet<Customer>();
		
		custList.add(new Customer(101,"Ramesh",98595959));
		  custList.add(new Customer(102,"Suresh",78596959));
		  custList.add(new Customer(103,"Anand",68598959));
		  custList.add(new Customer(104,"Zamin",68534359));
		  custList.add(new Customer(101,"Ramesh",98595959));
		  
		  IOExamples example = new IOExamples();
		  
		   example.writeToFile(custList);
		   
		   
		   Map<Integer,String> list = example.readFromFile();
		   
		     Set<Map.Entry<Integer,String>> items = list.entrySet();
		     
		     for(Map.Entry<Integer,String> eachItem :items)
		     {
		    	 System.out.println("Key "+ eachItem.getKey());
		    	 System.out.println("Value "+eachItem.getValue());
		     }
		     
		     
		
	}

}
