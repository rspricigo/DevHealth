<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
		
		<style >
		 body, html {
    height: 100%;
    background-repeat: no-repeat;
background: rgb(185,210,224); /* Old browsers */
background: -moz-radial-gradient(center, ellipse cover,  rgba(185,210,224,1) 0%, rgba(187,214,228,1) 0%, rgba(186,211,225,1) 15%, rgba(186,211,225,1) 38%, rgba(169,199,215,1) 68%, rgba(169,199,215,1) 68%, rgba(169,199,215,1) 82%, rgba(158,191,208,1) 100%); /* FF3.6-15 */
background: -webkit-radial-gradient(center, ellipse cover,  rgba(185,210,224,1) 0%,rgba(187,214,228,1) 0%,rgba(186,211,225,1) 15%,rgba(186,211,225,1) 38%,rgba(169,199,215,1) 68%,rgba(169,199,215,1) 68%,rgba(169,199,215,1) 82%,rgba(158,191,208,1) 100%); /* Chrome10-25,Safari5.1-6 */
background: radial-gradient(ellipse at center,  rgba(185,210,224,1) 0%,rgba(187,214,228,1) 0%,rgba(186,211,225,1) 15%,rgba(186,211,225,1) 38%,rgba(169,199,215,1) 68%,rgba(169,199,215,1) 68%,rgba(169,199,215,1) 82%,rgba(158,191,208,1) 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b9d2e0', endColorstr='#9ebfd0',GradientType=1 ); /* IE6-9 fallback on horizontal gradient */

}
		</style>
	</head>

<body >

 <div class="container">
        <h1 class="welcome text-center">Bem-vindo <br>DevHealth</h1>
            <div class="card card-container">
            <h2 class='login_title text-center'>Login</h2>
            <hr>
    
                <form class="form-signin" action="efetuaLogin" method="POST">
                    <span id="reauth-email" class="reauth-email"></span>
                    <p class="input_title">Usuário</p>
                    <input type="text" id="inputEmail" name="nm_usuario" class="login_box" placeholder="Usuário" required autofocus>
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