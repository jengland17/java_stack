<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>New Song</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">

		<div class="float-right">

			<a href="/dashboard">Dashboard</a>

		</div>


		<div>

			<form:form action="/songs/new" method="post" modelAttribute="newSong">

				<p class="form-group">
					<form:label path="title">Song Title: </form:label>
					<form:input class="form-control" path="title" />
					<form:errors class="text-danger" path="title" />
				</p>

				<p class="form-group">
					<form:label path="artist">Song Artist: </form:label>
					<form:input class="form-control" path="artist" />
					<form:errors class="text-danger" path="artist" />
				</p>


				<input type="submit" class="btn btn-success float-right"
					value="Add Song">


			</form:form>

		</div>


	</div>

</body>


</html>