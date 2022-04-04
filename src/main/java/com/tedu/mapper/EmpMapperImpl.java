package com.tedu.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tedu.bean.EmpBean;
import com.tedu.util.MysqlConnection;

//com.tedu.mapper.impl

public class EmpMapperImpl implements EmpMapper{

	@Override
	public int insertEmp(EmpBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmp(EmpBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmp(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmpBean> selectAll() {
		Connection conn = MysqlConnection.getConnection();
		Statement sta=null;
		ResultSet set =null;
		List<EmpBean> list = new ArrayList<EmpBean>();
		String sql = "select * from emp limit 0,10";
		
		try {
			sta = conn.createStatement();
			set = sta.executeQuery(sql);
			while(set.next()) {
				EmpBean bean = new EmpBean();
				bean.setId(set.getInt("id"));
				bean.setName(set.getString("name"));
				bean.setPwd(set.getString("pwd"));
				bean.setSal(set.getDouble("sal"));
				bean.setHire_date(set.getDate("hire_date"));
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
	public EmpBean selectEmpByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpBean seleEmpByNameAndPwd(String name, String pwd) {
		Connection conn = MysqlConnection.getConnection();
		PreparedStatement sta=null;
		ResultSet set =null;
		String sql="select * from emp where name=? and pwd=?";
//		就是执行SQL语句，并将查询出来的结果 封装到 UserBean中去
		EmpBean bean = null;
		try {
			sta = conn.prepareStatement(sql); //预加载
			sta.setString(1, name);
			sta.setString(2, pwd);
			set = sta.executeQuery(); //这里现在不要有sql传入
			if(set.next()) {
				bean = new EmpBean();
				bean.setId(set.getInt("id"));
				bean.setName(set.getString("name"));
				bean.setPwd(set.getString("pwd"));
				bean.setSal(set.getDouble("sal"));
				bean.setHire_date(set.getDate("hire_date"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			MysqlConnection.close(set,sta,conn);
		}
		
		return bean;
	}

}
