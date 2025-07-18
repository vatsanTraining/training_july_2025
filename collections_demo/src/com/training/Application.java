package com.training;

import java.util.*;

import com.training.ifaces.DuplicateElementException;
import com.training.ifaces.ElementNotFoundException;
import com.training.ifaces.Repository;
import com.training.model.Student;
import com.training.repos.StudentRepository;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		StudentService studentService = new StudentService();
		
		
		Student ram = new Student(101,"Anand", 89);
		
		Student yash = new Student(901,"Yash", 59);
		
		Student zhir = new Student(501,"Zahir", 95);
		
		Student baskar = new Student(201,"Baskar", 49);
		
		Student shiv = new Student(701,"Shiv", 77);
		

		Student shiva = new Student(701,"Shiv", 77);

		
		//studentService.addStudent(new String("abcd"));
		
		
		Iterator<Student> itr = studentService.findAllStudent().iterator();
		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
//		
		
		   try {
			   
				System.out.println("is addStudented :=>"+studentService.addStudent(ram));
				studentService.addStudent(baskar);
				studentService.addStudent(yash);
				studentService.addStudent(zhir);
				studentService.addStudent(shiv);
				
			//	studentService.addStudent(shiva);
				
				List<Student> list =studentService.findAllStudent();
				

			System.out.println(studentService.findStudentByRollNumber(101));
			
			
			List<Student> sortedList =studentService.sortByName();
		
			System.out.println("SORTED BY NAME");
			for (Student student : sortedList) {
				
				System.out.println(student);
			}
					
		
			List<Student> sortedList2 =studentService.sortByField("rollnumber");
			
			System.out.println("SORTED BY ROLL NUMBER");
			for (Student student : sortedList2) {
				
				System.out.println(student);
			}
		
        List<Student> sortedList3 =studentService.sortByField("markscored");
			
			System.out.println("SORTED BY MARK SCORED");
			for (Student student : sortedList3) {
				
				System.out.println(student);
			}
			
					
		} catch (ElementNotFoundException | DuplicateElementException  e) {
			e.printStackTrace();
		}
		   
		   List<String> names = new ArrayList<>();
		   
		   
		   names.add("Ram");
		   names.add("Shyam");
		   
		   Collections.sort(names);
		   
		   
		   
		
	}

}
