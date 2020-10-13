<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Ninja</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container">
	
		<h1> New Ninja </h1>
		
		<form:form action="/addNinja" method="post" modelAttribute="ninja"> 
		
			<p class="form-group"> 
			
				<form:label path="dojo"> Dojo Location: </form:label>
				<form:select class="form-control" path="dojo" > 
					
					<c:forEach items="${dojos}" var="dojo">
					
					<form:option value="${dojo.id}"> ${dojo.name} </form:option>
					
					</c:forEach>
					
				
				</form:select>
				<form:errors class="text-danger" path="dojo" />
			
			</p>
		
		
			<p class="form-group"> 
			
				<form:label path="firstName"> First Name: </form:label>
				<form:input class="form-control" path="firstName" />
				<form:errors class="text-danger" path="firstName" />
			
			</p>
			
			<p class="form-group"> 
			
				<form:label path="lastName"> Last Name: </form:label>
				<form:input class="form-control" path="lastName" />
				<form:errors class="text-danger" path="lastName" />
			
			</p>
			
			<p class="form-group"> 
			
				<form:label path="age"> Age: </form:label>
				<form:input class="form-control" path="age" />
				<form:errors class="text-danger" path="age" />
			
			</p>
			
			<input class="btn btn-info" type="submit" value="Create" >
		
		</form:form>
	
	</div>

</body>


</html>