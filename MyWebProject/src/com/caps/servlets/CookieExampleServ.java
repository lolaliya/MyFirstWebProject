package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookie")
public class CookieExampleServ extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		Cookie cookie = new Cookie("Name", "Loka");
		resp.addCookie(cookie);
		Cookie cookie1 = new Cookie("Email", "abc123@def.xyz");
		resp.addCookie(cookie1);
		Cookie cookie2 = new Cookie("Address", "Bangalore_Karnataka");
		resp.addCookie(cookie2);
		out.println("cookies are stored in browser");
	}
}
