package com.tedu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tedu.bean.OaRootBean;

@WebFilter("/*")
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//ͳһ���е��ַ���
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//����ת��
		HttpServletRequest req = null;
		HttpServletResponse resp = null;
		if(request instanceof HttpServletRequest) {
			req = (HttpServletRequest)request;
			resp = (HttpServletResponse)response;
		}
		String path = req.getServletPath();
		System.out.println(path);
		
		//��session�н��ж�ȡ�������Ƿ��¼
		Object obj = req.getSession().getAttribute("userBean");
		if(obj != null) {
			OaRootBean bean = (OaRootBean)obj;
			//����bean���汣�����û���Ȩ��
			//����������ʹ��Ȩ�����ж���ǰ��path�Ƿ���Ȩ�޲��������û��ֱ������
			chain.doFilter(req, response);
		}else if(!path.equals("/rimu/index.jsp") && !path.equals("/login.do")) {
			resp.sendRedirect("/OAwork/rimu/index.jsp");
		}else {
			chain.doFilter(req, response);
		}
	}
		
		//���¼�������������,������ͨ��
		//chain.doFilter(req, response);
}

