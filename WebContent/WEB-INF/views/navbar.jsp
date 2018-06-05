<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>-</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
		    <style>
        body {
            background-color: ghostwhite;
        }
    </style>
	</head>
<body>
                <nav class="navbar navbar-expand-sm navbar-dark bg-primary">
                        <a class="navbar-brand" href="#">DV</a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                          <span class="navbar-toggler-icon"></span>
                        </button>
                      
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                          <ul class="navbar-nav mr-auto">
                            <li class="nav-item active">
                              <a class="nav-link" href="#">Início<span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                              <a class="nav-link" href="#">Prontuário</a>
                            </li>
                            <li class="nav-item dropdown">
                              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Agenda
                              </a>
                              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Novo</a>
                                <a class="dropdown-item" href="#">Consultar</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Atendimento</a>
                              </div>
                            </li>
                           
                          </ul>
                          <form class="form-inline my-2 my-lg-0">
                            <span>Usuário Logado</span>
                            <button class="btn btn-danger my-2 my-sm-0" type="submit">Sair</button>
                          </form>
                        </div>
                      </nav>
</body>
</html>