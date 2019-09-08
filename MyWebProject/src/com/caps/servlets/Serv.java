package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv")
public class Serv extends HttpServlet implements SingleThreadModel {
	
	
	public Serv() {
		System.out.println("Instantiation Pahse: Servlet Created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init Phase: Servlet got Initialized");
	}
	
	 
	@Override
	protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Hello World");
		
		synchronized(this){
			//line 1
			//line 2
			//line 3
		}
		
		System.out.println("inside service()");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Bye Bye World. :( ");
	}
	
}