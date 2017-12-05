<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Wellcome to the jungle baby</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
	</head>
	<body>
		<div class="container-fluid">
			<header>
				<iframe src="/DevHealth/Cabecalho" id="cabecalho">Cabecalho</iframe>
			</header>
			<iframe src="/DevHealth/Conteudo" id="conteudo">Conteudo</iframe>
			<footer>
				<iframe src="/DevHealth/Rodape" id="rodape">Rodape</iframe>
			</footer>
		</div>
	</body>
</html>