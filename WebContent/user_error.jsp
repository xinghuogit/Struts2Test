<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Error</title>
</head>
<body>
	User Error!
	<s:fielderror fieldName="name" theme="simple"></s:fielderror>
	<br />
	<s:property value="errors.name[0]"/>
	<s:property value="errors.name[1]"/>
	<s:debug></s:debug>
</body>
</html>