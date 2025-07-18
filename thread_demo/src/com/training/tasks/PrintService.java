package com.training.tasks;

public class PrintService {

	
	
	public static synchronized void print(String first ,String second) {
		
		System.out.println(first);
		
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		  System.out.println(second);
	}
}
