<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<body>

	<h1>
		Your Gold: <label for="number">
		<input type="text" value="${golds}" name="number" id="number">
		</label>
	</h1>


	<div
		style="display: flex; align-items: center; justify-content: center">

		<form action="/golds?place=farm" method="POST">

			<div class="card">
				<h2>Farm</h2>
				<p>(earns 10-20 Gold)</p>

				<button type="submit" class="button">Find Gold !</button>
			</div>
		</form>


		<form action="/golds?place=cave" method="POST">


			<div class="card">
				<h2>Cave</h2>
				<p>(earns 5-10 Gold)</p>

				<button type="submit" class="button">Find Gold !</button>
			</div>
		</form>

		<form action="/golds?place=house" method="POST">


			<div class="card">
				<h2>House</h2>
				<p>(earns 2-5 Gold)</p>

				<button type="submit" class="button">Find Gold !</button>
			</div>
		</form>

		<form action="/golds?place=quest" method="POST">


			<div class="card">
				<h2>Quest</h2>
				<p>(earns/takes 0-50 Gold)</p>
				<button type="submit" class="button">Find Gold !</button>
			</div>
		</form>
	</div>

	<div>
		<h1>Activities</h1>
	</div>
	<div
		style="display: flex; align-items: center; justify-content: center">
		<div class="scrollable-container">

			<p>${logs}</p>

		</div>

	</div>

</body>
</html>