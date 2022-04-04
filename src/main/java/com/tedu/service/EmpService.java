package com.tedu.service;

import java.util.List;

import com.tedu.bean.EmpBean;

/**
 * empbean对应的业务处理层
 * 在本层中
 * @author RaycornM
 *
 */
public interface EmpService {
	//登录的命名
	EmpBean findEmpBeanByNameAndPwd(String name, String pwd);
	//获取列表对象信息
	public List<EmpBean> getEmpBeanList();
}
