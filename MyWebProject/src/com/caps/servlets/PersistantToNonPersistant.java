package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pton")
public class PersistantToNonPersistant extends HttpServlet 
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
					c.setMaxAge(-1);
					resp.addCookie(c);
					out.println("Cookie is now non persistant");
				}
			}
		}
		else
		{
			out.println("Cookie not found");
		}
	}
}
