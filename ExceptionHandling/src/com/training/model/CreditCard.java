package com.training.model;

public class CreditCard {

	
	private long cardNumber;
	private String cardHolderName;
	private double creditLimit;
	
	
	
	public CreditCard() {
		super();
	}



	public CreditCard(long cardNumber, String cardHolderName, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		
		if(creditLimit<0) {
			throw new RuntimeException("Credit Limit should not be negative");
			
		} else {
		this.creditLimit = creditLimit;
		}
	}



	public long getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}



	public String getCardHolderName() {
		return cardHolderName;
	}



	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}



	public double getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(double creditLimit) throws Exception {
		
		if(creditLimit<0) {
			throw new Exception("Credit Limit should not be negative"); 
		} else {
		this.creditLimit = creditLimit;
		}
	}



	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", creditLimit="
				+ creditLimit + "]";
	}
	
	
	
}
