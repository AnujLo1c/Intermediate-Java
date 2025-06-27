<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<jsp:useBean id="user" class="org.anujl.beans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
FirstName <jsp:setProperty property="firstName" name="user" value="anuj"/></br>
FirstName <jsp:setProperty property="lastName" name="user" value="l"/>
</body>
</html>