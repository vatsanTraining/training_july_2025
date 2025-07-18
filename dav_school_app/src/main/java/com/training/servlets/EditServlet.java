package com.training.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.utils.MySqlConnection;
import com.training.dao.impl.StudentDaoImpl;
import com.training.ifaces.Dao;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	Dao<Student> dao;
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        try {
			dao = new StudentDaoImpl(MySqlConnection.getMySqlConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int numberToEdit = Integer.parseInt(request.getParameter("id"));
		
		try {
			Student toEdit =dao.findById(numberToEdit);
			
			request.setAttribute("obj", toEdit);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("editstudent.jsp");
		dispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rollNumber	=Integer.parseInt(request.getParameter("rollNumber"));
		String firstName=request.getParameter("firstName");
		LocalDate dateOfBirth=LocalDate.parse(request.getParameter("dateOfBirth"));
		double markScored=Double.parseDouble(request.getParameter("markScored"));
		
		
		try {
			Student edited =dao.update(new Student(rollNumber, firstName, markScored, dateOfBirth));
			request.setAttribute("list", List.of(edited));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);

		
		
		
	}

}
