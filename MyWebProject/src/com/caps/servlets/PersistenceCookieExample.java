package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/persistantCookie")
public class PersistenceCookieExample extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

		PrintWriter out = resp.getWriter();
		Cookie cookie = new Cookie("msg", "so_much_work_to_do");
		cookie.setMaxAge(7*3600*24);
		resp.addCookie(cookie);
		out.println("cookie is sent to browser and is persistant");
	}
}
