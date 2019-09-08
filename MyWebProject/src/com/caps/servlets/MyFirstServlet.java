package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Date")
public class MyFirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String firstname=req.getParameter("fname");
		String lastname=req.getParameter("lname");
		out.println("<h1>The current Time is :"+new Date()+"</h1>");
		out.println(firstname +" "+ lastname);
		
	}

}
