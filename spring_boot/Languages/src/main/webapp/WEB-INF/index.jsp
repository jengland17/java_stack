<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>
		
	<h1 class="text-center mt-5">Coding Languages</h1>

	<div class="container mt-5 d-flex justify-content-around align-items-center">

		<div class="top">


			<table class="table table-striped table-bordered mt-5 text-center">

				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>

					<c:forEach items="${languages}" var="lang">
						<tr>
							<td><a href="/languages/${lang.id}"> <c:out value="${lang.name}" /> </a></td>
							<td><c:out value="${lang.creator}" /></td>
							<td><c:out value="${lang.version}" /></td>
							<td><a href="/delete/${lang.id}">Delete</a> | <a href="/languages/${lang.id}/edit">Edit</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>

		</div>

		<div class="bottom">
		
			<form:form action="/languages" method="post"
				modelAttribute="language">

				<p class="form-group">
					<form:label path="name">Name</form:label>
					<form:input class="form-control" path="name" />
					<form:errors class="text-danger" path="name" />
				</p>

				<p class="form-group">
					<form:label path="creator">Creator</form:label>
					<form:input class="form-control" path="creator" />
					<form:errors class="text-danger" path="creator" />
				</p>

				<p class="form-group">
					<form:label path="version">Version</form:label>
					<form:input class="form-control" path="version" />
					<form:errors class="text-danger" path="version" />
				</p>

				<input class="btn btn-primary float-right" type="submit"
					value="Submit" />

			</form:form>
			
		</div>
		
	</div>

</body>


</html>