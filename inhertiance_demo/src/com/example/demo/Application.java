package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(new Doctor(101,"Ramesh","male"));
		
		
		InsuranceService service = new InsuranceService();
		
		service.printPremium(new LifeInsurance());
		
		
		service.printPremium(new HealthInsurance());
		
		
	}

}
