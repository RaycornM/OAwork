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
		//统一所有的字符集
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//类型转换
		HttpServletRequest req = null;
		HttpServletResponse resp = null;
		if(request instanceof HttpServletRequest) {
			req = (HttpServletRequest)request;
			resp = (HttpServletResponse)response;
		}
		String path = req.getServletPath();
		System.out.println(path);
		
		//在session中进行读取，看看是否登录
		Object obj = req.getSession().getAttribute("UserBean");
		if(obj != null) {
			EmpBean bean = (EmpBean)obj;
			//假设bean里面保持有用户的权限
			//可以在这里使用权限来判定当前的path是否有权限操作，如果没有直接拦截
			chain.doFilter(req, response);
		}else { //  /tarena/index.jsp  /login.do
			if(path.equals("/tarena/index.jsp") || path.equals("/login.do")) {
				chain.doFilter(req, response);
			}else {
				resp.sendRedirect("/OA/tarena/index.jsp");
			}
		}
		
		//向下继续传递拦截器,拦截器通过
//		chain.doFilter(req, response);
	}

}
