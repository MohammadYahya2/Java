<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Burger</h1>
	<form:form action="/burger/${burger.id}" method="post"
		modelAttribute="book">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="burgerName">burgerName</form:label>
			<form:errors path="burgerName" />
			<form:input path="burgerName" />
		</p>
		<p>
			<form:label path="restaurantname">restaurantname</form:label>
			<form:errors path="restaurantname" />
			<form:input path="restaurantname" />
		</p>
		<p>
			<form:label path="rating">rating</form:label>
			<form:errors path="rating" />
			<form:input type="number" path="rating" />
		</p>
		<p>
			<form:label path="noting">noting</form:label>
			<form:errors path="noting" />
			<form:textarea path="noting" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>