package com.training;

public class TestCatalogItem {

	public static void main(String[] args) {

		CatalogItem tv = new CatalogItem();
		
		System.out.println("Tax :="+tv.calculateTax());
		
		
		CatalogItem washMachine = new CatalogItem("WashingMachine", "LG-XT101-2018-120",13000);
		
		System.out.println("Washing Machine Tax :="+ washMachine.calculateTax());
		
		CatalogItem lappys = new CatalogItem();
		
		  lappys.setItemName("Laptop");
		  lappys.setRatePerUnit(-34000);
		  lappys.setStockUnitIdentifier("DL-INS-2017-230");
		  
		  System.out.println("Laptap Tax :="+lappys.calculateTax());
		  
		  
	}

}
