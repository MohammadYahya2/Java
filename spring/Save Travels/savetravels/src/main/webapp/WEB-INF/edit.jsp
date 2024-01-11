<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<form:form action="/expenses/${savetravels.id}" method="post" modelAttribute="savetravels" class="container mt-5">
    <input type="hidden" name="_method" value="PUT">
    <h1>Edit Expense</h1>
    <div class="form-group">
        <form:label path="expenseName">Expense Name:</form:label>
        <form:errors path="expenseName" />
        <form:input class="form-control" path="expenseName" />
    </div>
    <div class="form-group">
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor" />
        <form:input class="form-control" path="vendor" />
    </div>
    <div class="form-group">
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount" />
        <form:input class="form-control" type="number" path="amount" />	
    </div>
    <div class="form-group">
        <form:label path="description">Description</form:label>
        <form:errors path="description" />
        <form:textarea class="form-control" path="description" />
    </div>
    <div style="margin-top: 10px">
        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Submit" />
    </div>
</form:form>

</body>
</html>
