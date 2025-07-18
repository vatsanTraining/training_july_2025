package com.training.tasks;

public class SimpleTask implements Runnable {

	@Override
	public void run() {

		
		for(int i =0;i<=5;i++) {
			System.out.println(i + " == Printed by Thread"+Thread.currentThread().getName());
		}
	}

}
