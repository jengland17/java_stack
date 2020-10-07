<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container d-flex flex-column">
	
	
		<div class="top mt-5">
			<h1>Your Gold: <c:out value="${gold}" /> </h1>
		</div>
		
		<div class="main d-flex flex-row justify-content-around mt-5">
		
			<div class="card">
			
				<div class="card-body text-center">
				
					<h2>Farm</h2>
					<p>(earns 10-20 gold)</p>
					<form action="/form" method="post">
						<input type="hidden" name="building" value="farm">
						<input type="submit" value="Find Gold!" class="btn btn-warning" >
					</form>
				
				</div>
			
			</div>
		
			<div class="card">
			
				<div class="card-body text-center">
				
					<h2>Cave</h2>
					<p>(earns 5-10 gold)</p>
					<form action="/form" method="post">
						<input type="hidden" name="building" value="cave">
						<input type="submit" value="Find Gold!" class="btn btn-warning" >
					</form>
				
				</div>
			
			</div>
			
			<div class="card">
			
				<div class="card-body text-center">
				
					<h2>House</h2>
					<p>(earns 2-5 gold)</p>
					<form action="/form" method="post">
						<input type="hidden" name="building" value="house">
						<input type="submit" value="Find Gold!" class="btn btn-warning" >
					</form>
				
				</div>
			
			</div>
			
			<div class="card">
			
				<div class="card-body text-center">
				
					<h2>Casino</h2>
					<p>(earns/takes 0-50 gold)</p>
					<form action="/form" method="post">
						<input type="hidden" name="building" value="casino">
						<input type="submit" value="Find Gold!" class="btn btn-warning" >
					</form>
				
				</div>
			
			</div>
		
		</div>
		
		<div class="bottom mt-5">
		
			<h1>Activities: </h1>
			
			<div class="overflow-auto  p-3 mb-3 mb-md-0 mr-md-3 bg-light " style="max-width: 5000px; max-height: 250px;">
			
				<c:forEach items="${activities}" var="activity">
				
					<p> <c:out value="${activity}"/> </p>
					
				</c:forEach>
				
			</div>
			
			<div class="reset mt-3">
			
				<a href="/reset" class="btn btn-danger"> Start Over</a>
			
			</div>

		</div>
	
	</div>

</body>


</html>