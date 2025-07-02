<jsp:include page="include/header.jsp"></jsp:include>
<%@ page import="java.util.List" %>
<%@ page import="org.anujl.entity.User" %>
<h1>list</h1>
<table>
<thead>
<th>User Id </th>
<th>User Name </th>
<th>Last Name </th>
</thead>
<%
List<User> arr=(List)request.getAttribute("data");
if(arr.size()!=0){


for(User u:arr){
	out.print("<tr>");
	out.print("<td> "+u.getU_id()+" </td>");
	out.print("<td> "+u.getUsername()+" </td>");
	out.print("<td> "+u.getPassword()+" </td>");
	out.print("<tr>");
}
}
else{
	out.print("empty");
}
%>


</table>x


<jsp:include page="include/footer.jsp"></jsp:include>