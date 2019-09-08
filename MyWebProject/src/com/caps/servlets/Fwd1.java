package com.caps.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fwdServ1")
public class Fwd1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("Got a resp: fwd1");
		RequestDispatcher dispatch = req.getRequestDispatcher("/fwdServ2");
		dispatch.forward(req, resp);
		
		
		/*
		 * Alternate method
		 * ServletContext ctx = getServletContext();
		 * RequestDispatcher dispatch = ctx.getRequestDispatcher("/fwdServ2");
		 * dispatch.forward(req, resp);
		 */
	}
}