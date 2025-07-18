package com.example.demo;

public class ConverterService {

	private static final double USDRATE = 80.00;
	
	public double inrToUsd(double inr){
		
		return inr*USDRATE;
	}
	
public double inrToUsd(double inr,double usdRate){
		
		return inr * usdRate;
	}
	
}
