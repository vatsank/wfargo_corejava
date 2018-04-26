package com.training.poly.example2.domains;

public abstract class Item {

	private long itemNumber;
	private String itemName;
	
	
	public abstract double estimate();
	
	public String show(){
		return "Rentals";
	}

	public Item(long itemNumber, String itemName) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
	}

	public long getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
