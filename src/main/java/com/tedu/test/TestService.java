package com.tedu.test;

import org.junit.Test;

import com.tedu.bean.OaRootBean;
import com.tedu.service.RootService;
import com.tedu.service.RootServiceImpl;

//ר����service�Ĳ���
public class TestService {
	
	@Test
	public void findEmpBeanByNameAndPwd() {
		RootService service = new RootServiceImpl();
		OaRootBean bean = service.findRootBeanByUnameAndUpwd("senpai", "1234");
		System.out.println(bean);
	}
}
