<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info marque</title>
<link rel="stylesheet" href="ressource/css/marque/marque_info.css">
</head>
<body>
<h1> Info Marque</h1>
<div>
<h2>nom :${  Marque.nom }</h2>
<img  src="${ Marque.images}">
<h2>création :${  Marque.anneDeCreation }</h2>
<a href="${  Marque.lien }">Site de la Marque</a>
</div>
<a href="marque">Roteur</a>

</body>
</html>