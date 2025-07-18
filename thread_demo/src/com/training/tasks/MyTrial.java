package com.training.tasks;

public class MyTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumberTask tenCount = new NumberTask(10);
		
		NumberTask hundredCount = new NumberTask(100);

		NumberTask thousandCount = new NumberTask(1000);

		Thread thread1 = new Thread(tenCount,"Ten counter");
		
		thread1.start();
		

		Thread thread2 = new Thread(hundredCount,"hundred counter");
		
		thread2.start();
		
		

		Thread thread3 = new Thread(thousandCount,"thousand counter");
		
		thread3.start();
	}

}
