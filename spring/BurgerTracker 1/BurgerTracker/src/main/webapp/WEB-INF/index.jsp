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
	<h1>Burger Tracker</h1>


	<table>
	
		<tr>
		
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating(out of 5)</th>
			<th>Action</th>
		</tr>
		 <c:forEach var="burger" items="${burgers}">
		<tr>
		
			<td>${burger.getBurgerName()}</td>
			<td>${burger.getRestaurantname()}</td>
			<td>${burger.getRating()}</td>
			<td><a href="/burger/${burger.id}/edit">edit</a></td>
		</tr>
		</c:forEach>

	</table>
	<h2>Add a Burger</h2>
	
	<form:form action="/burger" method="post" modelAttribute="burger">
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