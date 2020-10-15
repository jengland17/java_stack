<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<h1>Questions Dashboard <a class="float-right" href="/logout">Logout</a></h1>
		
		
		<table class="table table-striped table-bordered table-hover mt-4">
		
			<tr>
				<th>Question</th>
				<th>Tags</th>
			</tr>
			<c:forEach items="${allQuestions }" var="question">
				<tr>
					<td><a href="/question/${question.id}"> ${question.question} </a></td>
					<td> ${question.tagDescription()} </td>
				</tr>
			</c:forEach>
		
		</table>
		
		<a class="float-right" href="/question">New Question</a>
		
		
	
	
	
	
	
	</div>
	
</body>


</html>