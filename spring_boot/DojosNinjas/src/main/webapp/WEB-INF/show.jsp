<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Dojo Ninja</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<h1 class="mb-5">Ninjas at the ${dojo.name} Dojo</h1>
		
		<table class="table table-striped table-dark table-hover">
		
			<thead>
			
				<tr>
					<th> First Name </th>
					<th> Last Name </th>
					<th> Age </th>
				</tr>
			
			</thead>
			<tbody> 
			
				<c:forEach items="${dojo.ninjas}" var="ninja">
				
					<tr>
						<td>${ninja.firstName}</td>
						<td>${ninja.lastName}</td>
						<td>${ninja.age}</td>
					</tr>
				
				</c:forEach>
			
			</tbody>
		
		</table>
	
	</div>

</body>


</html>