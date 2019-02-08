<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>produit</title>
<link rel="stylesheet" href="ressource/css/produit/produit.css">
</head>
<body>
<h1>list des produits</h1>
<div id="conteneur">
		
		
		<c:forEach items="${Produit }" var="Produit" varStatus="status">
		
		<div class="block_produit">
			<div class="prix">
				<label>${  Produit.prix }&euro;</label>
			</div>
			
			<a href="produit-info?i=${status.index }"> 
			<img src="${  Produit.images }" />
			</a>
			<div class="description">${  Produit.nom }</div>
		</div>
		
		</c:forEach>
		


	</div>
<a href="accueil">routeur</a>
</body>
</html>