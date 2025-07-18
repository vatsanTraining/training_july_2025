package com.training;

import com.training.utils.PolicyType;

public class MiscDemo {
	
	//var args
	
	
	public static void print(String name, int ...marks) {
	
		System.out.println("Student Name"+name);
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
	}
	// enums
	
	
	// stringbuilder / stringbuffer

	
	
	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]);  //args1
		System.out.println(args[1]);  //args2
		
		print("Ram",50,60);
		print("shyam",89,90,100);
		
		PolicyType t =PolicyType.FIRE;
		
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("JRD").append("Tata").append("Famous industrialist aged ").append(89);
		
		buffer.toString();
	}

}
