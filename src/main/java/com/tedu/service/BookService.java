package com.tedu.service;

import java.util.List;

import com.tedu.bean.OaBookBean;

/**
 * oarootbean对应的业务处理层
 * 在本层中
 * @author RaycornM
 *
 */
public interface BookService {
	//获取列表对象信息
	public List<OaBookBean> getBookBeanList();
}
