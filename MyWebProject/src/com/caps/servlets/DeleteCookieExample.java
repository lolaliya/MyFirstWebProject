package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookie")
public class DeleteCookieExample extends HttpServlet 
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
				if(c.getName().equals("msg"))
				{
					c.setMaxAge(0);
					resp.addCookie(c);
					out.println("Cookie is deleted");
				}
			}
		}
		else
		{
			out.println("Cookie not found");
		}
	}
}
