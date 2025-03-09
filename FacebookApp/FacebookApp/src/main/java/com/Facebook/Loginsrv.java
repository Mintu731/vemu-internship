package com.Facebook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Loginsrv
 */
@WebServlet("/Loginsrv")
public class Loginsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginsrv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//General Settings
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();// to print output on console we use PrintWriter
		
		//Request Data Gathering Logic
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		//Business logic
		if(uname.equals("admin") && pass.equals("admin123")) {
			pw.println("Welcome Admin");
			}
		else {
			pw.println("Check Your Details ");
		}
			

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
