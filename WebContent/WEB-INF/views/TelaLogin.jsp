<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
		
	</head>

<body class="body_login">

 <div class="container">
        <h1 class="welcome text-center">Bem-vindo <br>DevHealth</h1>
            <div class="card card-container">
            <h2 class='login_title text-center'>Login</h2>
            <hr>
    
                <form class="form-signin">
                    <span id="reauth-email" class="reauth-email"></span>
                    <p class="input_title">Usuário</p>
                    <input type="text" id="inputEmail" class="login_box" placeholder="user01@IceCode.com" required autofocus>
                    <p class="input_title">Senha</p>
                    <input type="password" id="inputPassword" class="login_box" placeholder="******" required>
                    <div id="remember" class="checkbox">
                        <label>
                            <input class="form-check-input" type="checkbox" name="remember"> Lembrar-me
                          </label>
                    </div>
                    <button class="btn btn-lg btn-primary" type="submit">Entrar</button>
                </form><!-- /form -->
            </div><!-- /card-container -->
        </div><!-- /container -->

</body>
</html>