package com.example.services;

import com.example.model.Customer;

public class CustomerService {

	private  int MAX_SIZE =5;  // constants are written in capital , 
	
	private static int count =0;

	
	private Customer[] custList;

	public CustomerService() {
		super();
		
		this.custList = new Customer[5];
	}

	public CustomerService(Customer[] custList) {
		super();
		this.custList = custList;
	}
	
	/*
	 * First Iteration do with fixed size if it works well
	 * Try Resizing the array
	 */
	
	public boolean add(Customer cust) {
	
		boolean isAdded = false;
		
		if(count==MAX_SIZE) {
			resize(MAX_SIZE *2);  // 5* 2 =10
		}
		  this.custList[count]=cust;
		  isAdded = true;
		  count++;
			
		return isAdded;

	}
	
	
	public boolean add(Customer ...cust) {
		
		return false;
	}
	
	public Customer[] findAll() {
	
		return this.custList;
	}
	
	public Customer findByPhoneNumber(long phoneNumber) {
		
		return null;
	}
	
	public Customer[] findByName(String customerName) {
		
		return null;
	}
	
	private void  resize(int capacity) {  
		
		Customer[] copy = new Customer[capacity];  
        
        for (int i = 0; i < this.custList.length; i++) {
            copy[i] = custList[i];
        }
         this.custList=copy;
         this.MAX_SIZE=capacity;

	}

}
