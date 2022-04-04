<%@page import="com.tedu.service.EmpServiceImpl"%>
<%@page import="com.tedu.service.EmpService"%>
<%@page import="java.util.List"%>
<%@page import="com.tedu.bean.EmpBean"%>
<!-- 在java中，除开java.lang包下的以外，都需要导包 -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/layout2_setup.css" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/layout2_text.css" />
<title>Insert title here</title>
</head>
<body>
		<div class="page-container">


			<div class="header">

				<div class="header-middle">

					<a class="sitelogo" href="#" title="Go to Start page"></a>
					<div class="sitename">
						<h1>
							<a href="index.html" title="Go to Start page">TARENA<span
								style="font-weight: normal; font-size: 50%;">.com.cn</span> </a>
						</h1>
						<h2>
							加拿大达内外企培训
						</h2>
					</div>

				</div>
				<div class="header-bottom">

					<div class="nav2">

						<ul>
							<li>
								<a href="index.html">系统首页</a>
							</li>
						</ul>

						<ul>
							<li>
								<a href="#">员工管理<!--[if IE 7]><!--> </a>
								<!--<![endif]-->
								<!--[if lte IE 6]><table><tr><td><![endif]-->
								<ul>
									<li>
										<a href="emp_list.html">员工列表</a>
									</li>
									<li>
										<a href="emp_add.html">添加员工</a>
									</li>
								</ul>
								<!--[if lte IE 6]></td></tr></table></a><![endif]-->
							</li>
						</ul>
						<ul>
							<li>
								<a href="#">部门管理<!--[if IE 7]><!--> </a>
								<!--<![endif]-->
								<!--[if lte IE 6]><table><tr><td><![endif]-->
								<ul>
									<li>
										<a href="dept_add.html">添加部门</a>
									</li>
									<li>
										<a href="dept_list.html">部门列表</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>


				<div class="header-breadcrumbs">
					<ul>
						<li>
							<a href="#">首页</a>
						</li>
						<li>
							<a href="#">员工管理</a>
						</li>
						<li>
							员工列表
						</li>
					</ul>


				</div>
			</div>


			<div class="main">

				<div class="main-navigation">

					<div class="round-border-topright"></div>
					<h1 class="first">
						列表说明
						<br />
					</h1>
					<p>
						表格内显示所有员工信息
					</p>




				</div>

				<div class="main-content">

					<h1 class="pagetitle">
						员工列表
					</h1>




					<div class="column1-unit">
						<table bgColor="#00ff40">
							<tr>
								<th class="top" scope="col">
									员工编号
									<br />
								</th>
								<th class="top" scope="col">
									姓名
								</th>
								<th class="top" scope="col">
									工资
									<br />
								</th>
								<th class="top" scope="col">
									入职时间
								</th>
								<th class="top" scope="col">
									部门
								</th>
								<th class="top" scope="col">
									操作
								</th>
							</tr>
							<%
								EmpService service = new EmpServiceImpl();
								List<EmpBean> list = service.getEmpBeanList();
								for(EmpBean bean:list){
							%>
							<tr>
								<th scope="row">
									<%=bean.getId() %>
								</th>
								<td borderColor="#00ff00" bgColor="#00ff00">
									<%=bean.getName() %>
								</td>
								<td>
									<%=bean.getSal() %>
									<br />
								</td>
								<td>
									<%=bean.getHire_date() %>
								</td>
								<td>
									<%=bean.getDept_id() %>
								</td>
								<td>
									<a href="emp_edit.html">修改</> 
								</td>
							</tr>
							<%} %>
							
						</table>
						<p class="caption">
							<strong>表 1</strong> 员工列表
						</p>
					</div>

				</div>
			</div>


			<div class="footer">
				<p>
					Copyright &copy; 2010 tarena.com.cn | All Rights Reserved
				</p>
				<p class="credits"></p>
			</div>
		</div>

	</body>
</html>