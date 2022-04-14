package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaRootBean;
import com.tedu.mapper.RootMapper;
import com.tedu.mapper.RootMapperImpl;

public class RootServiceImpl implements RootService {
	
	private RootMapper rootMapper = new RootMapperImpl();
	//当没有很多事务的时候，service层给人的感觉是多余的，但是在大型项目中很多例如：权限、日志等基于AOP变成
	//基本上大部分是在service层实现
	@Override
	public OaRootBean findRootBeanByUnameAndUpwd(String uname,String upwd) {
		OaRootBean bean = rootMapper.seleRootByUnameAndUpwd(uname, upwd);
		return bean;
	}
	@Override
	public List<OaRootBean> getRootBeanList() {
		// TODO Auto-generated method stub
		return rootMapper.selectAll();
	}
}
