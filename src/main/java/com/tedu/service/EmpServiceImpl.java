package com.tedu.service;

import java.util.List;

import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;
import com.tedu.mapper.EmpMapperImpl;

public class EmpServiceImpl implements EmpService {
	
	private EmpMapper empMapper = new EmpMapperImpl();
	//��û�кܶ������ʱ��service����˵ĸо��Ƕ���ģ������ڴ�����Ŀ�кܶ����磺Ȩ�ޡ���־�Ȼ���AOP���
	//�����ϴ󲿷�����service��ʵ��
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
