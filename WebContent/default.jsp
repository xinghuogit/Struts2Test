<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
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
	<br />ActionAttrParamInput开始 使用action属性接收参数 和ActionMethod开始
	<br>使用action属性接收参数
	<a href="user/user!add?name=a&age=8">添加用户 action属性接收参数</a>
	<br />ActionAttrParamInput结束使用action属性接收参数
	<br>
	<br />用DomainModel接收参数 和ActionMethod开始 使用Domain Model接收参数
	<a href="user/user!add?user.name=添加&user.age=8">添加用户DomainModel接收参数
		用的多</a>
	<br />用DomainModel接收参数结束
	<br>
	<br />用ModelDriven接收参数 和ActionMethod开始
	<a href="user/user!add?ruser.name=a&ruser.age=8">添加用户
		ModelDriven接收参数 不常用</a>
	<br />用ModelDriven接收参数结束
	<br>
	<br />CharacterEncoding开始 使用前不可以使用 implements ModelDriven
	<User>
	<form action="user/user!add" method="post">
		姓名：<input type="text" name="name"></input> <input type="submit"
			value="submit编码错误" />
	</form>
	<br />
	CharacterEncoding结束 <br>

	<br />
	用SimpleDataValiation 和ActionMethod开始 <a
		href="user/user!add?name=admin2">添加用户 检查数据</a> <br />
	用SimpleDataValiation结束 <br>

	<br />
	AccessWebElements 开始 包括包含模块IncludeModules <br>
	取得Map类型request,session,application,真实类型 HttpServletRequest,
	HttpSession, ServletContext的引用:
	<ol>
		<li>前三者：依赖于容器</li>
		<li>前三者：IOC</li> (只用这种)
		<li>后三者：依赖于容器</li>
		<li>后三者：IOC</li>
	</ol>
	<br />
	<form name="f" action="" method="post">
		用户名： <input type="text" name="name" /> 密码： <input type="text"
			name="password" /> <br /> <input type="button" value="submit1"
			onclick="javascript:document.f.action='login/login1';document.f.submit();" />
		<input type="button" value="submit2"
			onclick="javascript:document.f.action='login/login2';document.f.submit();" />
		<input type="button" value="submit3"
			onclick="javascript:document.f.action='login/login3';document.f.submit();" />
		<input type="button" value="submit4"
			onclick="javascript:document.f.action='login/login4';document.f.submit();" />
	</form>
	<br>
	AccessWebElements结束 <br />
</body>
</html>