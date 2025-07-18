package com.training.tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Application {

	
	public static void usingSingleThread() {
	
		ExecutorService service = 
				Executors.newSingleThreadExecutor();
				
		service.submit(new UsingPrintService("Ganga","Yamuna"));
		service.submit(new UsingPrintService("Kavery","Kabini"));
		service.submit(new UsingPrintService("Narmada","Thapthi"));
		
		
		service.shutdown();
	
	}
	
	public static void usingMultiThread() {
		
		
		ExecutorService service = 
				Executors.newFixedThreadPool(5);
				
		service.submit(new UsingPrintService("Ganga","Yamuna"));
		service.submit(new UsingPrintService("Kavery","Kabini"));
		service.submit(new UsingPrintService("Narmada","Thapthi"));
		
		
		service.shutdown();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		       // usingSingleThread();
				usingMultiThread();
		
	}

}
