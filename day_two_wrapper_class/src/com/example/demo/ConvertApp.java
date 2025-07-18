package com.example.demo;

import java.util.Scanner;

public class ConvertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConverterService service = new ConverterService();
		
		service.inrToUsd(45);
		service.inrToUsd(Double.parseDouble(args[0]));
		
		Scanner sc = new Scanner(System.in);
		
		double inr =sc.nextDouble();
		
		service.inrToUsd(inr);
		
		double usRate =sc.nextDouble();
		
		service.inrToUsd(inr, usRate);
		
		sc.close();
	}

}
