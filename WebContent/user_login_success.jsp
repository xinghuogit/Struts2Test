<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Success</title>
</head>
<body>
	User Login Success!
	<br />
	<s:property value="#request.r1"/>|<%=request.getAttribute("r1") %><br>
	<s:property value="#session.s1"/>|<%=session.getAttribute("s1") %><br>
	<s:property value="#application.a1"/>|<%=application.getAttribute("a1") %><br>
	<s:property value="#attr.r1"/><br>
	<s:property value="#attr.s1"/><br>
	<s:property value="#attr.a1"/><br>
	<br />
	<s:debug></s:debug>
</body>
</html>