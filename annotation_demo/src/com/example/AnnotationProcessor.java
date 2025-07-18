package com.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.management.OperationsException;

import com.example.entity.Book;
import com.example.entity.Employee;
import com.example.strerotype.Table;

public class AnnotationProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee ram = new Employee();
		
		Book java = new Book();
		 Class<?> clsRef= java.getClass();
		 
		Table annoRef =   clsRef.getAnnotation(Table.class);
		
		String tableName =annoRef.name();
		
		System.out.println(tableName);
		
		String sql ="select * from "+tableName;
		
		System.out.println(sql);
		
		String sql2 = "insert into "+tableName+ "values(?,?)";
		
    try {
    	
		Method methodRef= DemoService.class.getMethod("getMessage", String.class);
		
		
		
		System.out.println(methodRef.invoke(new DemoService(),"JD Chem"));
		
		
		Method sqlMethod = DemoService.class.getMethod("createPreparedStatement", String.class);
		
		  System.out.println(sqlMethod.invoke(new DemoService(), sql));
		   
		
	} catch (Exception e) {
		e.printStackTrace();
	} 
		
	}

}
