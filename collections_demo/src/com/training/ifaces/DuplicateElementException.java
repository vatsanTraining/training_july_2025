package com.training.ifaces;

public class DuplicateElementException extends Exception {

	
	private String message;



	public DuplicateElementException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		return this.message;
		
	}
	
	
	
}
