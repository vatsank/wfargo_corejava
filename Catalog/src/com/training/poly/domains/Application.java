package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {

		
		 int key = Integer.parseInt(args[0]);
		 
		 ShowRoom  saiAuto = new NewShowRoom();   // superType = subType
				 
				 Automobile auto = saiAuto.getProduct(key);
		 
		          saiAuto.printQuotation(auto);  
		          
	}

}
