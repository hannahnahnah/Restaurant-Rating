<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
	<div class="container">
		<h3>Restaurants!</h3>
		
		<table class="table">
			<thead>
				<tr>
					<th>Restaurant Name</th>
					<th>Rating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="restaurant" items="${restaurants}">
				<tr>
					<th>${ restaurant.name }</th>
					<td>${ restaurant.rating }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>