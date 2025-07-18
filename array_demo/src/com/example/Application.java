package com.example;

import com.example.model.Customer;
import com.example.services.CustomerService;

public class Application {
	
	public static void print(Customer[] list) {
		
		for(Customer eachCustomer:list) {
			System.out.println(eachCustomer.getCustomerId() +"," +eachCustomer.getCustomerName()+","+eachCustomer.getPhoneNumber());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer ram = new Customer(1010,"Ramesh",898383823);
		
		Customer anotherRam = new Customer(1010,"Ramesh",898383823);
		
		Customer yetAnotherRam = anotherRam;
		
		System.out.println("Expected -True:=>"+yetAnotherRam.equals(anotherRam));
		
		System.out.println("Expected -True:=>"+ram.equals(anotherRam));
		
		
		CustomerService service =new CustomerService();
		
		int key =1;
		
		switch (key) {
		case 1:
			service.add(ram);
			break;
		case 2:
			service.findAll();
			break;
		default:
			break;
		}
	}

}
