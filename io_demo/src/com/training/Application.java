package com.training;


import com.training.model.Employee;
import com.training.services.FileService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileService service = new FileService();
		
		
		Employee ram = new Employee(101,"Ramesh kanna",9000, 89898989);
		
		
		   try {
		System.out.println("is Stored"+service.writeObjToFile(ram, new File("employees.ser")));
		
		
		System.out.println("is Stored in Text File:=>"+ service.writeToTextFile(ram, new File("Employee.txt")));
		
		
		 System.out.println("Reading From File :"+service.readObjFromFile(new File("employees.ser")));
		 
		 
		 System.out.println("Reading From Text File");
		 
		 
		 for(Employee eachEmployee:service.readFromTextFile(new File("Employee.txt"))) {
			 
			 System.out.println(eachEmployee);
		 }
		 
		 
		} catch (IOException e) {
			e.printStackTrace();
		}

		   
		   
	}

}
