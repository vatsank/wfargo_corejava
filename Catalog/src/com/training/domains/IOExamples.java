package com.training.domains;

import java.util.*;
import java.io.*;


public class IOExamples {

	public void writeToFile(Set<Customer> custList)
	{
		
		PrintWriter writer=null;
		try {
	
			 writer = new PrintWriter(new FileWriter(new File("Customter.txt"),true));
			 for(Customer eachCustomer :custList)
			 {
				 writer.println(eachCustomer);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
				writer.close();
			
		}
		
	}
	
	public Map<Integer,String> readFromFile(){
	
		BufferedReader reader = null;
		HashMap<Integer,String> list=null;
		try {
			
			reader = new BufferedReader(new FileReader(new File("Customter.txt")));
			
			      String line =null;
					
					list = new HashMap<Integer,String>();
					int i = 101;
					while( (line=reader.readLine())!=null)
					{
					     	 list.put(++i, line);
					}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
