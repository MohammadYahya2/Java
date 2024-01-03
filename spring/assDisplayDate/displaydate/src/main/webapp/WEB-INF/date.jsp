<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <script>
        function showAlert() {
            alert("the date template");
        }
    </script>
</head>
<body>
    <% 
        java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
        String currentDate = df.format(new java.util.Date());
    %>
    <h1>Current Date: <%= currentDate %> </h1>
    <script>
        showAlert();
    </script>
</body>
</html>
