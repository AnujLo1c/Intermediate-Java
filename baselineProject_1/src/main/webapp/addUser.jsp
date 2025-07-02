<jsp:include page="include/header.jsp" />
<form  action="${pageContext.request.contextPath}/home" method="post" >
First Name<input name="name" type="text">
Password<input name="pass" type="text">
  <input type="hidden" name="form" value="addform" />


<input type="submit" value="Add User">
</form>
<jsp:include page="include/footer.jsp"></jsp:include>