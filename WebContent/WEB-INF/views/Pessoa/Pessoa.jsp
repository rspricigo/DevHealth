<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Pessoa</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
</head>
<body>
   		 		
  	
	
	<div class="container-fluid">
  <h1>Cadastro Pessoa Física</h1>
  

   


  <form action="adicionaPessoa" method="POST">
  <input type="hidden" class="form-control" name="id_mae" id="id_mae">
  <input type="hidden" class="form-control" name="id_pai"  id="id_pai">
    <div class="row">
        
        <div class="col-sm-6">
          <div class="form-group">
            <label for="nm_pessoa">Nome:</label>
            <input type="text" class="form-control" name="nm_pessoa" id="nm_pessoa">
          </div>
        </div>
        
        <div class="col-sm-6">
          <div class="form-group">
            <label for="nm_social">Nome Social:</label>
            <input type="text" class="form-control" name="nm_social" id="nm_social">
          </div>
        </div>

        <div class="col-sm-6">
          <div class="form-group">
            <label for="cd_cpf">CPF:</label>
            <input type="text" class="form-control" name="cd_cpf" id="cd_cpf">
          </div>
        </div>

        <div class="col-sm-6">
          <div class="form-group">
            <label for="nr_rg">RG:</label>
            <input type="text" class="form-control" name="nr_rg" id="nr_rg">
          </div>
        </div>

       <!--   <div class="col-sm-6">
          <div class="form-group">
            <label for="nascimento">Nascimento:</label>
            <input type="date" class="form-control" name="dt_nascimento" id="dt_nascimento">
          </div>
        </div>-->
        
        <div class="col-sm-6">
          <div class="form-group">
            <label for="nr_prontuario">Prontuario</label>
            <input type="number" class="form-control" name="nr_prontuario" id="nr_prontuario">
          </div>
        </div>

        <div class="col-sm-6">
            <div class="form-group">
              <label for="nmMae">Mae:</label>
              <input type="text" class="form-control" id="nmMae" data-toggle="modal" data-target="#modalMae" >
            </div>
        </div>


        <div class="col-sm-6">
          <div class="form-group">
            <label for="nmPai">Pai:</label>
            <input type="text" class="form-control" id="nmPai" data-toggle="modal" data-target="#modalPai" >
          </div>
      </div>


    </div>
    <button type="submit" class="btn btn-primary">Salvar</button>
  </form>

 
  
  <!-- The Modal Mae -->
    <div class="modal fade" id="modalMae">
      <div class="modal-dialog">
        <div class="modal-content">
  
          <!-- Modal Header -->
          <div class="modal-header">
            <h4 class="modal-title">Localizar Pessoa</h4>
            <button type="button" class="close" data-dismiss="modal">&times;</button>
          </div>
  
          <!-- Modal body -->
          <div class="modal-body">
            <div class="container-fluid">
              
              
  
              <form>
                <div class="row">
                  
                  <div class="col-sm-12">
                    <div class="form-group">
                      <label for="nm_mae">Nome:</label>
                      <input type="text" class="form-control" id="nm_mae" name="nm_mae" onkeypress="buscaMae()">
                      </div>
                  </div>
  
                  
  
                  
                </div>
               
              </form>
            </div>
                
            <div class="container">
              <table class="table table-hover table-striped"  id="tabelaMae">
                
                <thead>
                  <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                    
                  </tr>
                </thead>
                
                <tbody>
                  
                </tbody>
              </table>
            </div>
          </div>
  
          <!-- Modal footer -->
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          </div>
            
        </div>
      </div>
</div>
  
<!-- The Modal Pai -->
    <div class="modal fade" id="modalPai">
      <div class="modal-dialog">
        <div class="modal-content">
  
          <!-- Modal Header -->
          <div class="modal-header">
            <h4 class="modal-title">Localizar Pessoa</h4>
            <button type="button" class="close" data-dismiss="modal">&times;</button>
          </div>
  
          <!-- Modal body -->
          <div class="modal-body">
            <div class="container-fluid">
              
              
  
              <form>
                <div class="row">
                  
                  <div class="col-sm-12">
                    <div class="form-group">
                      <label for="nm_pai">Nome:</label>
                      <input type="text" class="form-control" id="nm_pai" name="nm_pai" onkeypress="buscaPai()">
                      </div>
                  </div>
  
                  
  
                  
                </div>
               
              </form>
            </div>
                
            <div class="container">
              <table class="table table-hover table-striped"  id="tabelaPai">
                
                <thead>
                  <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                    
                  </tr>
                </thead>
                
                <tbody>
                  
                </tbody>
              </table>
            </div>
          </div>
  
          <!-- Modal footer -->
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          </div>
            
        </div>
      </div>
</div>

</div>


	
 <script type="text/javascript">
  
 $(document).ready(function(){
	    $("#tabelaMae").delegate("tr", "click", function(){
	    	var nome = null, id = null;
	    	nome = $(this).find("td").eq(1).text()
	    	$("#nmMae").val(nome);
	    	id = $(this).find("td").eq(0).text()
	    	$("#id_mae").val(id);
	    });
	}); 
 
 $(document).ready(function(){
	    $("#tabelaPai").delegate("tr", "click", function(){
	    	var nome = null, id = null;
	    	nome = $(this).find("td").eq(1).text()
	    	$("#nmPai").val(nome);
	    	id = $(this).find("td").eq(0).text()
	    	$("#id_pai").val(id);
	    	
	    });
	});   
  
  
  
    function buscaMae() {
    					var a = document.getElementById('nm_mae');    	
    					$.post("listaPorNome", {"nm_pessoa" : a.value}, 
    							function (result){
    							$("#tabelaMae").html(result);
    				        	})
    					;
             
      
    }
    
    function buscaPai() {
		var a = document.getElementById('nm_pai');    	
		$.post("listaPorNome", {"nm_pessoa" : a.value}, 
				function (result){
				$("#tabelaPai").html(result);
	        	})
		;


}
  </script> 
  
	
	
</body>
</html>

