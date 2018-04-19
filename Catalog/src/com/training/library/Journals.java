package com.training.library;

public class Journals extends LibraryItem {

	private String publisher;
	private String category;
	public Journals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Journals(String itemName, long itemCode, String author) {
		super(itemName, itemCode, author);
		// TODO Auto-generated constructor stub
	}
	public Journals(String itemName, long itemCode, String author, String publisher, String category) {
		super(itemName, itemCode, author);
		this.publisher = publisher;
		this.category = category;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String borrowingTime() {
		
		return "Initially" + "3 Weeks"+ "extendable by"+" 1 Week";
		
	}
	
	
}
