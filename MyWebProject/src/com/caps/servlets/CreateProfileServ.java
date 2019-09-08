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

@WebServlet("/createProfileServ")
public class CreateProfileServ extends HttpServlet {

	User user = null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String uid = req.getParameter("user_id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String passwd = req.getParameter("passwd");
		System.out.println(uid);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(passwd);
		UserServicesImpl services = new UserServicesImpl();
		System.out.println(services.createProfile(user));
		PrintWriter out=resp.getWriter();
		    if(user != null)
         {
        	 out.print("<h1>Register succesful </h1>");
        	 out.println(user);
        }else
        	 out.println("<h1> Register failed</h1>");
	}
}





