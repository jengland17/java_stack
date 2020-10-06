<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
    
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container">
	
		<h1 class="text-center mt-3"> Dojo Survey </h1>
	
		<div class="row mt-5">
		
			<div class="col-sm-8 offset-sm-2">
			
				<div class="card">
				
					<div class="card-body">
					
						<form action="/form" method="post">
						
							<div class="form-group">
								<label>Your Name:</label>
								<input type="text" name="name" class="form-control">
							</div>
							
							<div class="form-group">
								<label>Dojo Location:</label>
								<select name="location" class="form-control">
									<option value="San Jose">San Jose</option>
									<option value="Dallas">Dallas</option>
									<option value="Seattle">Seattle</option>
									<option value="Boise">Boise</option>
									<option value="Tulsa">Tulsa</option>
									<option value="DC">DC</option>
									<option value="Chicago">Chicago</option>
								</select>
							</div>
							
							<div class="form-group">
								<label>Favorite Language:</label>
								<select name="language" class="form-control">
									<option value="Python">Python</option>
									<option value="JavaScript">JavaScript</option>
									<option value="Java">Java</option>
									<option value="HTML">HTML</option>
									<option value="CSS">CSS</option>
								</select>
							</div>
							
							<div class="form-group">
								<label>Comment (optional): </label>
								<textarea name="comment" class="form-control"></textarea>
							</div>
							
							<input type="submit" value="Submit" class="btn btn-primary float-right">
						
						</form>
					
					</div>
					
				</div>
			
			</div>
	
		</div>

	</div>

</body>


</html>