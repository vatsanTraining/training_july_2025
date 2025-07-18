package com.training.servlets;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AsyncServletDemo
 */

@WebServlet(urlPatterns = {"/async"}, 
asyncSupported = true)

public class AsyncServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  @Override
	  protected void doGet(
	          HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	    long startTime = System.nanoTime();
	    long id = Thread.currentThread().getId();
	    System.out.println("Entering doGet() - threadId: " + id);
	    AsyncContext ac = request.startAsync();
	    ac.start(new Runnable() {
	      @Override
	      public void run() {
	        try {
	          System.out.println("Start Thread after "+
	                  (double)(System.nanoTime()-startTime)/1000000000+" sec." );
	          int delayTime = 5;
	          Thread.sleep(delayTime * 1000);
	          ac.getResponse().setContentType("text/html");
	          PrintWriter out = ac.getResponse().getWriter();
	          out.println("You should see this after a brief wait");
	          out.println("Look as well into the server log.");
	          ac.complete();
	          System.out.println("End Thread after "+
	                  (double)(System.nanoTime()-startTime)/1000000000+" sec." );
	        } catch (InterruptedException ex) {
	          System.out.println(ex.getMessage());
	        } catch (IOException ex) {
	          System.out.println(ex.getMessage());
	        }
	      }
	    });
	    System.out.println("Leaving doGet() after "+
	            (double)(System.nanoTime()-startTime)/1000000000+" sec." );
	  }

}
