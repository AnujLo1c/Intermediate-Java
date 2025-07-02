<jsp:include page="include/header.jsp" />
<form method="post" action="${pageContext.request.contextPath}/home">
Enter Id:- <input type="text" name="id" />
<input type="hidden" name="form" value="delete"/>
<input type="submit">
</form>
<jsp:include page="include/footer.jsp"></jsp:include>