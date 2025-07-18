package com.training.tasks;

public class NumberService {

	
	
	public static double count(int countUpTo) {
		
		double total = 0;
		
		for(int i=0;i<=countUpTo;i++) {
			
			total+=i;
		}
		
		return total;
	}
	
	

}
