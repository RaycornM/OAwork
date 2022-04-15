package com.tedu.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tedu.bean.OaBookBean;
import com.tedu.bean.OaRootBean;
import com.tedu.util.MysqlConnection;

//com.tedu.mapper.impl

public class BookMapperImpl implements BookMapper{

	@Override
	public int insertBook(OaBookBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(OaBookBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OaBookBean> selectAll() {
		Connection conn = MysqlConnection.getConnection();
		Statement sta=null;
		ResultSet set =null;
		List<OaBookBean> list = new ArrayList<OaBookBean>();
		String sql = "select * from oa_Book limit 0,10";
		
		try {
			sta = conn.createStatement();
			set = sta.executeQuery(sql);
			while(set.next()) {
				OaBookBean bean = new OaBookBean();
				bean.setId(set.getInt("id"));
				bean.setIsbn(set.getString("isbn"));
				bean.setTitle(set.getString("title"));
				bean.setAuthor(set.getString("author"));
				bean.setPress(set.getString("press"));
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
	public OaBookBean selectBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
