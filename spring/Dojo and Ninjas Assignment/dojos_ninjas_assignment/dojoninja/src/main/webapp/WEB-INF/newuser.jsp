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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="mx-auto text-center">
	
		<h1>New Ninja</h1>
	<label>Dojo</label>
	<form:form action="/ninjas/new" method="post" modelAttribute="newNinja" class="w-50 mx-auto text-center" >
			<form:select path="dojo">
			
				<c:forEach var="onedojo" items="${dojos}">
					<form:option value="${onedojo.id}">${onedojo.name}</form:option>
				</c:forEach>
			</form:select>
		
	    <p>
	        <form:label path="first_name">First Name:</form:label>
	        <form:errors path="first_name"/>
	        <form:input class="form-control" path="first_name"/>
	    </p>
	    <p>
	        <form:label path="last_name">Last Name:</form:label>
	        <form:errors path="last_name"/>
	        <form:input class="form-control" path="last_name"/>
	    </p>
	    <p>	
	        <form:label path="age">Age:</form:label>
	        <form:errors path="age"/>
	        <form:input type="number" class="form-control" path="age"/>
	    </p>
	       
	    <input class="btn btn-secondary" type="submit" value="Submit"/>
	</form:form> 
	
</body>
</html>