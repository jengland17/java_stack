<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Answer</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">

		<a class="float-right" href="/dashboard">Dashboard</a>

		<div class="row">

			<div class="col">

				<h1>${someQuestion.question}</h1>

				<c:forEach items="${someQuestion.tags }" var="tag">
					<p class="badge badge-pill badge-info">${tag.tag}</p>
				</c:forEach>

			</div>

		</div>

		<div class="row">

			<div class="col-sm-6">

				<div class="card">

					<div class="card-header bg-dark text-light">Answers</div>
					<div class="card-body">

						<c:forEach items="${someQuestion.answers }" var="answer">
							<p>${answer.user.firstName}:  ${answer.answer}</p>
						</c:forEach>

					</div>

				</div>

				<h1>Add your Answer:</h1>

				<form:form action="/question/${someQuestion.id}/answer"
					method="post" modelAttribute="newAnswer">

					<div class="form-group">

						<form:label path="answer">Answer:</form:label>
						<form:textarea class="form-control" path="answer"></form:textarea>
						<form:errors class="text-danger" path="answer" />

					</div>

					<input class="btn btn-info float-right" type="submit"
						value="Answer!">

				</form:form>

			</div>

		</div>

	</div>

</body>


</html>