package com.caps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = "/searchThings")
public class MultiSearch extends HttpServlet {

	@Override
	protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		String engine = req.getParameter("engine");
		

		if(engine.equalsIgnoreCase("Google"))
		{
			String redirectedUrl = "https://www.google.com/search?q=" + keyword;
			resp.sendRedirect(redirectedUrl);
		}
		else if (engine.equalsIgnoreCase("DuckDuckGo"))
		{
			String redirectedUrl = "https://duckduckgo.com/?q=" + keyword;
			resp.sendRedirect(redirectedUrl);
		}
		else if (engine.equalsIgnoreCase("Bing")) 
		{
			String redirectedUrl = "https://bing.com/?q=" + keyword;
			resp.sendRedirect(redirectedUrl);
		}
	}

}