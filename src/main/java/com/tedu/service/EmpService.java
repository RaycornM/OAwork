package com.tedu.service;

import java.util.List;

import com.tedu.bean.EmpBean;

/**
 * empbean��Ӧ��ҵ�����
 * �ڱ�����
 * @author RaycornM
 *
 */
public interface EmpService {
	//��¼������
	EmpBean findEmpBeanByNameAndPwd(String name, String pwd);
	//��ȡ�б������Ϣ
	public List<EmpBean> getEmpBeanList();
}
