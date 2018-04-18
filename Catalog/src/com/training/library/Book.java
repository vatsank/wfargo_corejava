package com.training.library;
/**
 * 
 * @author Srivatsan
 * @version 1.0
 */
public class Book {

	private String bookName;
	private String author;
	private double price;
	private int pageCount;
	
	public Book() {
		super();
	
	}

	public Book(String bookName, String author, double price, int pageCount) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.pageCount = pageCount;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
	public String toString(){
		
		return this.bookName + ":"+ this.author + ":" + this.price + ":" + this.pageCount;
	}
	
	
}
