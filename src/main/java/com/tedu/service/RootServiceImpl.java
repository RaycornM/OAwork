package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaRootBean;
import com.tedu.mapper.RootMapper;
import com.tedu.mapper.RootMapperImpl;

public class RootServiceImpl implements RootService {
	
	private RootMapper rootMapper = new RootMapperImpl();
	//��û�кܶ������ʱ��service����˵ĸо��Ƕ���ģ������ڴ�����Ŀ�кܶ����磺Ȩ�ޡ���־�Ȼ���AOP���
	//�����ϴ󲿷�����service��ʵ��
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
