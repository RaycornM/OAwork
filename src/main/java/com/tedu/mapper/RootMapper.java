package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.OaRootBean;

/**
 * 包含由增删改查等操作
 * @author RaycornM
 *
 */
public interface RootMapper {
//增加 将这个mapper当作简写的sql语句，只考虑传入值和返回值
	public int insertRoot(OaRootBean bean);
//修改
	public int updateRoot(OaRootBean bean);
//删除 删除数据只需要传入主键
	public int deleteRoot(int id);
//查询ALL
	public List<OaRootBean> selectAll();
//用户名查询
	public OaRootBean selectRootByUname(String uname);
//登录
	public OaRootBean seleRootByUnameAndUpwd(String uname,String upwd);
}
