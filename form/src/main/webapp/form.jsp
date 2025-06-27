<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Programming Language Form</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="${pageContext.request.contextPath}/Form" method="post">

        Name: <input type="text" name="name" required /><br><br>

        Select Programming Languages:<br>
        <input type="checkbox" name="languages" value="Java" /> Java<br>
        <input type="checkbox" name="languages" value="Python" /> Python<br>
        <input type="checkbox" name="languages" value="C++" /> C++<br>
        <input type="checkbox" name="languages" value="JavaScript" /> JavaScript<br><br>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>
