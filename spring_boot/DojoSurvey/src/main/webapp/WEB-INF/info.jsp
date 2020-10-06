<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>       
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Results</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
	
		<div class="row">
		
			<div class="col-sm-8 offset-sm-2">
			
				<div class="card">
				
					<div class="card-body">
					
						<h1>Submitted Info:</h1>
						
						<p> Name: <c:out value="${name}"/> </p>
						<p> Dojo Location: <c:out value="${location}"/> </p>
						<p> Favorite Language: <c:out value="${language}"/> </p>
						<p> Comment: <c:out value="${comment}"/> </p>
						
						<a class="btn btn-primary float-right" href="/">Go Back</a>
					
					</div>
		
				</div>
	
			</div>
		
		</div>
	
	</div>
	
</body>


</html>