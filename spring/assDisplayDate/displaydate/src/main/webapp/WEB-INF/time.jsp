<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    <%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<script>
        function showAlert() {
            alert("the Time template");
        }
    </script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   Date date = new Date(); out.println(dateFormat.format(date));%>
</body>
<script>
        showAlert();
    </script>
</html>