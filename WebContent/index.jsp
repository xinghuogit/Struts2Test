<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String context = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面未找到</title>
</head>
<body>
	<br /> 路径问题path开始
	<br>
	<a href="path/path.action">路径问题</a>
	<br /> 路径问题path结束
	<br>
	<br /> ActionMethod开始
	<br> Action执行的时候并不一定要执行execute方法
	<br> 可以在配置文件中配置Action的时候用method=来指定执行哪个方法
	也可以在url地址中动态指定（动态方法调用DMI）（推荐）
	<br>
	<a href="<%=context%>/user/userAdd">添加用户 不推荐</a>
	<br>
	<a href="<%=context%>/user/user!add">添加用户 推荐动态DMI</a>
	<br> 前者会产生太多的action，所以不推荐使用;但是使用之前把struts.xml里面一句话修改成为 constant
	name="struts.enable.DynamicMethodInvocation" value="true"
	<br /> ActionMethod结束
	<br>
	<br />通配符开始 ActionWildcard
	<br> 使用通配符，将配置量降到最低
	<br>
	<a href="<%=context%>/actions/Studentadd">添加学生</a>
	<a href="<%=context%>/actions/Studentdelete">删除学生</a>
	<br> 不过，一定要遵守"约定优于配置"的原则
	<br>
	<a href="<%=context%>/actions/Teacher_add">添加老师</a>
	<a href="<%=context%>/actions/Teacher_delete">删除老师</a>
	<a href="<%=context%>/actions/Course_add">添加课程</a>
	<a href="<%=context%>/actions/Course_delete">删除课程</a>
	<br />通配符结束ActionWildcard
	<br>

	<p>Loading ...</p>

</body>
</html>