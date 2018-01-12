package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/HelloServlet")	//확인!!!!!
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
		doGet(request, response);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		response.setContentType("text/HTML; charset=UTF-8");
		PrintWriter out = response.getWriter();	
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("mkjin12") && pwd.equals("1234")){
			//id와 pwd가 일치하는 경우
			response.sendRedirect("/main.html");
		}else{
			//id와 pwd가 일치하지않는 경우
			request.setAttribute("msg", "id 또는 비밀번호가 틀립니다.");
			RequestDispatcher reqDis = request.getRequestDispatcher("/NewLogin.jsp");
			reqDis.forward(request, response);
		}
		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>");
//		out.println("Hello!!!");
//		Date d = new Date();
//		out.println(d);
//		out.println("<h1>Hello, "+id+".</h1>");
//		out.println("<h1>Your password is "+pwd+".</h1>");
//		out.println("");
//		out.println("</h1>");
//		out.println("</body>");
//		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
