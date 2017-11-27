<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Convênio</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="resources/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/>">
		<script src="<c:url value="resources/JQuery.js"/>"></script>
		<script src="<c:url value="resources/Popper.js"/>"></script>
	</head>
<body>

<div class="container-fluid">
        <div class="table" id="cadastrar" style="display:none;">
            <div class="tr row">
                <div class="tdc col-md-3">cd_convenio</div>
                <div class="tdc col-md-3">ds_convenio</div>
                <div class="tdc col-md-3">cd_cgc</div>
                <div class="tdc col-md-3">nr_rg_ans</div>
                <div class="tdc col-md-3">ie_tipo_convenio</div>
            </div>
        </div>

        <div class="table" id="consultar">
            <div class="tr row">
                <div class="tdd col-md-2">Código: <input type="text" id="con_cd_convenio" style="width:100%;"></div>
                <div class="tdd col-md-4">Descrição: <input type="text" id="con_ds_convenio"style="width:100%;"></div>
                <div class="tdd col-md-2">CGC: <input type="text" id="con_ds_convenio"style="width:100%;"></div>
                <div class="tdd col-md-2">Número Rg Ans: <input type="text" id="con_nr_rg_ans"style="width:100%;"></div>
                <div class="tdd col-md-2">Tipo Atendimento: <input type="text" id="con_ie_tipo_atendimento"style="width:100%;"></div>
                </div>
                
                
           <div class="tr row">
            <div class="col-md-6"><button type="button" class="btn btn-info btn-block">Cadastrar</button></div>
            <div class="col-md-6"><button type="button" class="btn btn-danger btn-block">Desfazer</button></div>
           </div>
            </div>

            <div class="tr row">
                <div class="tdc col-md-2">Código</div>
                <div class="tdc col-md-4">Descrição</div>
                <div class="tdc col-md-2">CGC</div>
                <div class="tdc col-md-2">Número Rg Ans</div>
                <div class="tdc col-md-2">Tipo Atendimento</div>
            </div>
        </div>
        
    </body>
</html>