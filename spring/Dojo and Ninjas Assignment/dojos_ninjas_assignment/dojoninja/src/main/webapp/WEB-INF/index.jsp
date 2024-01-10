<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 style="text-align: center;" > <c:out value="${dojo.name}"/> </h1>
	<table class="table table-hover">
	<thead>
		<tr>
			<th scope="col">First Name</th>
			<th scope="col">Last Name</th>
			<th scope="col">Age</th>
		</tr>
		</thead>
		<c:forEach items="${dojo.ninjas}" var="dojo" >
			<tr>
				<td ><c:out value="${dojo.getFirst_name()}" /></td>
				<td><c:out value="${dojo.getLast_name()}" /></td>
				<td><c:out value="${dojo.getAge()}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>