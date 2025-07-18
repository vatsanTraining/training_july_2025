package com.training.model;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private int employeeId;
	private String employeeName;
	private double salary;
	private transient long phoneNumber;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String employeeName, double salary, long phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return  employeeId + ","+ employeeName+"," + salary+","+phoneNumber;
	}
	
	
	
}
