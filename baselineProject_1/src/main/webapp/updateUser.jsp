<jsp:include page="include/header.jsp" />
<form  action="${pageContext.request.contextPath}/home" method="post">
Input Id <input type="number" required="required" name="id" /><br>

Fill details to update :-<br>
User Name <input type="text" name="user"/><br>
Password <input type="text" name="pass"/>
<input  type="hidden" name="form" value="update"/>
<br><input type="submit" />
</form>
<jsp:include page="include/footer.jsp"></jsp:include>