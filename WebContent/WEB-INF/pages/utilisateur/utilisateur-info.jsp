<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>utilisateur info</title>
<link rel="stylesheet" href="ressource/css/utilisateur/utilisateur_info.css">
</head>
<body>
<h1>${ Utilisateur.nom} ${ Utilisateur.prenom}</h1>
<img  src="${ Utilisateur.lienimages}">
<div>
<a href="utilisateur">Roteur</a>
</div>

</body>
</html>