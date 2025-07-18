package com.training;

import com.example.demo.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram = new Student();
	
		/*
		 * 
		 */
	
		System.out.println(ram.getFirstName() + ram.getMarkScored());  //
		
		//ram.rollNumber =45;  
		
		//ram.setRollNumber(9000);
		
		ram.setFirstName("Ramesh");
		ram.setRollNumber(1023);
		ram.setMarkScored(60);
		
		System.out.println(ram.getFirstName() + ram.getMarkScored());  //
		
		
		Student shyam = new Student(1003,"Shyam",90);
		
		System.out.println(shyam.getFirstName() + shyam.getMarkScored()); // shyam 90

	}

}
