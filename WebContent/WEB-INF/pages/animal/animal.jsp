<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal</title>
<link rel="stylesheet" href="ressource/css/animal/animal.css">
</head>
<body>
<h1>Animal</h1>

<div id="conteneur">
		
		
		<c:forEach items="${Animal }" var="Animal" varStatus="status">
		
		<div class="block_produit">
			<div class="prix">
				<label>${  Animal.age }Age</label>
			</div>
			
			<a href="animal_info?i=${status.index }"> 
			<img src="${  Animal.images }" />
			</a>
			<div class="description">${  Animal.nom }</div>
		</div>
		
		</c:forEach>
		


	</div>
<a href="accueil">routeur</a>
</body>
</html>