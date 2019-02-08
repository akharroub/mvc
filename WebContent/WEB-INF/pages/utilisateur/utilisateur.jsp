<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Utilisateur</title>
<link rel="stylesheet" href="ressource/css/utilisateur/Utilisateur.css">
</head>
<body>
<h1>Acteur</h1>
<div id="conteneur">
		
		
		<c:forEach items="${Utilisateur }" var="Utilisateur" varStatus="status">
		
		<div class="block_produit">
			<div class="prix">
				<label>${  Utilisateur.age }ans</label>
				
			</div>
			<a href="utilisateur-info?i=${status.index }">
			<img src="${  Utilisateur.lienimages }" />
			</a>
			<div class="description">${  Utilisateur.nom }</div>
			<div class="description">${  Utilisateur.prenom }</div>
		</div>
		
		
		</c:forEach>
		


	</div>

<a href="accueil">routeur</a>
</body>
</html>