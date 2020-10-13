<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">

		<div class="d-flex flex-row justify-content-between align-items-center">

			<h1>Top Ten Songs:</h1>

			<a href="/dashboard"> Dashboard </a>

		</div>

		<div class="mt-4">


			<table class="table table-striped table-bordered mt-5 text-center">

				<thead>
					<tr>
						<th>Rating</th>
						<th>Title</th>
						<th>Artist</th>
					</tr>
				</thead>

				<tbody>

					<c:forEach items="${songs}" var="song">
						<tr>
							<td> <c:out value="${song.rating}" /> </td>
							<td><a href="/songs/${song.id}"> <c:out value="${song.title}" /> </a></td>
							<td> <c:out value="${song.artist}" /> </td>
						</tr>
					</c:forEach>

				</tbody>

			</table>


		</div>





	</div>

</body>


</html>