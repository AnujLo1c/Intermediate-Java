<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Members Page</title>
</head>
<body>
<h1>Data:- </h1>

<%
String username=null, sessionId=null;
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("user")){
			username=cookie.getValue();
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionId=cookie.getValue()
				;
		}
	}
	if(username==null || sessionId==null){
		response.sendRedirect("login.jsp");
	}
}


%>

FirstName<%= username %>
SessionId<%= sessionId %>
</body>
</html>