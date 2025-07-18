package com.example.demo;

public class Student {

	private int rollNumber;
	private String firstName="guest";
	private double markScored;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String firstName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		
		
		this.rollNumber = rollNumber;
	}
	
	
	
}
