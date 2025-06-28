<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login User</title>
</head>
<body>
<h2>Login</h2>

<form action="<%= request.getContextPath()%>/LoginController" method="post">

FirstName <input type="text" name="firstName"  /><br>
Password <input type="text" name="password" />
<br>
<input type="submit" value="Submit">
</form>
</body>
</html>