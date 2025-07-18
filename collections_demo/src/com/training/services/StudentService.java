package com.training.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.DuplicateElementException;
import com.training.ifaces.ElementNotFoundException;
import com.training.model.Student;
import com.training.repos.StudentRepository;
import com.training.utils.MarkComparator;
import com.training.utils.RollNumberComparator;

public class StudentService {

	
	private StudentRepository repo;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
		
		this.repo =new StudentRepository();
	}
	
	
	
	public boolean addStudent(Student student) throws DuplicateElementException{
	
		boolean response =false;
//		try {
			response = this.repo.add(student);
//		} catch (DuplicateElementException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	  return response;
	}
	
	
	public List<Student>   findAllStudent() {
		
		return this.repo.findAll();
		
	}
	
	public Student findStudentByRollNumber(int rollNumber) throws ElementNotFoundException {
		
		return this.repo.findById(rollNumber);
	}
	
	
	public List<Student> sortByName(){
		
		List<Student> list = repo.findAll();
		
		Collections.sort(list);
		
		return list;
		
	}
	
	public List<Student> sortByField(String field){
		
		Comparator<Student> comparator=null;
		
		switch (field.toLowerCase()) {
		case "rollnumber":
			comparator= new RollNumberComparator();
			break;
		case "markscored":
			comparator = new MarkComparator();
		default:
			break;
		}
		
    List<Student> list = repo.findAll();
		
		Collections.sort(list,comparator);
		
		return list;
		
	}
}
