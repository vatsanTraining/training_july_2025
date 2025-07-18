package com.training;

import com.training.model.CreditCard;
import com.training.services.CreditCardService;

public class Application {

	public static void print(CreditCard[] list) {
		
		
		
   for(CreditCard eachCard:list) {
			   
			   if(eachCard==null) {
				   System.out.println("Element not found in location");
			   } else {
				   System.out.println(eachCard.getCardHolderName() + eachCard.getCreditLimit());

			   }
		   }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreditCardService service=new CreditCardService();
	
		boolean response=service.add(new CreditCard(101010, "Ramesh", 400000));
		System.out.println("Is Added"+response);

		System.out.println(service.add(new CreditCard(201010, "Magesh", 500000)));
		System.out.println(service.add(new CreditCard(301010, "Suresh", 600000)));

		int[] marks = {10,20,30};
		
		for(int eachItem:marks) {
			System.out.println(eachItem);
		}
		System.out.println(marks);
		
		   CreditCard[]   list=service.findAll();
		   
				   print(list);
		   
		   CreditCard card8=new CreditCard(5050, "Vishal", 600000);
		   
		   
		   CreditCard card9=new CreditCard(6050, "Vikram", 700000);

		   CreditCard card10=new CreditCard(89090, "vedhal", 800000);

		   //CreditCard[] list2 = {card8,card9};
		   
		   CreditCard[] list2 = new CreditCard[4];
		   
		   
		   CreditCardService service2 = new CreditCardService(list2);
		   
		   System.out.println(service2.add(card10));
		   System.out.println(service2.add(card9));
		   System.out.println(service2.add(card8));
		   
		     CreditCard[] list3 = service2.findAll();

		       print(list3);
		       
	
		     
	}

}
