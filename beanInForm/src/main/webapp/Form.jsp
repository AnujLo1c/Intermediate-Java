<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Form Input</title>
</head>
<body>
    <form action="FormValue.jsp" method="post">
    <jsp:useBean id="user" class="com.example.beans.User" scope="session"/>
        First Name: <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>'><br><br>
        Last Name: <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
