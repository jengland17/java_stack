<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<h1>Edit Book</h1>
		
		<form:form action="/books/${book.id}/edit" method="post" modelAttribute="book">
		
			<p class="form-group">
				<form:label path="title">Title</form:label>
				<form:errors path="title" />
				<form:input class="form-control" path="title" />
			</p>
			
			<p class="form-group">
				<form:label path="description">Description</form:label>
				<form:errors path="description" />
				<form:textarea class="form-control" path="description" />
			</p>
			
			<p class="form-group">
				<form:label path="language">Language</form:label>
				<form:errors path="language" />
				<form:input class="form-control" path="language" />
			</p>
			
			<p class="form-group">
				<form:label path="numberOfPages">Pages</form:label>
				<form:errors path="numberOfPages" />
				<form:input class="form-control" type="number" path="numberOfPages" />
			</p>
			
			<input class="btn btn-primary float-right" type="submit" value="Submit" />
			
		</form:form>
		
	</div>

</body>


</html>