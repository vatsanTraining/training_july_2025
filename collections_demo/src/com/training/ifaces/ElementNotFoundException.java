package com.training.ifaces;

public class ElementNotFoundException extends Exception {

	
	private String message;

	public ElementNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {

		return "ERR-104-"+ this.message;
	}
	
	
}
