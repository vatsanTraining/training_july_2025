package com.training.tasks;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Main Starting");
		
		
		Thread thread = new Thread(new TaskForJoin());
		
		thread.start();
		
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main Finished");
	}

}
