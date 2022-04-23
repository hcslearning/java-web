<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alumnos</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	</head>
<body>
<%-- https://stackoverflow.com/questions/4928271/how-to-install-jstl-the-absolute-uri-http-java-sun-com-jstl-core-cannot-be-r --%>
	<div class="container">
	<h1>Alumnos</h1>
	
	<table class="table">
		<thead>
			<th>Nombre</th>
			<th>Fecha Nacimiento</th>
		</thead>
		<tbody>
		<c:forEach var="alumno" items="${alumnos}">
			<tr>
				<td>${alumno.nombre}</td>
				<td>${alumno.fechaNacimiento}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>