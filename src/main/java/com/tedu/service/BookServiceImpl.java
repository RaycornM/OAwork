package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaBookBean;
import com.tedu.mapper.BookMapper;
import com.tedu.mapper.BookMapperImpl;


public class BookServiceImpl implements BookService {
	
	private BookMapper bookMapper = new BookMapperImpl();
	//��û�кܶ������ʱ��service����˵ĸо��Ƕ���ģ������ڴ�����Ŀ�кܶ����磺Ȩ�ޡ���־�Ȼ���AOP���
	//�����ϴ󲿷�����service��ʵ��

	@Override
	public List<OaBookBean> getBookBeanList() {
		// TODO Auto-generated method stub
		return bookMapper.selectAll();
	}
	
}
