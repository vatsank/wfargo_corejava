package com.training.exceptions;

public class RangeCheckException extends Exception {

	private String  message;
	
	// Restrict to Create the Object in one and only way 
	
	public RangeCheckException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
	
		return this.message;
	}

	
}
