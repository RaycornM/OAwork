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
						图书列表
					</h1>
					<div class="loginarea">
						<table >
							<tr>
								<th class="top" scope="col">
									图书编号
									<br />
								</th>
								<th class="top" scope="col">
									ISBN
								</th>
								<th class="top" scope="col">
									图书名称
									<br />
								</th>
								<th class="top" scope="col">
									作者
								</th>
								<th class="top" scope="col">
									出版社
								</th>
								<th class="top" scope="col">
									操作
								</th>
							</tr>
							<%
							BookService service = new BookServiceImpl();
							List<OaBookBean> list = service.getBookBeanList();
							for(OaBookBean bean:list){
							%>
							<tr>
								<th scope="row">
									<%=bean.getId() %>
								</th>
								<td >
									<%=bean.getIsbn() %>
								</td>
								<td>
									<%=bean.getTitle() %>
								</td>
								<td>
									<%=bean.getAuthor() %>
								</td>
								<td>
									<%=bean.getPress() %>
								</td>
								<td>
									<a href="book_edit.jsp">修改</> 
								</td>
							</tr>
							<%} %>
							
						</table>
						<p class="caption">
							<strong>表 1</strong> 管理员列表
						</p>
					</div>

				</div>
			</div>


			<div class="footer">
				<p>
					Copyright &copy; 2022 RIMUTUSHU.COM
				</p>
				<p class="credits"></p>
			</div>
		</div>

	</body>
</html>