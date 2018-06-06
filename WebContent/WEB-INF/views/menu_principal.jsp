<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>DevHealth- Menu</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/fontawesome-all.min.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
		    <style>
        body {
            background-color: ghostwhite;
        }
    </style>
	</head>
<body>
	 <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
        <a class="navbar-brand" href="#">
                <img src="resource/img/heart_ico.png" width="30" height="30" alt="DevHealth" title="DevHealth">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSite">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!--Lista Conteúdo Menu Principal-->
        <div class="collapse navbar-collapse" id="navbarSite">

            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Prontuário</a>
                </li>
            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="navDrop">
                            <i class="fas fa-user-md"></i> Usuário
                    </a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="">
                            <i class="fas fa-envelope"></i></span>&nbsp;&nbsp;Mensagens
                        </a>
                        <a class="dropdown-item" href="">
                            <i class="fas fa-calendar-alt"></i></span>&nbsp;&nbsp;Agenda
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="">
                            <i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp; Sair
                        </a>
                    </div>
                </li>
            </ul>

        </div>

    </nav>
</body>
</html>