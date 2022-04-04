package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.EmpBean;

/**
 * 包含由增删改查等操作
 * @author RaycornM
 *
 */
public interface EmpMapper {
//增加 将这个mapper当作简写的sql语句，只考虑传入值和返回值
	public int insertEmp(EmpBean bean);
//修改
	public int updateEmp(EmpBean bean);
//删除 删除数据只需要传入主键
	public int deleteEmp(int id);
//查询ALL
	public List<EmpBean> selectAll();
//用户名查询
	public EmpBean selectEmpByName(String name);
//登录
	public EmpBean seleEmpByNameAndPwd(String name,String pwd);
}
