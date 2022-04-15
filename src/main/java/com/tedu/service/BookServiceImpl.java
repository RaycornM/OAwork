package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaBookBean;
import com.tedu.mapper.BookMapper;
import com.tedu.mapper.BookMapperImpl;


public class BookServiceImpl implements BookService {
	
	private BookMapper bookMapper = new BookMapperImpl();
	//当没有很多事务的时候，service层给人的感觉是多余的，但是在大型项目中很多例如：权限、日志等基于AOP变成
	//基本上大部分是在service层实现

	@Override
	public List<OaBookBean> getBookBeanList() {
		// TODO Auto-generated method stub
		return bookMapper.selectAll();
	}
	
}
