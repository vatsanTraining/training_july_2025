package com.training.services;
import com.training.model.*;

public class CreditCardService {
	
	private CreditCard[] cardList;
	
	private int idxPos =0;

	public CreditCardService() {
		super();
		
		this.cardList = new CreditCard[4];
	}

	public CreditCardService(CreditCard[] cardList) {
		super();
		this.cardList = cardList;
	}
	

	public  boolean add(CreditCard card) {
		System.out.println(this.cardList.length);
		
		this.cardList[idxPos]=card;
		idxPos++;
		System.out.println(this.cardList.length);

		return true;
	}
	
	public CreditCard[]  findAll(){
		   
		   return this.cardList;
	   }
}
