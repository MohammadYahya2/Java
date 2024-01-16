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
</head>
<body>
	<h1>${book.title}</h1>
	<h3>${book.user.userName} read ${book.title} by ${book.author}</h3>
	<h4>${book.mythounghts}</h4>
	<form:form action="/books/${book.id}" method="post"
		modelAttribute="book">
		<input type="hidden" name="_method" value="delete" />
		<input class="btn btn-outline-danger" type="submit" value="Delete" />
		
	</form:form>
<c:if test="${not empty sessionScope.loginId}">
    <a href="/books/${book.id}/edit">Edit</a>
</c:if>


	<%--
	
	
	<%
   String userId = (String) session.getAttribute("loginId");
   if (userId != null && !userId.isEmpty()) {
%>
   <a href="/editPage.jsp">Edit</a>
<%
   }
%>
	
	
	
	
	<td><a class="btn btn-outline-info" href="/books/${book.id}/edit" role="button">edit</a>
	 --%>
	
	<p>
		<a href="/home">back</a>
	</p>




</body>
</html>