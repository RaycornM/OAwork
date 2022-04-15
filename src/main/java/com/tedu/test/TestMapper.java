package com.tedu.test;

import java.util.List;

import org.junit.Test;

import com.tedu.bean.OaBookBean;
import com.tedu.bean.OaRootBean;
import com.tedu.mapper.BookMapper;
import com.tedu.mapper.BookMapperImpl;
import com.tedu.mapper.RootMapper;
import com.tedu.mapper.RootMapperImpl;

/**
 * ������ר������mapper���Ե�
 * @author RaycornM
 *
 */
public class TestMapper {
	@Test
	public void seleRootByUnameAndUpwd() {
		//�ӿ����� = ʵ�����
		RootMapper mapper = new RootMapperImpl();
		//��ȷ��
		OaRootBean bean = mapper.seleRootByUnameAndUpwd("senpai", "1234");
		System.out.println(bean);
		//�����
		bean = mapper.seleRootByUnameAndUpwd("114", "514");
		System.out.println(bean);
		
	}
	@Test
	public void selectAllRoot() {
		RootMapper mapper = new RootMapperImpl();
		List<OaRootBean> all = mapper.selectAll();
		for(OaRootBean bean:all) {
			System.out.println(bean);
		}
	}
	@Test
	public void selectAllBook() {
		BookMapper mapper = new BookMapperImpl();
		List<OaBookBean> all = mapper.selectAll();
		for(OaBookBean bean:all) {
			System.out.println(bean);
		}
	}
}
