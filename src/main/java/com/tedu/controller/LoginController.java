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
		//session -> �Ự -> �����¼�ɹ����û���Ϣ�ͻ��¼��session��ʧ�ܲ���¼
		if(bean != null) { //�ɹ�
			HttpSession session = req.getSession();
			//key = value
			session.setAttribute("userBean", bean); //req.setAttribute redis(�ǹ�ϵ�����ݿ�)
			//��½�ɹ�������ҳ
			resp.sendRedirect("/OAwork/rimu/root_list.jsp");
		}else { //ʧ��
			//ԭ�ز�������Ҫ���û��Ѻ���ʾ jsp ��Ҫ��index.html��Ϊjsp
			req.setAttribute("loginErr", "�û������������");
			req.getRequestDispatcher("rimu/index.jsp").forward(req, resp);
			
		}
		
	}
	
}
