package com.tedu.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tedu.service.RootService;
import com.tedu.service.RootServiceImpl;
import com.tedu.util.MysqlConnection;

@WebServlet("/addroot")
public class AddRootController extends HttpServlet{
	private RootService rootService = new RootServiceImpl();
	
	public AddRootController() {
	    
	}
	
	 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("UTF-8");
	  String uname = request.getParameter("uname");
	  String upwd = request.getParameter("upwd");
	  Connection conn = null;
	  PreparedStatement ps = null;
	  try {
		  conn = MysqlConnection.getConnection();
		  String sql="insert into oa_root(uname,upwd) values(?,?)";
		  ps = conn.prepareStatement(sql);
		  ps.setString(1, uname);
		  ps.setString(2, upwd);
		  int count = ps.executeUpdate();
	  	} catch (SQLException e) {
	 
	  		e.printStackTrace();
	  	}finally {
	  		MysqlConnection.close(null, ps, conn);
	  	}
	  response.sendRedirect("/OAwork/rimu/root_list.jsp");
	 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
	}
}

