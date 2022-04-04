package com.tedu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tedu.bean.EmpBean;
import com.tedu.service.EmpService;
import com.tedu.service.EmpServiceImpl;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	
	private EmpService empService = new EmpServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.设置字符集
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//2.接收传输过来的数据
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		
		/**
		 * 独立一个方法，进行传入数据name和pwd的服务器端验证
		 * 一旦验证不合格，直接转发到index.jsp页面进行提示
		 * 如果前端页面验证很充分，那么就确定这个是爬虫或是非法入境
		 * 在代码中就要记录ip地址，发送的head头信息等等，当到达一定次数，直接封
		 */
		
		//3.调用service层来处理
		EmpBean bean = empService.findEmpBeanByNameAndPwd(name, pwd);
		//session -> 会话 -> 如果登录成功，用户信息就会记录到session，失败不记录
		if(bean != null) { //成功
			HttpSession session = req.getSession();
			//key = value
			session.setAttribute("UserBean", bean); //req.setAttribute redis(非关系型数据库)
			//登陆成功进入主页
			resp.sendRedirect("/OA/tarena/emp_list.jsp");
		}else { //失败
			//原地不动，需要给用户友好提示 jsp 需要将index.html变为jsp
			req.setAttribute("loginErr", "用户名或密码错误");
			req.getRequestDispatcher("tarena/index.jsp").forward(req, resp);
			
		}
		
	}
	
}
