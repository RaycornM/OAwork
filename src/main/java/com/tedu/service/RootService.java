package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaRootBean;

/**
 * oarootbean��Ӧ��ҵ�����
 * �ڱ�����
 * @author RaycornM
 *
 */
public interface RootService {
	//��¼������
	OaRootBean findRootBeanByUnameAndUpwd(String uname, String upwd);
	//��ȡ�б������Ϣ
	public List<OaRootBean> getRootBeanList();
}
