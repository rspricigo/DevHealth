<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Atendimento</title>
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
		 <div class="container-fluid">
           
        <div class="container-fluid" id="cadastrar">
                    <form action="about:blank">
                        
                        <div class="row">
                        <div class="form-group col-md-4">
                            <label for="nr_atendimento">Atendimento:</label>
                            <input type="text" class="form-control" id="nr_atendimento" name="nr_atendimento">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="pessoa_fisica">Nome Paciente:</label>
                            <input type="text" class="form-control" id="pessoa_fisica" name="pessoa_fisica">
                        </div>
                        <div class="form-group col-md-4">
                                <label for="dt_atendimento">Data Atendimento:</label>
                                <input type="date" class="form-control" id="dt_atendimento" name="dt_atendimento">
                        </div>
                        </div>

                        <div class="row">
                        <div class="form-group col-md-4">
                                <label for="cd_convenio">Convênio:</label>
                                <select class="form-control" id="cd_convenio" name="cd_convenio">
                                    <option >Particular</option>
                                    <option >Convênio</option>
                                    <option >SUS</option>
                                </select>
                            </div>
                            <div class="form-group col-md-4">
                                    <label for="medico">Médico:</label>
                                    <input type="text" class="form-control" id="medico" name="medico">
                            </div>
                            <div class="form-group col-md-4">
                                    <label for="responsavel">Responsável:</label>
                                    <input type="text" class="form-control" id="responsavel" name="responsavel">
                            </div>
                            </div>
                            <div class="row">
                            <div class="form-group col-md-4">
                                    <label for="ie_tipo_atendimento">Tipo Atendimento:</label>
                                    <select class="form-control" id="ie_tipo_atendimento" name="ie_tipo_atendimento">
                                        <option >Consulta</option>
                                        <option >Procedimento</option>
                                        <option >Retorno</option>
                                    </select>
                                </div>
                                </div>

                                          <div class="tr row">
                                            <div class="col-md-6 btn-table"><button type="submit" class="btn btn-info btn-block">Salvar</button></div>
                                            <div class="col-md-6 btn-table"><button type="button" class="btn btn-danger btn-block">Desfazer</button></div>
                                           </div>
                                

                    </form>
        </div>
    </div>
 	</body>
</html>