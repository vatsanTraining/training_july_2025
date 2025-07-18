package com.training.model;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	
	private int employeeId;
	private String employeeName;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		return employeeName.compareTo(obj.employeeName);
	}
	
	
	
}

//
//
//// Create a Java Class With Main Method
//
//Store the details of the employee in a HashSet and print them
//
//Store the same details in Treeset and print 
//
//observe the results
//
//Try adding elements with same id,name,and salary and observe the result


