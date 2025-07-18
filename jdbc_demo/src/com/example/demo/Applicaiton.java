package com.example.demo;

import com.example.demo.entity.Student;
import com.example.utils.MySqlConnection;
import com.training.dao.impl.StudentDaoImpl;
import com.training.ifaces.Dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
public class Applicaiton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int key = Integer.parseInt(args[0]);
		
		Connection con;
		try {
			con = MySqlConnection.getMySqlConnection();
			Dao dao = new StudentDaoImpl(con);

			switch (key) {
			case 1:
				dao.findAll().forEach(System.out::println);
				break;
			case 2:
				System.out.println(dao.findById(102));
				break;
			case 3:
				 System.out.println("Is Added"+ dao.add(new Student(789, "Dj", 100, LocalDate.of(2003, Month.OCTOBER, 26))));
				break;
			case 4:
				 System.out.println(dao.delete(new Student(789, "Dj", 100, LocalDate.of(2003, 10, 26))));
				break;
				case 5:
					System.out.println("Updated :=>" +dao.update(new Student(789, "Dj", 98, LocalDate.of(2002, 10, 26))));
					break;
			default:
				break;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
