package com.tedu.test;

import org.junit.Test;

import com.tedu.bean.EmpBean;
import com.tedu.service.EmpService;
import com.tedu.service.EmpServiceImpl;

//ר����service�Ĳ���
public class TestService {
	
	@Test
	public void findEmpBeanByNameAndPwd() {
		EmpService service = new EmpServiceImpl();
		EmpBean bean = service.findEmpBeanByNameAndPwd("����", "1234");
		System.out.println(bean);
	}
}
