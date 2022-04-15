package com.tedu.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;
import com.tedu.bean.OaRootBean;
import com.tedu.util.MysqlConnection;

public class RootServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Connection conn = MysqlConnection.getConnection();
			Statement sta=null;
			ResultSet set=null;
			ArrayList<OaRootBean> list = new ArrayList<>();
			String sql="select * from oa_root";
			
			try {
				sta=conn.createStatement();
				set=sta.executeQuery(sql); //sql²éÑ¯Óï¾äµÄÖ´ÐÐ 
				
				while(set.next()){
					OaRootBean bean=new OaRootBean();
					bean = new OaRootBean();
					bean.setUid(set.getInt("uid"));
					bean.setUname(set.getString("uname"));
					bean.setUpwd(set.getString("upwd"));
					bean.setPermissions(set.getInt("permissions"));
					list.add(bean); 
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				MysqlConnection.close(set,sta,conn); 
			}
	        req.setAttribute("list", list);

	        req.getRequestDispatcher("/OAwork/rimu/root_list.jsp").forward(req, resp);
		}
		
	}

