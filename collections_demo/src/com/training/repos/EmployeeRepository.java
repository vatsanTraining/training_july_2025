package com.training.repos;

import java.util.List;

import com.training.ifaces.ElementNotFoundException;
import com.training.ifaces.Repository;
import com.training.model.Employee;

public class EmployeeRepository implements Repository<Employee> {

	@Override
	public boolean add(Employee stud) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int id) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int id) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
