<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>New Book</title>
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<h1 class="mb-4"><c:out value="${book.title}"/></h1>
		
		<p>Description: <c:out value="${book.description}"/></p>
		<p>Language: <c:out value="${book.language}"/></p>
		<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
		
		<div class="d-flex flex-row">
		
			<a class="mr-4 btn btn-info" href="/books/${book.id}/edit">Edit Book</a>
		
			<form action="/delete/${book.id}" method="post">
    			<input type="hidden" name="_method" value="delete">
    			<input class="btn btn-danger" type="submit" value="Delete">
			</form>
		
		</div>
		
	
	</div>

</body>


</html>