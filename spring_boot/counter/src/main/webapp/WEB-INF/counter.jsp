<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>      
    
<!DOCTYPE html>
<html>


<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">
		
		<p> You have visited <a href="/your_server"> http://your_server </a> <c:out value="${count}"/> times.</p>
		
		<a href="/your_server" > Test another visit? </a>
		
	</div>


</body>


</html>