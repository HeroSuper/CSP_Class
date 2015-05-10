package com.ac.company;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SignUp extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
	String id = req.getParameter("id");
	String password = req.getParameter("password");
	
	UserAccount ua = new UserAccount(id, password);
	
	MemberManager.getManager().makePersistent(ua);
	
	resp.sendRedirect("LoginPage.html");
	}
}
