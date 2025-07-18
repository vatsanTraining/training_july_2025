package com.training.tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableAndFuture {

	
	public static void versionOne() {
		
ExecutorService service = Executors.newFixedThreadPool(4);
		
		CountingTask[] tasks = {new CountingTask(10),new CountingTask(100),new CountingTask(1000)};
		
		
		try {
			
			for(CountingTask eachTask : tasks) {
				
			Future<Double>	response=service.submit(eachTask);
			
			   
			  System.out.println(response.get());
			  
			}
			//System.out.println(response.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		service.shutdown();
		
	
	}
	public static void versionTwo() {
		
		
ExecutorService service = Executors.newFixedThreadPool(4);
		
		CountingTask[] tasks = {new CountingTask(10),new CountingTask(100),new CountingTask(1000)};
		
		
		try {
			
			for(CountingTask eachTask : tasks) {
				
			Future<Double>	response=service.submit(eachTask);
			
			   
			while(!response.isDone()) {
				
				System.out.println("Waiting for Response.....");
				
			    TimeUnit.SECONDS.sleep(12);
					  
			}
			  
			  System.out.println(response.get());

			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		service.shutdown();
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//versionOne();
		versionTwo();
			
	}

}
