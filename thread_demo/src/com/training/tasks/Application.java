package com.training.tasks;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SimpleTask printTask = new SimpleTask();
		
		
		Thread threadOne =new Thread(printTask,"selva");
		
		Thread threadTwo =new Thread(printTask,"vijay");
		
		Thread threadThree =new Thread(printTask,"ajith");
		
		
		threadOne.start();
		
		threadTwo.start();
		
		threadThree.start();
		
		
		//printTask.run(); should not call run method directly it should be called by a thread scheduler
	}

}
