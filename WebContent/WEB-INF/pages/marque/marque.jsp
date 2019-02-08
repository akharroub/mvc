<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="ressource/css/marque/marque.css">
<title>Marque</title>
</head>
<body>

	<h1>Marque Informatique</h1>

	<div id="conteneur">

		<c:forEach items="${Marque }" var="Marque" varStatus="status">

			<div class="block_Marque">
				<div class="marque">
					<label>${  Marque.anneDeCreation }</label>
				</div>

				<a href="marque-info?i=${status.index }"> 
				<img src="${  Marque.images }" />
				</a>
				<div class="description">${  Marque.nom }</div>

			</div>

		</c:forEach>

	</div>

	<a href="accueil">routeur</a>

</body>
</html>