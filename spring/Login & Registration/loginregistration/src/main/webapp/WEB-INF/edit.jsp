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
</head>
<body>
<form:form action="/books/${book.id}/edit" method="post" modelAttribute="book" class="container mt-5">
    <input type="hidden" name="_method" value="PUT">
    <h1>Edit Book</h1>
    <div class="form-group">
        <form:label path="title">title:</form:label>
        <form:errors path="title" />
        <form:input class="form-control" path="title" />
    </div>
    <div class="form-group">
        <form:label path="author">author:</form:label>
        <form:errors path="author" />
        <form:input class="form-control" type="text" path="author" />	
    </div>
    <div class="form-group">
        <form:label path="mythounghts">mythounghts:</form:label>
        <form:errors path="mythounghts" />
        <form:textarea class="form-mythounghts" path="mythounghts" />
    </div>
    <div style="margin-top: 10px">
        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Submit" />
    </div>
</form:form>

</body>
</html>