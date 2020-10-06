<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>The Code</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container">
	
		<div class="row mt-5">
		
			<div class="col-sm-8 offset-sm-2">
			
				<div class="card outlin-dark">
					<div class="card-body">
					
					<p class="text-danger text-center">${message}</p>
					
						<form action="/process" method="post">
						
							<div class="form-group text-center">
								<label>What is the code?</label>
								<input type="text" name="code" class="form-control">
							</div>
							
							<input type="submit" value="Try Code" class="btn btn-primary btn-block">
						
						</form>
					
					</div>
				</div>
			
			</div>
	
	
		</div>

	</div>


</body>


</html>