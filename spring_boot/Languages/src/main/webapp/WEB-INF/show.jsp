<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Show Language</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<h1 class="text-center mt-5"> Language Info: </h1>

	<div class="container">
	
		<a class="float-right" href="/languages"> Dashboard </a>
		
		<p class="mt-5"> Language Name: <c:out value="${language.name}" /> </p>
		
		<br>
		
		<p> Language Creator: <c:out value="${language.creator}"/> </p>
		
		<br>
		
		<p> Language Version: <c:out value="${language.version}"/> </p>
		
		<br>
	
		<p> <a class="btn btn-info mr-3" href="/languages/${language.id}/edit">Edit</a>  <a class="btn btn-danger" href="/delete/${language.id}">Delete</a> </p>
	
	</div>
	
	
</body>


</html>