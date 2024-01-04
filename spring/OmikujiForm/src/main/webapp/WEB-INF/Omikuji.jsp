<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    <title>Send an Omikuji</title>
</head>
	<body>
		<div class="container mt-5">
		    <div class="row justify-content-center">
		        <div class="col-md-6 "> 
		            <h1 class="text-center" >Send an Omikuji!</h1>
		            <form action="/show"  method = "POST">
		                <div class="mb-3">
		                    <label for="quantity" class="form-label">Quantity (between 5 and 25):</label>
		                    <input type="number" id="quantity" name="quantity" class="form-control" min="5" max="25" placeholder="Enter quantity">
		                </div>
		                <div class="mb-3">
		                    <label for="city" class="form-label">Enter the name of the city:</label>
		                    <input type="text" id="city" name="city" class="form-control" placeholder="Enter city">
		                </div>
		                <div class="mb-3">
		                    <label for="hobby" class="form-label">Enter Professional Endeavor or hobby:</label>
		                    <input type="text" id="hobby" name="hobby" class="form-control" placeholder="Enter hobby">
		                </div>
		                <div class="mb-3">
						    <label for="livingInput" class="form-label">Enter any type of living thing:</label>
						    <input type="text" id="living" name="living" class="form-control" placeholder="Enter living">
						</div>
						<div class="mb-3">
						    <label for="niceMessage" class="form-label">Say something nice to someone:</label>
						    <textarea id="niceMessage" name="Message" class="form-control" rows="3" placeholder="Enter your message"></textarea>
						</div>
						<p> Send and show a freind ! </p> 
		                <button type="submit" class="btn btn-primary">send</button>
		            </form>
		        </div>
		    </div>
		</div>
	</body>
</html>
