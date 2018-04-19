package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class ShowRoom {

	
	// Instance Factory Method Pattern 
	
	     public ShowRoom() {
		super();
		System.out.println("Show Room INitalized");
		}

		public Automobile  getProduct(int key)
	     {
	    	 switch (key) {
			case 1:
				  return new MarutiCar();
			case 2:
				return new TVSBike();
			default:
				return null;
			}
	     }
	     // The polyAuto will exhibit Run time Polymorphism - It call the Methods in the Object what it is 
	     // referring and not the type 
	     
	     public void printQuotation(Automobile polyAuto)
	     {
	    	 if(polyAuto == null)
	    	 {
	    		 System.out.println("Invalid Choice Select 1 - 2");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(Automobile.NAME);
	    		 System.out.println(polyAuto.getModel());
	    		 System.out.println(polyAuto.getColor());
	    		 System.out.println(polyAuto.getPrice());
	    	 }
	     }
}
