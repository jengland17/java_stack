<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Dojo</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<h1 class="mb-5">New Dojo </h1>
		
		<form:form class="w-25" action="/addDojo" method="post" modelAttribute="dojo">
		
			<p class="form-group">
			
				<form:label path="name">Name: </form:label>
				<form:input class="form-control" path="name" />
				<form:errors class="text-danger" path="name" />
			
			</p>
		
		
			<input class="btn btn-info" type="submit" value="Create">
		
		</form:form>
		
	
	</div>

</body>


</html>