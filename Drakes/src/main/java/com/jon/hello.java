package com.jon; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class hello extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
			PrintWriter pw = resp.getWriter();
			
			pw.write("Hello World 2.0 LOL   HEY CAN YOU SEE THIS!?!?!");
	}
}
