package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.training.model.Employee;
import com.training.model.Student;


public class ExampleForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Doctor, List<Patient>> hospital = new HashMap<>();
		
		List<Patient> patlist = new ArrayList<>();
		
		 patlist.add(new Patient(100,"ram"));
		 patlist.add(new Patient(101,"Shiv"));
		 
		List<Patient> list2 =List.of(new Patient(100,"ram"),new Patient(101,"Shiv"));  //  creates unmodifiable collection
		 
		list2.add(new Patient(102,"jd"));

		
		 
		
		 Doctor ravi = new Doctor(999,"Ravi");
		 
		 hospital.put(ravi, patlist);
		 
		 
		      hospital.get(ravi);
		      
		      
		
		HashMap<Integer, Employee> map = new HashMap<>();
		
	
		
		Employee ram = new Employee(101, "Ram", 90000);
		Employee shyam = new Employee(102, "Shyam", 9000);
		Employee shiv= new Employee(103, "Shiv", 1900);
		Employee praveen= new Employee(104, "Praveen", 29000);

		
		map.put(1001,ram );
		map.put(Integer.valueOf(1020), praveen);
		map.put(303, shiv);
		
		System.out.println("From Map=>"+map.get(1020));
	
		  //Set<Integer>;
		  
		  Set<Map.Entry<Integer, Employee>>  setView=map.entrySet();
		  
		 
		  
		 for (Entry<Integer, Employee> entry : setView) {
		
			 System.out.println(entry.getKey() + ","+entry.getValue());
		}
	
		 
		     map.values();
	}

}




