<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" 
          integrity="sha384-rGhONNRgFzWjzG5FVpMOGfqcAv5jHc9puFzWpgYdjDDt4egKK+b8B+qYLt8O+UQ*" 
          crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${email}</p>
<h1>Welcome,${userName}</h1>

 <a href="/books/new"  >+Add a to my shelf!</a>
<%-- 
<div class="d-flex justify-content-end">
  <a href="/logout" class="btn btn-danger" >Log Out</a>
</div>
 --%>

<h5>Books form everyone's shelves:</h5>
<table class="table table-hover">
	<thead>
		<tr>
			<th scope="col">ID</th>
			<th scope="col">Title</th>
			<th scope="col">Author Name</th>
			<th scope="col">Posted By</th>
		</tr>
		</thead>
		<c:forEach items="${books}" var="book" >
			<tr>
				<td ><c:out value="${book.id}" /></td>
				<td><a href="/show/${book.id}">${book.title}</a></td>
				<td><c:out value="${book.author}" /></td>
				<td><c:out value="${book.user.userName}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>