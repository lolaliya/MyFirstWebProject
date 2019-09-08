package com.caps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caps.beans.Dog;

@WebServlet("/attrServCtx")
public class AttrServCtx extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		Dog dog = new Dog();
		dog.setName("Pinky");
		dog.setBreed("GS");
		dog.setColor("Black");

		ctx.setAttribute("dog", dog);

		PrintWriter out = resp.getWriter();
		out.println("Dog is now inside Servlet Context");

	}
}

