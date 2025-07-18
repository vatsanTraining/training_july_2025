package com.training.tasks;

public class UsingPrintService implements Runnable {

	
	private String first;
	private String second;
	
	
	public UsingPrintService(String first, String second) {
		super();
		this.first = first;
		this.second = second;
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

		PrintService.print(first, second);
	}

}
