<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Report App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<!-- 	<nav class="navbar navbar-expand-lg bg-body-tertiary"> -->
	<!-- 		<div class="container-fluid"> -->
	<!-- 			<a class="navbar-brand" href="#">Navbar</a> -->
	<!-- 			<button class="navbar-toggler" type="button" -->
	<!-- 				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" -->
	<!-- 				aria-controls="navbarSupportedContent" aria-expanded="false" -->
	<!-- 				aria-label="Toggle navigation"> -->
	<!-- 				<span class="navbar-toggler-icon"></span> -->
	<!-- 			</button> -->
	<!-- 			<div class="collapse navbar-collapse" id="navbarSupportedContent"> -->
	<!-- 				<ul class="navbar-nav me-auto mb-2 mb-lg-0"> -->
	<!-- 					<li class="nav-item"><a class="nav-link active" -->
	<!-- 						aria-current="page" href="#">Home</a></li> -->
	<!-- 					<li class="nav-item"><a class="nav-link" href="#">Link</a></li> -->
	<!-- 					<li class="nav-item dropdown"><a -->
	<!-- 						class="nav-link dropdown-toggle" href="#" role="button" -->
	<!-- 						data-bs-toggle="dropdown" aria-expanded="false"> Dropdown </a> -->
	<!-- 						<ul class="dropdown-menu"> -->
	<!-- 							<li><a class="dropdown-item" href="#">Action</a></li> -->
	<!-- 							<li><a class="dropdown-item" href="#">Another action</a></li> -->
	<!-- 							<li><hr class="dropdown-divider"></li> -->
	<!-- 							<li><a class="dropdown-item" href="#">Something else -->
	<!-- 									here</a></li> -->
	<!-- 						</ul></li> -->
	<!-- 					<li class="nav-item"><a class="nav-link disabled" -->
	<!-- 						aria-disabled="true">Disabled</a></li> -->
	<!-- 				</ul> -->
	<!-- 				<form class="d-flex" role="search"> -->
	<!-- 					<input class="form-control me-2" type="search" placeholder="Search" -->
	<!-- 						aria-label="Search"> -->
	<!-- 					<button class="btn btn-outline-success" type="submit">Search</button> -->
	<!-- 				</form> -->
	<!-- 			</div> -->
	<!-- 		</div> -->
	<!-- 	</nav> -->

	<div class="container">

		<h1 class="pb-3 pt-3">Report Application</h1>
		<form:form action="search" modelAttribute="search" method="POST">
			<table>
				<tr>
					<td>Plane Name:</td>
					<td><form:select path="planeName">
							<form:option value="">-select-</form:option>
							<form:options items="${name}" />
						</form:select></td>

					<td>Plane Status:</td>
					<td><form:select path="planeStatus">
							<form:option value="">-select-</form:option>
							<form:options items="${status}" />
						</form:select></td>
					<td>Gender:</td>
					<td><form:select path="gender">
							<form:option value="">-select-</form:option>
							<form:option value="Male">Male</form:option>
							<form:option value="Female">Female</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>Start Date:</td>
					<td><form:input path="startDate" type="date"
							data-date-format="dd/mm/yyyy" />
					<td>End Date:</td>
					<td><form:input type="date" path="endDate" />
				</tr>
				<tr>
					<td><input type="submit" value="Search"
						class="btn btn-primary"></td>

				</tr>

			</table>

		</form:form>
		<hr />
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>holder name</th>
					<th>plane name</th>
					<th>status</th>
					<th>start date</th>
					<th>end date</th>
				</tr>
			</thead>
		</table>
		<hr />
		Export :<a href="">Excel</a> <a href="">Pdf</a>
	</div>

	<!-- 	<div class="form-check"> -->
	<!-- 		<input class="form-check-input" type="radio" name="flexRadioDefault" -->
	<!-- 			id="flexRadioDefault1"> <label class="form-check-label" -->
	<!-- 			for="flexRadioDefault1"> Male </label> -->
	<!-- 	</div> -->
	<!-- 	<div class="form-check"> -->
	<!-- 		<input class="form-check-input" type="radio" name="flexRadioDefault" -->
	<!-- 			id="flexRadioDefault2" checked> <label -->
	<!-- 			class="form-check-label" for="flexRadioDefault2"> Female </label> -->
	<!-- 	</div> -->
	<!-- 	<button class="btn btn-primary">Search</button> -->
	<!-- 	</div> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>