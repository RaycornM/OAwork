package com.tedu.test;

import java.util.List;

import org.junit.Test;

import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;
import com.tedu.mapper.EmpMapperImpl;

/**
 * 本类是专门用于mapper测试的
 * @author RaycornM
 *
 */
public class TestMapper {
	@Test
	public void selectEmpByNameAndPwd() {
		//接口引用 = 实体对象
		EmpMapper mapper = new EmpMapperImpl();
		//正确的
		EmpBean bean = mapper.seleEmpByNameAndPwd("老任", "1234");
		System.out.println(bean);
		//错误的
		bean = mapper.seleEmpByNameAndPwd("114", "514");
		System.out.println(bean);
		
	}
	@Test
	public void selectAll() {
		EmpMapper mapper = new EmpMapperImpl();
		List<EmpBean> all = mapper.selectAll();
		for(EmpBean bean:all) {
			System.out.println(bean);
		}
	}
}
