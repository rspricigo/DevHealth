<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consultar Atendimento</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
	</head>
	<body>
		<div class="container-fluid" id="container-principal">
		
		    <div class="table" id="cadastrar" style="display:none;">
		        <div class="tr">
		            <div class="tdc">nr_atendimento</div>
		            <div class="tdc">cd_pessoa_fisica</div>
		            <div class="tdc">dt_atendimento</div>
		            <div class="tdc">cd_convenio</div>
		            <div class="tdc">cd_medico</div>
		            <div class="tdc">cd_responsavel</div>
		            <div class="tdc">ie_tipo_atendimento</div>
		        </div>
		    </div>
		
		    <div class="table" id="consultar">
		        <div class="row tr">
		            <div class="col-md-4 tdd">Número de Atendimento: <input type="text" id="con_nr_atendimento"></div>
		            <div class="col-md-4 tdd">Nome: <input type="text" id="con_cd_pessoa_fisica"></div>
	                <div class="col-md-4 tdd">Data Atendimento: <input type="text" id="con_dt_atendimento"></div>
		        </div>
		        <div class="row tr">
		                <div class="col-md-4 tdd">Convênio: <input type="text" id="con_cd_convenio"></div>
		                <div class="col-md-4 tdd">Médico: <input type="text" id="con_cd_medico"></div>
		                <div class="col-md-4 tdd">Responsável: <input type="text" id="con_cd_responsavel"></div>
		        </div>
		        <div class="row tr">
		                <div class="col-md-4 tdd">Tipo Atendimento: <input type="text" id="con_ds_tipo_atendimento"></div>
		        </div>
		        <div class="tr row">
		            <div class="col-md-6 btn-table"><button type="button" class="btn btn-info btn-block">Cadastrar</button></div>
            		<div class="col-md-6 btn-table"><button type="button" class="btn btn-danger btn-block">Desfazer</button></div>
           		</div>
		    </div>
				
    <div class="table-responsive">
			    <table class="table table-dark" id="listar">
			        <thead>
			        <tr>
			            <td>Atendimento</td>
			            <td>Nome</td>
			            <td>Data Atend.<td>
			            <td>Convênio</td>
			            <td>Responsável</td>
			            <td>Tipo Atend.</td>
			        </tr>
			        </thead>
			    </table>
			</div>
			
		</div>
 	</body>
</html>