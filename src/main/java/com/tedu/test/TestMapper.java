package com.tedu.test;

import java.util.List;

import org.junit.Test;

import com.tedu.bean.OaRootBean;
import com.tedu.mapper.RootMapper;
import com.tedu.mapper.RootMapperImpl;

/**
 * 本类是专门用于mapper测试的
 * @author RaycornM
 *
 */
public class TestMapper {
	@Test
	public void seleRootByUnameAndUpwd() {
		//接口引用 = 实体对象
		RootMapper mapper = new RootMapperImpl();
		//正确的
		OaRootBean bean = mapper.seleRootByUnameAndUpwd("senpai", "1234");
		System.out.println(bean);
		//错误的
		bean = mapper.seleRootByUnameAndUpwd("114", "514");
		System.out.println(bean);
		
	}
	@Test
	public void selectAll() {
		RootMapper mapper = new RootMapperImpl();
		List<OaRootBean> all = mapper.selectAll();
		for(OaRootBean bean:all) {
			System.out.println(bean);
		}
	}
}
