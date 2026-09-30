package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class Register  extends HttpServlet{
	protected void service (HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String FirstName=req.getParameter("fname");
		String LastName=req.getParameter("lname");
		String Email=req.getParameter("uemail");
		String Password=req.getParameter("upass");
		
		PrintWriter pw=res.getWriter();
		pw.write("Welcome mr. "+FirstName+" "+"Your Email : "+" "+Email);


	}

}
