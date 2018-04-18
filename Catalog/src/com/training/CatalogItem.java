package com.training;

public class CatalogItem {

	private String itemName;
	private String stockUnitIdentifier; 
	private double ratePerUnit;
	
	public CatalogItem() {
		super();
	this.itemName =  "Sony LED TV";
	this.ratePerUnit = 25000;
	this.stockUnitIdentifier = "SNY-BRA-42-2018-101";
	}

	public CatalogItem(String itemName, String stockUnitIdentifier, double ratePerUnit) {

		this.itemName = itemName;
		this.stockUnitIdentifier = stockUnitIdentifier;
		this.ratePerUnit = ratePerUnit;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStockUnitIdentifier() {
		return stockUnitIdentifier;
	}

	public void setStockUnitIdentifier(String stockUnitIdentifier) {
		this.stockUnitIdentifier = stockUnitIdentifier;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		
		if(ratePerUnit<=0)
		{
			System.out.println("invalid value try again");
		   	this.ratePerUnit = Math.abs(ratePerUnit);
		}
		else
		{
		   this.ratePerUnit = ratePerUnit;
		}
	}
	
	public double calculateTax(){
		
		  double tax = ratePerUnit * .05;
		  
		  return tax;
		    
	}
	
}
