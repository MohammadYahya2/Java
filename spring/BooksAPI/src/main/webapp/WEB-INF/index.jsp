<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
</head>
<body>
    <h1>All Books</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td><c:out value="${book.id}" /></td>
                <td><c:out value="${book.title}" /></td>
                <td><c:out value="${book.language}" /></td>
                <td><c:out value="${book.numberOfPages}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
