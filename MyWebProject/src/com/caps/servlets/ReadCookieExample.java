package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;		
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieExample extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		Cookie[] cookies = req.getCookies();

		if(cookies !=null )
		{
			for(Cookie c:cookies)
			{
				out.println("Name: "+ c.getName());
				out.println("Value: "+ c.getValue());
				out.println("****************");
			}
		}
		else
		{
			out.println("No cookies found");
		}

	}
}
