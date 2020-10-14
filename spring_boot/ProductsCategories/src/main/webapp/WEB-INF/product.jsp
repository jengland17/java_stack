<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>


<body>

	<div class="container mt-5">


		<div class="row">

			<div class="col-sm-6">

				<h1 class="mb-5">Add Product</h1>

				<form:form action="/products" method="post" modelAttribute="product">

					<div class="form-group">
						<form:label path="name">Product Name</form:label>
						<form:input class="form-control" path="name" />
						<form:errors class="text-danger" path="name" />
					</div>

					<div class="form-group">
						<form:label path="description">Description</form:label>
						<form:input class="form-control" path="description" />
						<form:errors class="text-danger" path="description" />
					</div>

					<div class="form-group">
						<form:label path="price">Price</form:label>
						<form:input class="form-control" path="price" />
						<form:errors class="text-danger" path="price" />
					</div>

					<input class="btn btn-success" type="submit" value="Create">

				</form:form>

			</div>

			<div class="col-sm-6">

				<h1 class="mb-5">Add Category</h1>

				<form:form action="/categories" method="post"
					modelAttribute="category">

					<div class="form-group">
						<form:label path="name">Category Name</form:label>
						<form:input class="form-control" path="name" />
						<form:errors class="text-danger" path="name" />
					</div>

					<input class="btn btn-success" type="submit" value="Create">

				</form:form>

			</div>

		</div>

		<div class="row">

			<div class="col-sm-6">

				<table class="table table-striped table-hover text-center mt-5">

					<tr>
						<th>Name</th>
						<th>Description</th>
						<th>Price</th>
						<th>Categories</th>
					</tr>
					<c:forEach items="${products}" var="product">
						<tr>
							<td>${product.name}</td>
							<td>${product.description}</td>
							<td>$${product.price}</td>
							<td>${product.categoryDescription()}</td>
						</tr>
					</c:forEach>

				</table>

			</div>

			<div class="col-sm-6">

				<form class="mt-5" action="/addCategory" method="post">

					<div class="form-group">

						<label> Product </label> 
						<select name="product_id">
							<c:forEach items="${products}" var="product">
								<option value="${product.id }"> ${product.name} </option>
							</c:forEach>
						</select>

					</div>
					<div class="form-group">

						<label> Category </label> 
						<select name="category_id">
							<c:forEach items="${categories}" var="category">
								<option value="${category.id }"> ${category.name} </option>
							</c:forEach>
						</select>

					</div>
					
					<input class="btn btn-success" type="submit" value="Add">

				</form>

			</div>

		</div>

	</div>

</body>


</html>