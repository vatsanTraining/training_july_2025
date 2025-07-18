package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

	private int rollNumber;
	private String firstName;
	private double markScored;
	private LocalDate dateOfBirth;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String firstName, double markScored, LocalDate dateOfBirth) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		this.dateOfBirth = dateOfBirth;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, firstName, markScored, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScored=" + markScored
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
}


