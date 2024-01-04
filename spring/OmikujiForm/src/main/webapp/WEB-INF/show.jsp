<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<style>
    body {
        display: flex;
        align-items: center;
        justify-content: center;
        margin: 0;
        
    }

    p {
        background-color: blue;
        border: 2px solid black; 
        padding: 10px; 
        background-color: blue; 
    }
</style>
</head>
<body>
    <h1>Here's Your Omikuji !</h1>
    <p>
        In <c:out value="${number}"></c:out> years, you will live in <c:out value="${city}"></c:out> with Bob Dylan as your roommate,
        selling origamis for a <c:out value="${living}"></c:out>. The next time you see a <c:out value="${hobby}"></c:out>, you will have good luck.
        Also, You do not realize how happy you make others. Send and show a friend <c:out value="${Message}"></c:out>
    </p>
    <a href="/">Go Back !</a>
</body>
</html>
