package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter pw= res.getWriter();
		pw.write("Welcome");
		
	}

}
