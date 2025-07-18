package com.training.tasks;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskOne implements Runnable{
	
	
	 BankAccount  bk1;

			
		    private final BlockingQueue<BankAccount> queue;
		    
		    public TaskOne(BlockingQueue<BankAccount> queue) { 
		    	this.queue = queue; 
		    }

		
		@Override
		public void run() {
			
            BankAccount bank;

	        try {
				while ((queue.take().getBalance())>5000) {
	                //bank.withdraw(4000);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }

		}
		



class TaskTwo implements Runnable{
	
	

			
		    private final BlockingQueue<BankAccount> queue;
		    

		
		public TaskTwo(BlockingQueue<BankAccount> queue) {
				// TODO Auto-generated constructor stub
	    	this.queue = queue; 

			}


		@Override
		public void run() {
			// TODO Auto-generated method stub
			
           try {
        	   
			this.queue.put(new BankAccount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

}



public class BankAccount {

	private double balance=2000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized double deposit(double amount){

		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	balance=balance+amount;


	return balance;
	}

	public synchronized double withdraw(double amount)
	{
	if(balance <amount) {
	System.out.println("In sufficent Balance ");
	
	   try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} else {

	 balance =balance-amount;
	}
	return balance;
	}

	public static void main(String[] args) {
		
         BlockingQueue<BankAccount> queue= new ArrayBlockingQueue<>(10);

    	 BankAccount  bk1 =new BankAccount();

	    ExecutorService executor = Executors.newFixedThreadPool(2); // One producer, one consumer
	    executor.execute(new TaskTwo(queue));
	    executor.execute(new TaskOne(queue));

	    executor.shutdown();



	}
	
	
	
}

