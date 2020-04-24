<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>listeFormationParTheme</title>

</head>
<body>
<h1>Bienvenue !!!</h1>
	<table
		class="table table-striped table-hover table-condensed table-bordered">
		<tr>
			<th>Id</th>
			<th>Theme</th>
			<th>Description</th>
		</tr>
		<c:forEach var="formation" items="${listeFormationByTheme}">
			<tr>
				<td>${formation.id}</td>
				<td>${formation.theme}</td>
				<td>${formation.description}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>