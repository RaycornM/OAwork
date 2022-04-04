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

import com.tedu.bean.EmpBean;

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
		Object obj = req.getSession().getAttribute("UserBean");
		if(obj != null) {
			EmpBean bean = (EmpBean)obj;
			//����bean���汣�����û���Ȩ��
			//����������ʹ��Ȩ�����ж���ǰ��path�Ƿ���Ȩ�޲��������û��ֱ������
			chain.doFilter(req, response);
		}else { //  /tarena/index.jsp  /login.do
			if(path.equals("/tarena/index.jsp") || path.equals("/login.do")) {
				chain.doFilter(req, response);
			}else {
				resp.sendRedirect("/OA/tarena/index.jsp");
			}
		}
		
		//���¼�������������,������ͨ��
//		chain.doFilter(req, response);
	}

}
