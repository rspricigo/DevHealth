<<<<<<< HEAD
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
=======
<div class="table" id="cadastrar" style="display:none;">
	<div class="tr">
		<div class="tdc">cd_pessoa_fisica</div>
		<div class="tdc">nr_prontuario</div>
		<div class="tdd">nm_pessoa</div>
		<div class="tdd">nm_social</div>
		<div class="tdc">cd_cpf</div>
		<div class="tdc">nr_rg</div>
		<div class="tdc">nr_passaporte</div>
		<div class="tdc">cd_mae</div>
		<div class="tdd">ds_mae</div>
		<div class="tdc">cd_religiao</div>
		<div class="tdc">cd_pai</div>
		<div class="tdd">ds_pai</div>
		<div class="tdc">dt_nascimento</div>
		<div class="tdd">ie_sexo</div>
		<div class="tdc">cd_nacionalidade</div>
		<div class="tdc">dt_atualizacao</div>
		<div class="tdc">dt_criacao</div>
	</div>
</div>

<div class="table" id="consultar">
	<div class="tr">
		<div class="tdd">
			C�digo de Pessoa: <input type="text" id="con_cd_pessoa_fisica">&nbsp
			Prontu�rio: <input type="text" id="con_nr_prontuario">&nbsp
			Nome: <input type="text" id="con_nm_pessoa">&nbsp
			Nome Social: <input type="text" id="con_nm_social">
		</div>
		<div class="tdd">
			CPF: <input type="text" id="con_cd_cpf">&nbsp
			RG: <input type="text" id="con_nr_rg">&nbsp
			Passaporte: <input type="text" id="con_nr_passaporte">&nbsp
			C�digo M�e: <input type="text" id="con_cd_mae">
		</div>
		<div class="tdd">
			Nome M�e: <input type="text" id="con_ds_mae">&nbsp
			Religi�o: <input type="text" id="con_cd_religiao">&nbsp
			C�digo Pai: <input type="text" id="con_cd_pai">&nbsp
			Nome Pai: <input type="text" id="con_ds_pai">
		</div>
		<div class="tdd">Data de Nascimento: <input type="text" id="con_dt_nascimento">&nbsp
			Sexo: <input type="text" id="con_ie_sexo">&nbsp
			Nacionalidade: <input type="text" id="con_cd_nacionalidade">
		</div>
		<div class="tdd">
			Data Atualizac�o: <input type="text" id="con_dt_atualizacao">&nbsp
			Data Criac�o<input type="text" id="con_dt_criacao">
		</div>
		<input type="button" value="Consultar"/>
	</div>
	<div class="tr">
		<div class="tdc">C�digo de Pessoa</div>
		<div class="tdc">Prontu�rio</div>
		<div class="tdd">Nome</div>
		<div class="tdd">Nome Social</div>
		<div class="tdc">CPF</div>
		<div class="tdc">RG</div>
		<div class="tdc">Passaporte</div>
		<div class="tdd">Nome M�e</div>
		<div class="tdd">Religi�o</div>
		<div class="tdd">Nome Pai</div>
		<div class="tdc">Data de Nascimento</div>
		<div class="tdd">Sexo</div>
		<div class="tdd">Nacionalidade</div>
	</div>
</div>
>>>>>>> branch 'master' of https://github.com/rspricigo/DevHealth.git
