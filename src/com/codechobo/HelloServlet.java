package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/HelloServlet")	//Ȯ��!!!!!
@WebServlet(name="/HelloServlet", urlPatterns={"/Hello", "*.do", "/login/*"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		PrintWriter out = response.getWriter();	
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello!!!");
		Date d = new Date();
		out.println(d);
		out.println("<h1>Hello, "+id+".</h1>");
		out.println("<h1>Your password is "+pwd+".</h1>");
		out.println("<h1>count="+ ++count +".</h1>");
		out.println("");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
