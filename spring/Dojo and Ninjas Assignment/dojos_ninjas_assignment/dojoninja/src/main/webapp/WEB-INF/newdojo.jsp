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
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="w-75 mx-auto text-center">
	<h1>New Dojo</h1>
	
	
	<form:form action="/dojos/new" method="post" modelAttribute="newDojo" class="w-50 mx-auto text-center">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name"/>
	        <form:input class="form-control" path="name"/>
	    </p>
	       
	    <input class="btn btn-secondary" type="submit" value="Submit"/>
	</form:form>    	
	
</body>
</html>