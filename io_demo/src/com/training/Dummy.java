package com.training;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
		
			throw new NumberFormatException();
		} catch (Exception e) {
			

			System.err.println("Inside catch block");
			

		}
		finally {
			
			System.out.println("Insider Finally Block");
			
		}
		
		System.out.println("Bye Bye ....");
	}

}
