package com.training.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Employee;

public class FileService {

	
	public boolean writeObjToFile(Employee emp , File file) throws IOException{
	
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		
		out.writeObject(emp);
		
		out.close();
		
		return true;
	}
	
	public Employee readObjFromFile(File file) {
		
		
		ObjectInputStream in = null;
		Employee employee = null;
		try {
			
			 in = new ObjectInputStream(new FileInputStream(file));
			
			  employee = (Employee) in.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}


		
		return employee;
		
	}
	
	public boolean writeToTextFile(Employee emp , File file) throws IOException {
		
		
		PrintWriter writer = new PrintWriter( new FileWriter(file, true));
		
		writer.println(emp);
		
		writer.close();
		
		
		return true;
	}
	
	public List<Employee> readFromTextFile(File file) {
		
		// try with resource
		
		Employee emp=null;
		List<Employee> list = new ArrayList<>();

		
		try (		BufferedReader reader = new BufferedReader(new FileReader(file));
) {
			String line;
		while( (line=reader.readLine())!=null) {
			
			  String[] values   =line.split(",");
			  
			  emp = new Employee(Integer.parseInt(values[0]),values[1],Double.parseDouble(values[2]),Long.parseLong(values[3]));
			  
			  list.add(emp);
			     
		}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return list;
	}
}
