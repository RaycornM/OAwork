package com.tedu.service;

import java.util.List;

import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;
import com.tedu.mapper.EmpMapperImpl;

public class EmpServiceImpl implements EmpService {
	
	private EmpMapper empMapper = new EmpMapperImpl();
	//当没有很多事务的时候，service层给人的感觉是多余的，但是在大型项目中很多例如：权限、日志等基于AOP变成
	//基本上大部分是在service层实现
	@Override
	public EmpBean findEmpBeanByNameAndPwd(String name,String pwd) {
		EmpBean bean = empMapper.seleEmpByNameAndPwd(name, pwd);
		return bean;
	}
	@Override
	public List<EmpBean> getEmpBeanList() {
		// TODO Auto-generated method stub
		return empMapper.selectAll();
	}
}
