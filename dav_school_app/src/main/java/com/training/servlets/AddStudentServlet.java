package com.training.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.demo.entity.Student;
import com.example.utils.MySqlConnection;
import com.training.dao.impl.StudentDaoImpl;
import com.training.ifaces.Dao;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private Dao<Student> dao;

    public AddStudentServlet() throws SQLException {
        super();
        // TODO Auto-generated constructor stub
        
		 dao = new StudentDaoImpl(MySqlConnection.getMySqlConnection());

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 int rollNumber	=Integer.parseInt(request.getParameter("rollNumber"));
		String firstName=request.getParameter("firstName");
		LocalDate dateOfBirth=LocalDate.parse(request.getParameter("dateOfBirth"));
		double markScored=Double.parseDouble(request.getParameter("markScored"));
		
		
		try {
			boolean result =dao.add(new Student(rollNumber, firstName, markScored, dateOfBirth));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("result", "One Student Added");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);

		//doGet(request, response);
	}

}
