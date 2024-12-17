package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	private Connection con;
	String INSERT_QUERY="insert into user(name,email,mobile,password,address) values(?,?,?,?,?)";
	private PreparedStatement pstmt;
	private int status;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw = resp.getWriter();
	String password=req.getParameter("password");
	String confirmpassword=req.getParameter("confirmpassword");
	if(password.equals(confirmpassword)==true) {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String address=req.getParameter("address");
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String pwd="prateek@123";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url, username, pwd);
			 pstmt=con.prepareStatement(INSERT_QUERY);
			 pstmt.setString(1, name);
			 pstmt.setString(2, email);
			 pstmt.setString(3, mobile);
			 pstmt.setString(4, password);
			 pstmt.setString(5, address);
			 status=pstmt.executeUpdate();
			 if(status!=0) {
				 resp.sendRedirect("Success.html");
			 }else {
				 resp.sendRedirect("Failure.html");
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}else {
		resp.sendRedirect("Mismatch.html");
	}
	}
}
