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
   <a href="/home">go back</a>
    <form:form action="/books/new" method="post" modelAttribute="newBook" class="w-50 mx-auto text-center">
        <p>
            <form:label path="title">Title:</form:label>
            <form:errors path="title"/>
            <form:input class="form-control" path="title"/>
        </p>
        <p>
            <form:label path="author">Author:</form:label>
            <form:errors path="author"/>
            <form:input class="form-control" path="author"/>
        </p>
        <p>
            <form:label path="mythounghts">My Thoughts:</form:label>
            <form:errors path="mythounghts"/>
            <form:input type="text" class="form-control" path="mythounghts"/>
        </p>
        <input class="btn btn-secondary" type="submit" value="Submit"/>
    </form:form>

</body>
</html>