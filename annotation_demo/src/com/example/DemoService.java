package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoService {

	
	Connection con ;
	public DemoService() {
		
		 try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandhata","root","srivatsan");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	
	public String getMessage(String name) {
		
		return "Welcome "+name;
	}
	
	public PreparedStatement createPreparedStatement(String sql) {
		
		PreparedStatement pstmt=null;
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 return pstmt;
	}
}
