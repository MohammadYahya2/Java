<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Registration and Login</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	integrity="sha384-rGhONNRgFzWjzG5FVpMOGfqcAv5jHc9puFzWpgYdjDDt4egKK+b8B+qYLt8O+UQ*"
	crossorigin="anonymous">
 <style>
        .form-text {
    margin-top: .25rem;
    font-size: .875em;
    color:red;
}
    </style>

</head>
<body>
<div class="d-flex justify-content-center align-items-center" style="height:100px;">
    <div>
        <h1>Welcome </h1>
    </div>
</div>
	<div class="container mt-2">
		<div class="row justify-content-center">
			<div class="col-4">
				<h1 class="mb-3">Register</h1>
				<form:form action="/register" method="post" modelAttribute="newUser">

					<div class="mb-3">
						<form:label class="form-label" for="userName" path="userName">User Name</form:label>
						<form:input class="form-control" id="userName" path="userName" />
						<form:errors class="form-text" for="userName" path="userName" />
					</div>

					<div class="mb-3">
						<form:label class="form-label" for="email" path="email">Email</form:label>
						<form:input class="form-control" id="email" path="email" />
						<form:errors class="form-text" for="email" path="email" />
					</div>

					<div class="mb-3">
						<form:label class="form-label" for="password" path="password">Password</form:label>
						<form:input class="form-control" id="password" path="password"
							type="password" />
						<form:errors class="form-text" for="password" path="password" />
					</div>

					<div class="mb-3">
						<form:label class="form-label" for="confirm" path="confirm">Confirm Password</form:label>
						<form:input class="form-control" id="confirm" path="confirm"
							type="password" />
						<form:errors class="form-text" for="confirm" path="confirm" />
					</div>

					<button type="submit" class="btn btn-outline-primary">Submit</button>
				</form:form>
			</div>

			<div class="col-4 ms-5">
				<h1 class="mb-3">Login</h1>
				<form:form action="/login" method="post" modelAttribute="user">

					<div class="mb-3">
						<form:label class="form-label" for="email" path="email">Email</form:label>
						<form:input class="form-control" id="email" path="email" />
						<form:errors class="form-text" for="email" path="email" />
					</div>

					<div class="mb-3">
						<form:label class="form-label" for="password" path="password">Password</form:label>
						<form:input class="form-control" id="password" path="password"
							type="password" />
						<form:errors class="form-text" for="password" path="password" />
					</div>

					<button type="submit" class="btn btn-outline-primary">Submit</button>
				</form:form>
			</div>
		</div>
	</div>


</body>
</html>
