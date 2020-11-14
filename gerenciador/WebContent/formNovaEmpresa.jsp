<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar nova empresa</title>
</head>
<body>
	<form action="${ linkServletNovaEmpresa }" method="POST">
		Nome:
		<input type="text" name="nome" />
		Data Abertura:
		<input type="text" name="dataAbertura">
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>