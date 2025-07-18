package com.training.tasks;
import java.util.*;
public class MarkListTask implements Runnable {

	
	private static MarkList  list= new MarkList();
;
	
	private List<String> names;
	private List<Double> marks;
	
	



	public MarkListTask() {
	}

	public MarkListTask( List<String> names, List<Double> marks) {
		super();
		this.names = names;
		this.marks = marks;
		
	}

	@Override
	public void run() {

		for(int i=0;i<names.size();i++) {
		    System.out.println("Is Added :=>"+list.add(names.get(i), marks.get(i)));
		    
		}
		
	}
   public  void print() {
	   for(Map.Entry<String,Double> item: list.findAll().entrySet()) {
		   System.out.println(item.getKey() +"," +item.getValue());
	   }
   }
}
