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

	<div class="container mt-5">
	

		<div class="top">

			<p class="float-right mr-5">
				<a class="mr-3" href="/delete/${language.id}">Delete</a> <a href="/languages">Dashboard</a>
			</p>
		</div>


		<div class="bottom">

			<form:form action="/languages/${language.id}/edit" method="post" modelAttribute="language">
			
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