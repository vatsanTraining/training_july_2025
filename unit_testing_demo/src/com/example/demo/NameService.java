package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class NameService {

	
	List<String> nameList;
	
	
	public NameService() {
		super();
		// TODO Auto-generated constructor stub
		
		this.nameList=new ArrayList<>();
		
		this.nameList.add("Ram");
		this.nameList.add("shiv");
		this.nameList.add("mages");
		this.nameList.add("praveen");
		this.nameList.add("satish");

	}


	public String getBestName() {
		
		return nameList.get(2);
	}
	
	
	public List<String> getNames(){
		
		
		return nameList;
	}
	
	
	public List<Integer> namesLength(){
		
		return null;
	}
	
	public String getElementInLastPostition() {
		
		
		return null;
		
	}
	
	
	public boolean getResult(String mark) {
		
		Integer intMark=null;
		try {
			
			 intMark = Integer.parseInt(mark);

		} catch (NumberFormatException e) {
		
			System.out.println("Invalid Number");
		}
		
		
		
		return intMark>60;
		
		
	}
	
	
}
