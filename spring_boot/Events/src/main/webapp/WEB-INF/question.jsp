<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Question</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">

		<h1>What is your question?</h1>

		<form:form class="mt-5" action="/question/new" method="post" modelAttribute="newQuestion">

			<div class="form-group">
				<form:label path="question">Question</form:label>
				<form:textarea class="form-control" path="question"></form:textarea>
				<form:errors class="text-danger" path="question" />
			</div>
			
			<div class="form-group">
				<form:label path="tagInput">Tag</form:label>
				<form:input class="form-control" path="tagInput" />
				<form:errors class="text-danger" path="tagInput" />
			</div>

			<input class="btn btn-primary float-right" type="submit" value="Submit">

		</form:form>

	</div>

</body>


</html>