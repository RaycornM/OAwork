<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.tedu.service.RootServiceImpl"%>
<%@page import="com.tedu.service.RootService"%>
<%@page import="java.util.List"%>
<%@page import="com.tedu.bean.OaRootBean"%>
<!DOCTYPE html>
<html>
<head>
<%
	String path = request.getContextPath(); //获取上下文路径
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/index.css" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/list.css" />
<title>日暮图书管理系统|登录</title>
</head>
<body>
		<div class="page-container">
			<div class="header">
				<div class="header-middle">
					<a class="sitelogo" href="#" title="Go to Start page"></a>
					<div class="sitename">
						<h1>
							<a href="index.jsp" title="Go to Start page">RIMUTUSHU<span
								style="font-weight: normal; font-size: 50%;">.com</span> </a>
						</h1>
						<h2>
							日暮图书管理系统
						</h2>
					</div>
				</div>
				<div class="header-bottom">
					<nav class="nav" aria-label="Main Navigation">
						<ul>
							<li >
								<a href="index.jsp">首页</a>
							</li>
							<li class="dropdown">
							    <!-- aria-expanded needs managed with Javascript -->
							    <button type="button" class="dropdown__title" aria-expanded="false" aria-controls="sweets-dropdown">
							        &nbsp;&nbsp;&nbsp;&nbsp;管理员管理
							    </button>
								<ul class="dropdown__menu" id="sweets-dropdown">
									<li>
										<a href="root_list.jsp">管理员列表</a>
									</li>
									<li>
										<a href="root_add.jsp">添加管理员</a>
									</li>
									<li>
										<a href="root_edit.jsp">修改管理员</a>
									</li>
								</ul>
							</li>
							<li class="dropdown">
								<button type="button" class="dropdown__title" aria-expanded="false" aria-controls="sweets-dropdown">
							        &nbsp;&nbsp;&nbsp;&nbsp;图书管理
							    </button>
								<ul class="dropdown__menu" id="sweets-dropdown">
									<li>
										<a href="book_list.jsp">图书列表</a>
									</li>
									<li>
										<a href="book_add.jsp">添加图书</a>
									</li>
									<li>
										<a href="book_edit.jsp">修改图书</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				<div>
					</br>
					</br>
				</div>
			</div>
		
			<div class="main">
		
				<div class="main-daohanglan">
		
					<div class="round-border-topright"></div>
					<h1 class="first">
						菜单
						<br />
					</h1>
					<p>
						<br/>
						<a href="index.jsp">系统首页</a>
					</p>
		
				</div>
			
				<div class="main-login">
			
					<h1 class="pagetitle">
								日暮图书管理系统
					</h1>
			
					<div class="loginarea">
						<div class="contactform">
							<form method="post" action="/OAwork/login.do">
								<fieldset>
									<legend>
										&nbsp;用户登录&nbsp;
									</legend>
									<p>
										<label for="uname" class="left">
											用户名称
										</label>
										<input type="text" name="uname" id="uname" class="field"
											value="" tabindex="1" />
									</p>
									<p>
										<label for="upwd" class="left">
											密码
										</label>
										<input type="text" name="upwd" id="upwd" class="field"
											value="" tabindex="1" />
									</p>
									<p>
										<input type="submit" name="submit" id="submit" class="button"
											value="登录" tabindex="6" />
									</p>
									<p> 
										<%
											Object obj = request.getAttribute("loginErr");
											//如果loginErr没有，那么obj = null
											obj = (obj == null) ? "" : obj;
										%>
										<%=obj.toString() %>
									</p>
								</fieldset>

							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="footer">
				<p>
					Copyright &copy; 2022 RUMUTUSHU.COM
				</p>
				<p class="credits"></p>
			</div>
	</body>
</html>