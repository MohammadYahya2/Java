<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<style>
form { 
margin: 0 auto; 
width:700px;
.container{
    margin-top:200px;
}

.btn:hover{
    color:#fff;
}

.input-text:focus{
       
  
    box-shadow: 0px 0px 0px;
    border-color:#f8c146;
    outline: 0px;
}

.form-control {
    border: 1px solid #f8c146;
}

}

</style>
   <h1>Save Travels</h1>
   <div class="container justify-content-center">
    
    <div class="row">

       <div class="col-md-8">
           
           <div class="input-group mb-3">
  <input type="text" class="form-control input-text" placeholder="Search products...." aria-label="Recipient's username" aria-describedby="basic-addon2">
  <div class="input-group-append">
    <button class="btn btn-outline-warning btn-lg" type="button">Search<i class="fa fa-search" style="margin-left: 10px"></i></button>
  </div>
</div>
           
       </div>        
        
    </div>
    
    
</div>
	<table class="table table-bordered table-striped">
	<thead>
		<tr>
			<th scope="col">Expense</th>
			<th scope="col">Vendor</th>
			<th scope="col">Amount</th>
			<th scope="col">Actions</th>
		</tr>
		</thead>
		<c:forEach items="${travels}" var="savetravels" >
			<tr>
				<td ><a  class="btn btn-outline-success" href="expenses/${savetravels.id}/show"><c:out value="${savetravels.getExpenseName()} " /></a></td>
				<td><c:out value="${savetravels.getVendor()}" /></td>
				<td><c:out value="$${savetravels.getAmount()}" /></td>
				<td><a class="btn btn-outline-info" href="/expenses/${savetravels.id}/edit" role="button">edit</a>
				<td>
			    <form:form action="/expenses/${savetravels.id}/delete" method="post" modelAttribute="travels">
			    <input type="hidden" name="_method" value="delete"/>
			    <input class="btn btn-outline-danger" type="submit" value="Delete"/>
			    </form:form>
				</td>
				</td>
				
			</tr>
		</c:forEach>
	</table> 	 
	
	<form:form action="/expenses" method="post" modelAttribute="savetravels">
	<h2>Add an expense:</h2>
		<div class="form-group">
			<form:label path="expenseName">Expense Name:</form:label>
			<form:errors path="expenseName" />
			<form:input class="form-control" path="expenseName"  />
		</div>
		<div class="form-group">
			<form:label path="vendor">Vendor</form:label>
			<form:errors path="vendor" />
			<form:input  class="form-control" path="vendor" />
		</div>
		<div>
			<form:label path="amount">Amount</form:label>
			<form:errors path="amount" />
			<form:input  class="form-control" type="number" path="amount" />
		</div>
		<div>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea class="form-control" path="description" />
		</div>
		<div style="margin-top: 10px">
		<input  class="btn btn-primary btn-lg btn-block" type="submit" value="Submit" />
		</div>
	</form:form>
	
</body>
</html>

