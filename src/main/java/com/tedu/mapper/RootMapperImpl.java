package com.tedu.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tedu.bean.OaRootBean;
import com.tedu.util.MysqlConnection;

//com.tedu.mapper.impl

public class RootMapperImpl implements RootMapper{

	@Override
	public int insertRoot(OaRootBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoot(OaRootBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRoot(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OaRootBean> selectAll() {
		Connection conn = MysqlConnection.getConnection();
		Statement sta=null;
		ResultSet set =null;
		List<OaRootBean> list = new ArrayList<OaRootBean>();
		String sql = "select * from oa_root limit 0,10";
		
		try {
			sta = conn.createStatement();
			set = sta.executeQuery(sql);
			while(set.next()) {
				OaRootBean bean = new OaRootBean();
				bean.setUid(set.getInt("uid"));
				bean.setUname(set.getString("uname"));
				bean.setUpwd(set.getString("upwd"));
				bean.setPermissions(set.getInt("permissions"));
				list.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MysqlConnection.close(set, sta, conn);
		}
		
		return list;
	}

	@Override
	public OaRootBean selectRootByUname(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OaRootBean seleRootByUnameAndUpwd(String uname, String upwd) {
		Connection conn = MysqlConnection.getConnection();
		PreparedStatement sta=null;
		ResultSet set =null;
		String sql="select * from oa_root where uname=? and upwd=?";
//		就是执行SQL语句，并将查询出来的结果 封装到 UserBean中去
		OaRootBean bean = null;
		try {
			sta = conn.prepareStatement(sql); //预加载
			sta.setString(1, uname);
			sta.setString(2, upwd);
			set = sta.executeQuery(); //这里现在不要有sql传入
			if(set.next()) {
				bean = new OaRootBean();
				bean.setUid(set.getInt("uid"));
				bean.setUname(set.getString("uname"));
				bean.setUpwd(set.getString("upwd"));
				bean.setPermissions(set.getInt("permissions"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			MysqlConnection.close(set,sta,conn);
		}
		
		return bean;
	}

}
