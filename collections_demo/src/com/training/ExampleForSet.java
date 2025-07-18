package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Employee;

public class ExampleForSet {

	
	private Set<Employee> hashSet;
	
	private Set<Employee> treeSet;
	
	
	
	
	public ExampleForSet() {
		super();		
		this.hashSet = new HashSet<>();
		this.treeSet = new TreeSet<>();
		
	
	}
	public boolean addToHashSet(Employee emp) {
		
		return this.hashSet.add(emp);
		
	}
	
public boolean addToTreeSet(Employee emp) {
		
		return this.treeSet.add(emp);
		
	}

public void print(Set<Employee> set) {
	
	for (Employee employee : set) {
		
		System.out.println(employee);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee ram = new Employee(101, "Ram", 90000);
		Employee shyam = new Employee(102, "Shyam", 9000);
		Employee shiv= new Employee(103, "Shiv", 1900);
		Employee praveen= new Employee(104, "Praveen", 29000);

		Employee raveen= new Employee(104, "Praveen", 29000);


		ExampleForSet obj = new ExampleForSet();
		
		obj.addToHashSet(praveen);
		obj.addToHashSet(shiv);
		obj.addToHashSet(shyam);
		obj.addToHashSet(ram);
		obj.addToHashSet(raveen);
		
		
		obj.print(obj.hashSet);
		
		System.out.println(obj.hashSet.size());
		
		
		obj.addToTreeSet(praveen);
		
		
		
		obj.addToTreeSet(shiv);
		obj.addToTreeSet(shyam);
		obj.addToTreeSet(ram);
		obj.addToTreeSet(raveen);
		
		
		obj.print(obj.treeSet);
		
		System.out.println(obj.treeSet.size());
		
		
		
	}

}
