<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Books</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-4">

		<h1 class="text-center">All Books</h1>
		
		<table class="table mt-5">
		
			<thead>
				<tr>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${books}" var="book">
					<tr>
						<td><a href="/show/${book.id}"> <c:out value="${book.title}" /> </a></td>
						<td> <c:out value="${book.description}" /> </td>
						<td> <c:out value="${book.language}" /> </td>
						<td> <c:out value="${book.numberOfPages}" /> </td>
					</tr>
				</c:forEach>
			</tbody>
			
		</table>
		
		<a class="mt-4" href="/books/new">New Book</a>

	</div>

</body>


</html>