package com.training.repos;


import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.DuplicateElementException;
import com.training.ifaces.ElementNotFoundException;
import com.training.ifaces.Repository;
import com.training.model.Student;

public class StudentRepository implements Repository<Student> {
	
	
	private List<Student> studList;
	



	public StudentRepository() {
		super();
		this.studList = new ArrayList<>();
		
	}



	

	@Override
	public boolean add(Student stud) throws DuplicateElementException {
		// TODO Auto-generated method stub
		
		if(this.studList.contains(stud))  {
			throw new DuplicateElementException("Student with id "+ stud.getRollNumber() + "Already Exisit");
		} else {
		return this.studList.add(stud);
		}
	}





	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.studList;
	}





	@Override
	public Student findById(int id) throws ElementNotFoundException {
		
		boolean found = false;
		Student foundStudent = null;
				
	
		for(Student eachStudent: this.studList) {
			
			if(eachStudent.getRollNumber()==id) {
				foundStudent = eachStudent;
			}
		}
		
		  if (foundStudent!=null) {
			  return foundStudent;
		  } else {
				  throw new ElementNotFoundException("Student With Id "+id+ "-not found");
			  }
		  }
		  
	





	@Override
	public boolean remove(int id) throws ElementNotFoundException {
		
		return this.studList.remove(findById(id));
		
	}

	
	
	
}
