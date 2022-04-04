package com.tedu.test;

import org.junit.Test;

import com.tedu.bean.EmpBean;
import com.tedu.service.EmpService;
import com.tedu.service.EmpServiceImpl;

//专门做service的测试
public class TestService {
	
	@Test
	public void findEmpBeanByNameAndPwd() {
		EmpService service = new EmpServiceImpl();
		EmpBean bean = service.findEmpBeanByNameAndPwd("老任", "1234");
		System.out.println(bean);
	}
}
