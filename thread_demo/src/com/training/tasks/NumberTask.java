package com.training.tasks;

public class NumberTask implements Runnable {

	private int countUpTo;

	public NumberTask(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName() +"="+NumberService.count(countUpTo));
	}

}
