<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.example.beans.User" scope="session"/>


<!DOCTYPE html>
<html>
<head>
    <title>Form Output</title>
</head>
<body>
    <h2>Output:</h2>
<jsp:setProperty property="*" name="user"/>
    First Name: <%= user.getFirstName() %><br>
    Last Name: <jsp:getProperty property="lastName" name="user"/>
</body>
</html>
