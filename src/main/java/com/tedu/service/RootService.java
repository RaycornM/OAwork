package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaRootBean;

/**
 * oarootbean对应的业务处理层
 * 在本层中
 * @author RaycornM
 *
 */
public interface RootService {
	//登录的命名
	OaRootBean findRootBeanByUnameAndUpwd(String uname, String upwd);
	//获取列表对象信息
	public List<OaRootBean> getRootBeanList();
}
