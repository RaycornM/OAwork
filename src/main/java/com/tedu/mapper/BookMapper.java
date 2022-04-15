package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.OaBookBean;
import com.tedu.bean.OaRootBean;

/**
 * 包含由增删改查等操作
 * @author RaycornM
 *
 */
public interface BookMapper {
//增加 将这个mapper当作简写的sql语句，只考虑传入值和返回值
	public int insertBook(OaBookBean bean);
//修改
	public int updateBook(OaBookBean bean);
//删除 删除数据只需要传入主键
	public int deleteBook(int id);
//查询ALL
	public List<OaBookBean> selectAll();
//书名查询
	public OaBookBean selectBookByTitle(String title);

}
