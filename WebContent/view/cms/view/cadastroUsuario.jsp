<%@page import="br.com.binarytech.model.Cargo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="br.com.binarytech.dao.CargoDAO"%>

<%	
	CargoDAO cargoDAO = new CargoDAO();
	ArrayList<Cargo> listaCargos  = cargoDAO.listar();

%>

<script>
	$("#formPesquisar").submit(function(event){
	    event.preventDefault();
	    var cargo = $("#selectCargo").val();
	    var codigo = $("#codigo").val();
	    if(codigo==""){codigo=0;}
	    
		 $.ajax({
		      type: "POST",
		      url: "../../ListarFuncionarios",
		      data: {idCargo:cargo, idFuncionario:codigo} ,
		      success: function(dados){
		          $("#tabelaUsuarios").html(dados);
		      }
		  });
	          
	});
	
	$("#formCadastroUsuario").submit(function(evento){
		event.preventDefault();
		$.ajax({
			type: "POST",
			url: "../../GravarUsuarioCMS",
			data: new FormData($("#formCadastroUsuario")[0]),
			cache : false,
			contentType: false,
			processData: false,
			async: true,
			success: function(dados){
				$('#retornoScript').html(dados);
			}
		});
	});
	
	function DetalharFuncionario(idFuncionario){
		
		$.ajax({
	      type: "POST",
	      url: "../../DetalharFuncionario",
	      data: {idFuncionario:idFuncionario} ,
	      success: function(dados){
	          $('#retornoScript').html(dados);
	          $("#input_login").prop("disabled", false);
	          $("#input_senha").prop("disabled", false);
	      }
	  });
	}

</script>

<div class="coluna-12">
    <div class="linha" id="nome_pagina">
        Cadastrar Usuário 
    </div>
    
    <div class="linha">
        <strong> Filtrar por: </strong>
    </div>

    <div class="linha">

        <form name="filtroFuncionario" method="post" id="formPesquisar"> 
            <div class="coluna-06">
                
                <label for="selectCargo" > Cargo </label> <br>

                <select id="selectCargo" name="selectCargo" class="inputsFiltro">
					<option value=""> Selecione </option>
                   <%
	                   for (Cargo cargo : listaCargos) { %>
		           			
		           			<option value='<%= cargo.getIdCargo() %>'> <%= cargo.getCargo() %> </option>
	               <% 	   
		           	   }
                   %>
                </select>

            </div>

            <div class="coluna-06">
                <label for="codigo"> Código </label> <br>
                <input type="tel" id="codigo" name="codigo" class="inputsFiltro" placeholder="Digite o código do funcionário">

                <input type='submit' id="filtroFuncionario" value="">

            </div>
        </form>
    </div>
    
   <div class="linha">
       <strong> Lista de funcionários: </strong> <br>

        <div class="linha" id="header_tabelaUsuarios">

            <div class="coluna-03">
                Código
            </div>    

            <div class="coluna-03">
                Nome
            </div>    

            <div class="coluna-03">
                E-mail
            </div>    

            <div class="coluna-03">
                Cargo
            </div>    

        </div>

        <div id="tabelaUsuarios">
            <div class="linha item_tabelaUsuarios">

                <div class="coluna-03">

                </div>

                <div class="coluna-03">

                </div>

                <div class="coluna-03">

                </div>

                <div class="coluna-03">

                </div>

            </div>
        </div>
    </div>   
    
    <div class="linha">
        <strong> Informações do Usuário: </strong> <br>

        <div class="linha">
            <div class="coluna-04">
                <p> Nome </p>
                <div id="usuarioNome" class="inputs_informacoes">
	                
	             </div>
            </div>
            
            <div class="coluna-04">
                <p> E-mail </p>
                <div id="usuarioEmail" class="inputs_informacoes">

                </div>
            </div>

            <div class="coluna-04">
                <p> Sexo </p>
                <div class="inputs_informacoes" id="usuarioSexo">
                
                </div>

            </div>
            
        </div>
        
        <div class="linha">

            <div class="coluna-04">
                <p> RG </p>
                <div class="inputs_informacoes" id="usuarioRG">

                </div>
            </div>

            <div class="coluna-04">
                <p> Telefone </p>
                <div class="inputs_informacoes" id="usuarioTelefone">

                </div>

            </div>

            <div class="coluna-04">
                <p> Cargo </p>
                <div class="inputs_informacoes" id="usuarioCargo">

                </div>

            </div>


        </div>
        
        <form name="formCadastroUsuario" id="formCadastroUsuario" method="post" action="#" data-idFuncionario="">
            <div class="linha">
	            <strong> Login do Usuário: </strong> <br>
	
	            <div class="linha">
	                <div class="coluna-06">
	                    <div class="icone_login">
	                        <img src="../media/img/cms/login.png" alt="Login">
	                    </div>
	
	                    <input type="text" name="login" id="input_login" class="cadastroUsuario_inputs" placeholder="Login" maxlengh="45" disabled required>

	                </div>
	
	
	                <div class="coluna-06">
	                    <div class="icone_login">
	                        <img src="../media/img/cms/senha_login.png" alt="Login">
	                    </div>
	                    <input type="password" name="senha" id="input_senha" class="cadastroUsuario_inputs" placeholder="Senha" maxlengh="16" disabled required>

	                </div>   
	            </div>  
	
	        </div>
            
            <div class="linha">
                <strong> Permissões do Usuário: </strong> <br>
	            <div class="linha">
                    <div class="coluna-03 selectNivel">
	                    <input type="radio" name="permissoes[]" value="2" class="checkbox_permissoes">
	                    <span class="nomePermissao"> Publicador </span>
	
	                </div>
                    
                    <div class="coluna-03 selectNivel">
	                    <input type="radio" name="permissoes[]" value="1" class="checkbox_permissoes">
	                    <span class="nomePermissao"> Estoquista </span>
	                </div>
                    
                    <div class="coluna-03 selectNivel">
	                    <input type="radio" name="permissoes[]" value="5" class="checkbox_permissoes">
	                    <span class="nomePermissao"> Marketing </span>
	                </div>
                    
                    <div class="coluna-03 selectNivel">
	                    <input type="radio" name="permissoes[]" value="4" class="checkbox_permissoes">
	                    <span class="nomePermissao"> Vendedor </span>
	                </div>
                    
                </div>    
                
                <div class="linha">
	                <div class="coluna-03 selectNivel">
	                    <input type="radio" name="permissoes[]" value="3" class="checkbox_permissoes">
	                    <span class="nomePermissao"> Administrador </span>

	                </div>
	            </div>
                
                <div class="linha">
	                <input type="submit" name="cadastrar" value="Cadastrar" class="btn_cadastro">
	            </div>
            </div>    
        </form>    
        
    </div>    
            
</div>