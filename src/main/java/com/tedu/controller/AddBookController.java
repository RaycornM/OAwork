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

import com.tedu.service.BookService;
import com.tedu.service.BookServiceImpl;
import com.tedu.service.RootService;
import com.tedu.service.RootServiceImpl;
import com.tedu.util.MysqlConnection;

@WebServlet("/addbook")
public class AddBookController extends HttpServlet{
	private BookService bookService = new BookServiceImpl();
	
	public AddBookController() {
		
	}
	
	 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("UTF-8");
	  String isbn = request.getParameter("isbn");
	  String title = request.getParameter("title");
	  String author = request.getParameter("author");
	  String press = request.getParameter("press");
	  Connection conn = null;
	  PreparedStatement ps = null;
	  try {
		  conn = MysqlConnection.getConnection();
		  String sql="insert into oa_book(isbn,title,author,press) values(?,?,?,?)";
		  ps = conn.prepareStatement(sql);
		  ps.setString(1, isbn);
		  ps.setString(2, title);
		  ps.setString(3, author);
		  ps.setString(4, press);
		  int count = ps.executeUpdate();
	  	} catch (SQLException e) {
	 
	  		e.printStackTrace();
	  	}finally {
	  		MysqlConnection.close(null, ps, conn);
	  	}
	  response.sendRedirect("/OAwork/rimu/book_list.jsp");
	 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
	}
}

