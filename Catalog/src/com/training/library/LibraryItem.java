package com.training.library;

public abstract class LibraryItem {

	private String itemName;
	private long itemCode;
	private String author;
	
	
	public LibraryItem() {
		super();
	}


	public LibraryItem(String itemName, long itemCode, String author) {
		super();
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.author = author;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public long getItemCode() {
		return itemCode;
	}


	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "LibraryItem [itemName=" + itemName + ", itemCode=" + itemCode + ", author=" + author + "]";
	}


	public abstract String borrowingTime();
}
