package com.tedu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tedu.bean.OaRootBean;
import com.tedu.service.RootService;
import com.tedu.service.RootServiceImpl;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	
	private RootService rootService = new RootServiceImpl();
	 
	public LoginController() {
	    
	}
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		OaRootBean bean = this.rootService.findRootBeanByUnameAndUpwd(uname, upwd);
		//session -> 会话 -> 如果登录成功，用户信息就会记录到session，失败不记录
		if(bean != null) { //成功
			HttpSession session = req.getSession();
			//key = value
			session.setAttribute("userBean", bean); //req.setAttribute redis(非关系型数据库)
			//登陆成功进入主页
			resp.sendRedirect("/OAwork/rimu/root_list.jsp");
		}else { //失败
			//原地不动，需要给用户友好提示 jsp 需要将index.html变为jsp
			req.setAttribute("loginErr", "用户名或密码错误");
			req.getRequestDispatcher("rimu/index.jsp").forward(req, resp);
			
		}
		
	}
	
}
