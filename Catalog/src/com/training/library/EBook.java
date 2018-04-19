package com.training.library;

public class EBook extends LibraryItem {

	private int numberOfTracks;
	private double duration;
	
	public EBook(String itemName, long itemCode, String author, int numberOfTracks, double duration) {
		super(itemName, itemCode, author);
		this.numberOfTracks = numberOfTracks;
		this.duration = duration;
	}
	public EBook() {
		super();
	
	}
	public EBook(String itemName, long itemCode, String author) {
		super(itemName, itemCode, author);
	
	}
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String borrowingTime() {

		  return "2 Weeks";
	}

	
	
	
	
}
