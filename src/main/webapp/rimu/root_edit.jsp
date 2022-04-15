<%@page import="com.tedu.service.BookServiceImpl"%>
<%@page import="com.tedu.service.BookService"%>
<%@page import="java.util.List"%>
<%@page import="com.tedu.bean.OaBookBean"%>
<!-- 在java中，除开java.lang包下的以外，都需要导包 -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/index.css" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/list.css" />
<title>日暮图书管理系统|管理员列表</title>
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
						<a href="index.jsp">返回系统首页</a>
					</p>
					<p>
						<br/>
						<a href="root_list.jsp">管理员信息</a>
					</p>
					<p>
						<br/>
						<a href="root_add.jsp">添加管理员</a>
					</p>
					<p>
						<br/>
						<a href="root_edit.jsp">修改管理员</a>
					</p>
					<p>
						<br/>
						<a href="book_list.jsp">所有图书信息</a>
					</p>
					<p>
						<br/>
						<a href="book_add.jsp">添加图书</a>
					</p>
					<p>
						<br/>
						<a href="book_edit.jsp">修改图书</a>
					</p>
				</div>

				<div class="main-login">

					<h1 class="pagetitle">
						修改员工信息
					</h1>

					<div class="loginarea">
						<div class="contactform">
							<form method="post" action="index.jsp">
								<input type="hidden" name="id" value="" />
								<fieldset>
									<legend>
										&nbsp;基本信息&nbsp;
									</legend>
									<p>
										<label for="name" class="left">
											姓名:
										</label>
										<input type="text" name="name" id="name" class="field"
											value="" tabindex="1" />
									</p>
								
									<p>
										<label for="pre" class="left">
											权限:
										</label>
										<SELECT id="uid">
										<OPTION value=NULL selected>
											无
										</OPTION>
										<OPTION value=True>
											有
										</OPTION>
									</SELECT>
									</p>

									<p>
										<label for="hire_date" class="left">
											入职时间:
										</label>
										<input type="text" name="hireDate" id="hire_date"
											class="field" value="" tabindex="1" />
									</p>
									<p>
										<label for="pwd" class="left">
											密码:
										</label>
										<input type="text" name="pwd" id="pwd"
											class="field" value="" tabindex="1" />
									</p>
									<p>
										<label for="pwds" class="left">
											重复密码:
										</label>
										<input type="text" name="pwds" id="pwds"
											class="field" value="" tabindex="1" />
									</p>
									<p>
										<input type="submit" name="submit" id="submit" class="button"
											value="保存" tabindex="6" />
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
		</div>

	</body>
</html>



