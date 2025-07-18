
package com.training.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.utils.MySqlConnection;
import com.training.ifaces.Dao;

public class StudentDaoImpl implements Dao<Student> {

	private Connection con;
	
	
	
	


	String INSERT = "insert into student values(?,?,?,?)";
	String FINDALL ="select * from student";
	String FINDBYID="select * from student where roll_number=?";
	String DELETE ="delete from student where roll_number=?";
	String UPDATE = "update student SET first_name=? ,date_of_Birth=? ,mark_scored=? where roll_number=?";
	
	public StudentDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Student t) throws SQLException {
		
		PreparedStatement pstmt	=con.prepareStatement(INSERT);
		
		pstmt.setInt(1, t.getRollNumber());
		pstmt.setDate(2, Date.valueOf(t.getDateOfBirth()));
		pstmt.setString(3,t.getFirstName());
		pstmt.setDouble(4, t.getMarkScored());
		
		int rowAdded = pstmt.executeUpdate();
		
		return rowAdded==1?true:false;
	}

	@Override
	public Student findById(int id) throws SQLException {
		
		PreparedStatement pstmt	=con.prepareStatement(FINDBYID);
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		Student obj =null;
		if(rs.next()) {
			
			obj = mapperRowToObject(rs);
		}

		return obj;
	}

	@Override
	public List<Student> findAll() throws SQLException {
		// TODO Auto-generated method stub
		
	PreparedStatement pstmt	=con.prepareStatement(FINDALL);
	
	        ResultSet result=pstmt.executeQuery();
	        
	        List<Student> list = new ArrayList<>();
	    
	        while(result.next()) {
	        	
	        	list.add(mapperRowToObject(result));
	        }
		
	
		return list;
	}

	@Override
	public boolean delete(Student t) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement pstmt	=con.prepareStatement(DELETE);
		
		pstmt.setInt(1, t.getRollNumber());
		
          int rowDeleted = pstmt.executeUpdate();
		
		return rowDeleted==1?true:false;
		
	}

	@Override
	public Student update(Student t) throws SQLException {
		
		PreparedStatement pstmt	=con.prepareStatement(UPDATE);
		
		pstmt.setString(1,t.getFirstName());
		pstmt.setDate(2, Date.valueOf(t.getDateOfBirth()));
		pstmt.setDouble(3, t.getMarkScored());
		pstmt.setInt(4, t.getRollNumber());

		int rowUpdated = pstmt.executeUpdate();
		
		return rowUpdated==1?findById(t.getRollNumber()):null;

	
	}
	
	private Student mapperRowToObject(ResultSet result) throws SQLException {
		
    	int rollNumber=result.getInt("roll_number");
    	String firstName=result.getString("first_name");
    	Date dob=result.getDate("date_of_birth");
    	
    	LocalDate dateOfBirth=dob.toLocalDate();
    	double markScored=result.getDouble("mark_scored");
    	
    	
    	Student student = new Student(rollNumber, firstName, markScored, dateOfBirth);

    	return student;
	}

         
}
