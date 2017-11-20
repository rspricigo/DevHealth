<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Pessoa</title>
<script type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
</head>
<body>
<script type="text/javascript">
    function buscaMae() {
    	var a = document.getElementById('nm_mae');
    	
    	$.post("testaAjax", {"id" : a.value});
        
       
      
    }
  </script>

	<form action = 'adicionaPessoa'>
		Nome:<br>
  		<input type="text" name="nm_pessoa"><br>
  	
  		Nome Social:<br>
  		<input type="text" name="nm_social">
  		
  		<input type="hidden" name="id_pessoa" id="id_pessoa">
  		
  		<input type="text" id="nm_mae" name="nm_mae" onkeypress="buscaMae()">
  		
  		<input type="text" name="teste" id="teste">
  		
  		<input type="submit" value="Enviar">
	</form>
	
	
</body>
</html>