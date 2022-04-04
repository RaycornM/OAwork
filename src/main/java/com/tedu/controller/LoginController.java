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
		//1.�����ַ���
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//2.���մ������������
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		
		/**
		 * ����һ�����������д�������name��pwd�ķ���������֤
		 * һ����֤���ϸ�ֱ��ת����index.jspҳ�������ʾ
		 * ���ǰ��ҳ����֤�ܳ�֣���ô��ȷ�������������ǷǷ��뾳
		 * �ڴ����о�Ҫ��¼ip��ַ�����͵�headͷ��Ϣ�ȵȣ�������һ��������ֱ�ӷ�
		 */
		
		//3.����service��������
		EmpBean bean = empService.findEmpBeanByNameAndPwd(name, pwd);
		//session -> �Ự -> �����¼�ɹ����û���Ϣ�ͻ��¼��session��ʧ�ܲ���¼
		if(bean != null) { //�ɹ�
			HttpSession session = req.getSession();
			//key = value
			session.setAttribute("UserBean", bean); //req.setAttribute redis(�ǹ�ϵ�����ݿ�)
			//��½�ɹ�������ҳ
			resp.sendRedirect("/OA/tarena/emp_list.jsp");
		}else { //ʧ��
			//ԭ�ز�������Ҫ���û��Ѻ���ʾ jsp ��Ҫ��index.html��Ϊjsp
			req.setAttribute("loginErr", "�û������������");
			req.getRequestDispatcher("tarena/index.jsp").forward(req, resp);
			
		}
		
	}
	
}
