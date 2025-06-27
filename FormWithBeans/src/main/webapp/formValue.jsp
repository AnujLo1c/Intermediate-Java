<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.anujl.beans.User" scope="session"></jsp:useBean>
FirstName <jsp:getProperty property="firstName" name="user"/></br>
FirstName <jsp:getProperty property="lastName" name="user"/>
</body>
</html>