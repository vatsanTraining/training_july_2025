package com.training.tasks;

import java.io.IOException;

public class TaskForJoin implements Runnable {

	@Override
	public void run() {
		System.out.println("Reading");
		
		   try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   
		   System.out.println("Finished Reading");
	}

	
	
	
}
