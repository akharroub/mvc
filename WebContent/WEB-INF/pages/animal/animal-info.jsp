<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="ressource/css/animal/animal-info.css">
<title>Animal Info</title>
</head>
<body>
<div>
<h2>nom :${  Animal.nom }</h2>
<img  src="${ Animal.images}">
<h2>age :${  Animal.age }ans</h2>

</div>
<a href="animal">Roteur</a>

</body>
</html>