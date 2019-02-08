<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>produit info</title>
<link rel="stylesheet" href="ressource/css/produit/produit_info.css">
</head>
<body>
<h1> Info Produit</h1>
<div>
<h2>nom :${  Produit.nom }</h2>
<img  src="${ Produit.images}">
<h2>prix :${  Produit.prix }&euro;</h2>
<a href="${  Produit.lien }">Lien du site du mon produit</a>
</div>
<a href="produit">Roteur</a>
</body>
</html>





