package com.training.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.utils.MySqlConnection;
import com.mysql.cj.MysqlConnection;
import com.training.dao.impl.StudentDaoImpl;
import com.training.ifaces.Dao;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private Dao dao;
    public WelcomeServlet() throws SQLException {
        super();
        // TODO Auto-generated constructor stub
        
		 dao = new StudentDaoImpl(MySqlConnection.getMySqlConnection());

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("<h1 style='text-align:center'>DAV Public School</h1>");
		
		request.setAttribute("title", "DAV Public School");
		try {
			request.setAttribute("list",dao.findAll());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int id = Integer.parseInt(request.getParameter("rollNumber"));
		
		
		try {
			Student found =(Student)dao.findById(id);
			request.setAttribute("list",List.of(found));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
		
	}

}
