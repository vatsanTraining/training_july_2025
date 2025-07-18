package com.example.utils;
import java.sql.*;
import java.util.ResourceBundle;
public class MySqlConnection {

	
	
	public static Connection getMySqlConnection() throws SQLException{
		
		
		   ResourceBundle bundle=ResourceBundle.getBundle("resources/application");
		   
		   
		
		return DriverManager.getConnection(bundle.getString("jdbc.url"), bundle.getString("jdbc.username"), bundle.getString("jdbc.password"));
	}
	
	

}


