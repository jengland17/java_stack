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

		<div class="navbar  navbar-dark bg-dark">

			<a href="/songs/new" class="navbar-brand">Add New Song</a> 
			
			<a href="/search/topten" class="navbar-brand"> Top Ten </a>
			
			<a href="/logout" class="navbar-brand">Logout</a>

			<form action="/dashboard" method="get">
			<input class="form-control form-control-sm ml-3 w-75" type="text" placeholder="Search Artist's" name="search">
			</form>


		</div>
		
		<div>
		
			<table class="table table-striped table-bordered mt-5 text-center">

				<thead>
					<tr>
						<th>Artist</th>
						<th>Song</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>

					<c:forEach items="${songs}" var="song">
						<tr>
							<td> ${song.artist} </td>
							<td><a href="/songs/${song.id}"> <c:out value="${song.title}" /> </a></td>
							<td><a class="btn btn-danger" href="/delete/${song.id}">Delete</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
			
		</div>
		
	

	</div>


</body>


</html>