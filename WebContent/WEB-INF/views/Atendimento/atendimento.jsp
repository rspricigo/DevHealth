<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Atendimento</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
	</head>
<body>
    <div class="container-fluid">
	    <div class="table" id="cadastrar" style="display:none;">
	        <div class="tr row">
	            <div class="tdc col-md-3">nr_atendimento</div>
	            <div class="tdc col-md-3">cd_pessoa_fisica</div>
	            <div class="tdc col-md-3">dt_atendimento</div>
	            <div class="tdc col-md-3">cd_convenio</div>
	        </div>
	            <div class="tr row">
	            <div class="tdc col-md-4">cd_medico</div>
	            <div class="tdc col-md-4">cd_responsavel</div>
	            <div class="tdc col-md-4">ie_tipo_atendimento</div>
	        </div>
	      
	    </div>
	
	
	    <div class="table" id="consultar">
	        <div class="tr row">
                <div class="tdd col-md-3">Atendimento:<input type="text" id="con_nr_atendimento" style="width:100%;"></div>
                <div class="tdd col-md-6">Pessoa Física:<input type="text" id="con_nm_pessoa_fisica" style="width:100%;"></div>
                <div class="tdd col-md-3">Data Atend.:<input type="text" id="con_dt_atendimento" style="width:100%;"></div>
           	</div>
           	<div class="tr row">
	                <div class="tdd col-md-6">Convênio:<input type="text" id="con_ds_convenio" style="width:100%;"></div>
	                <div class="tdd col-md-6">Médico:<input type="text" id="con_nm_medico" style="width:100%;"></div>
	        </div>
	        <div class="tr row">
	                <div class="tdd col-md-6">Responsável:<input type="text" id="con_nm_responsavel" style="width:100%;"></div>
	                <div class="tdd col-md-6">Tipo Atend.:<input type="text" id="con_ds_tipo_atendimento" style="width:100%;"></div>
	  </div>
	  
	  
           <div class="tr row">
            <div class="col-md-6"><button type="button" class="btn btn-info btn-block">Cadastrar</button></div>
            <div class="col-md-6"><button type="button" class="btn btn-danger btn-block">Desfazer</button></div>
           </div>
	        
	   

	    <div style="border:1px solid black;">
	       <div class="tr row">
	            <div class="tdc col-md-2">Atendimento</div>
	            <div class="tdc col-md-2">Cód. Pessoa</div>
	            <div class="tdc col-md-2">Dt. Atendimento</div>
	            <div class="tdc col-md-1">Cód. Convênio</div>
	            <div class="tdc col-md-1">Cód. Médico</div>
	            <div class="tdc col-md-2">Responsável</div>
	            <div class="tdc col-md-2">Tipo Atendimento</div>
	        </div>
	    </div>
	    
    </div>
    </div>
    </body>
</html>