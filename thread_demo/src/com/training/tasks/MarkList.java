package com.training.tasks;
import java.util.*;
public class MarkList {

	
	
	private HashMap<String,Double> marks;
	
	
		public MarkList() {
		super();
		
		this.marks = new HashMap<>();
	}



	public  boolean add(String name,double mark) {
		
		 return this.marks.put(name, mark)!=null?false:true;
	}
	
	public  HashMap<String, Double> findAll() {
		return marks;
	}

}
