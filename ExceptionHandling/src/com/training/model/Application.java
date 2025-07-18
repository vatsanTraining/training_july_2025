package com.training.model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreditCard ram = new CreditCard(10100, "Ram", 6000);
		
		
		
		System.out.println(ram);
		
		
		CreditCard shyam = new CreditCard();
		try {
			shyam.setCreditLimit(-8000);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		System.out.println(shyam);
		
	}

}
