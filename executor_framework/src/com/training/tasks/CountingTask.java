package com.training.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CountingTask implements Callable<Double> {

	private double countTo;
	
	
	
	public CountingTask(double countTo) {
		super();
		this.countTo = countTo;
	}



	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		
		double result =0.0;
		
		for(int i=0;i<=countTo;i++) {
			result+=i;
		}
		
		//Thread.sleep(100);
		
		    TimeUnit.SECONDS.sleep(10);
		
		return result;
	}

}
