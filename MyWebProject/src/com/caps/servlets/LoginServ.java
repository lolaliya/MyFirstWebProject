package com.caps.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caps.beans.User;
import com.caps.services.UserServicesImpl;

@WebServlet("/loginServ")
public class LoginServ extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("user_id");
		String password = req.getParameter("passwd");
		System.out.println(uid);
		System.out.println(password);
		UserServicesImpl services = new UserServicesImpl();
		User user=services.login(Integer.parseInt(uid), password);
		PrintWriter out=resp.getWriter();
         if(user != null)
         {
        	 out.print("<h1>login succesful </h1>");
        	 out.println(user);
        }else
        	 out.println("<h1> login failed</h1>");
	}
}


