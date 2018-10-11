<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!doctype html>
    <html lang="pt-BR">
        <head>
            <title> CMS - Sistema de Gerenciamento do Site</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href='view/css/style.css'>
            <link rel = "icon" type = "imagem/png" href = "view/imagens/CMS_icone.png"/>
            <script src="view/js/jquery-3.3.1.min.js"></script>
            <script src="view/js/pace.js"></script>
            <script src="view/js/editor/editor.js"></script>
            <link href="view/css/load.css" rel="stylesheet">
            <link rel="stylesheet" href='view/css/cortarImagem/imgareaselect-animated.css'>
            <link href="view/css/editor/editor.css" rel="stylesheet">
            <link href="view/css/editor/objeto.css" rel="stylesheet"> 
            <script src="view/js/cortarImagem/jquery.imgareaselect.js"></script>
            <script>
                $(document).ready(function(){
                    $("#dicasSaude").click(function(){
                        $.ajax({
                            url:"view/dicasSaude.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });
                    });
                    $("#cadastrarUsuario").click(function(){
                        $.ajax({
                            url:"view/cadastroUsuario.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });
                    });
                    $("#vantagensBeneficios").click(function(){
                        $.ajax({
                            url:"view/vantagensBeneficios.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });
                    });
                    $("#faleConosco").click(function(){
                        $.ajax({
                            url:"view/faleConosco.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });
                    });
                    $("#sobreEmpresa").click(function(){
                        $.ajax({
                            url:"view/sobreEmpresa.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });

                        $.ajax({
                            type:"POST",
                            url:"../../ListarSobreEmpresa",
                            success: function(data) {
                                $('#listaSobreEmpresa').html(data);
                            }
                        });
                    });
                    $("#cadastrarIngrediente").click(function(){
                        $.ajax({
                            url:"view/cadastroIngrediente.jsp",
                            success: function(data) {
                                $('#conteudoCms').html(data);
                            }
                        });
                    });
                });
            </script>
        </head>
        <body>
            <div id="retornoScript"> </div>

            <header>
                <div class="coluna-02">
                    <div class="caixa_usuario usuario_administrador">
                        <img src="../media/img/cms/administrador.png" alt="Administrador">
                    </div>
                    <div class="nivel_usuario">
                        Administrador
                    </div>
                </div>
                <div class="coluna-02">
                    <a href="#">
                        <div class="caixa_usuario usuario_marketing" id="nivel_logado">
                            <img src="../media/img/cms/marketing.png" alt="Marketing">
                        </div>
                        <div class="nivel_usuario">
                            Marketing
                        </div>
                    </a>    
                </div> 
                <div class="coluna-02">
                    <div class="caixa_usuario">
                        <img src="../media/img/cms/vendedor.png" alt="Vendedor">
                    </div>
                    <div class="nivel_usuario">
                        Vendedor
                    </div>
                </div> 
                <div class="coluna-02">
                    <div class="caixa_usuario">
                        <img src="../media/img/cms/estoquista.png" alt="Estoquista">
                    </div>
                    <div class="nivel_usuario">
                        Estoquista
                    </div>
                </div> 
                <div class="coluna-02">
                    <div class="caixa_usuario">
                        <img src="../media/img/cms/publicador.png" alt="Publicador">
                    </div>
                    <div class="nivel_usuario">
                        Publicador
                    </div>
                </div>  
                <div class="coluna-02">
                    <a href="#">
                        <span id="nome_sistema"> CMS - </span><span id="nome_site"> Food 4Fit </span>
                    </a>
                    <a href="#">
                        <div id="sair">
                            <img src="../media/img/cms/sair.png" alt="Sair">
                            <p>
                                Sair do Sistema
                            </p>
                        </div>    
                    </a>    
                </div>  
            </header>
            <nav id="menu_lateral" class="coluna-03">
                <div id="menu_publicador">
                    <strong> Publicador </strong>
                    <hr class="separador">
                    <div class="menu_paginas">
                        <div class="menu_itens personal_fitness">
                            <a href="#"> Meu Personal Fitness </a>
                        </div>
                        <div class="menu_itens" id="dicasSaude">
                            Dicas de Saúde
                        </div>
                        <div class="menu_itens">
                            <a href="#"> Casos de Sucesso </a>
                        </div>
                        <div class="menu_itens">
                            <p id="vantagensBeneficios">Vantagens e Benefícios</p>
                        </div>
                        <div class="menu_itens">
                            <a href="#"> Nossos Processos </a>
                        </div>
                        <div class="menu_itens">
                            <a href="#" id="sobreEmpresa"> Sobre a Empresa </a>
                        </div>
                    </div>
                </div>
                <div id="menu_estoquista">
                    <strong> Estoquista </strong>
                    <hr class="separador">
                    <div class="menu_paginas">
                        <div class="menu_itens">
                            <a href="#"> Todos os pratos </a>
                        </div>

                        <div class="menu_itens">
                            <a href="#"> Adicionar Prato </a>
                        </div>

                        <div class="menu_itens">
                            <a href="#"> Todos os ingredientes </a>
                        </div>

                        <div class="menu_itens">
                            <p id="cadastrarIngrediente"> Adicionar ingrediente </p>
                        </div>
                    </div>
                </div>
                <div id="menu_vendedor">
                    <strong> Vendedor </strong>
                    <hr class="separador">
                    <div class="menu_paginas">
                        <div class="menu_itens">
                            <a href="#"> Relatório de Vendas </a>
                        </div>
                    </div>
                </div>    
                <div id="menu_marketing">
                    <strong> Marketing </strong>
                    <hr class="separador">
                    <div class="menu_paginas">
                        <div class="menu_itens">
                            <a href="#"> Promoções </a>
                        </div>
                        <div class="menu_itens">
                            <a href="#"> Notificações por e-mail </a>
                        </div>
                    </div>
                </div>   
                <div id="menu_administrador">
                    <strong> Administrador </strong>
                    <hr class="separador">
                    <div class="menu_paginas">
                        <div class="menu_itens">
                            <p id="faleConosco"> Fale Conosco </p>
                        </div>
                        <div class="menu_itens">
                            <a href="#"> Todos os Usuários </a>
                        </div>
                        <div class="menu_itens">
                            <p id="cadastrarUsuario">Cadastrar Usuário</p>
                        </div>
                        <div class="menu_itens">
                            <a href="#"> Imagens do Slider </a>
                        </div>
                    </div>
                </div>
            </nav>
            <div id="conteudoCms" class="coluna-09">
                <!--             <div id="introducao"> -->
                <!--                 <div class="linha" id="primeira_linha"> -->
                <!--                     <img src="../media/img/cms/cms_icone2.png" alt="CMS"> -->
                <!--                     <span> Sistema de Gerenciamento do Site </span> -->
                <!--                 </div> -->
                <!--                 <div class="linha" id="segunda_linha"> -->
                <!--                     Bem vindo, <strong> Nome do Usuário </strong> -->
                <!--                 </div> -->
                <!--                 <div class="linha" id="terceira_linha"> -->
                <!--                     Navegue pelo site atravÃ©s do menu lateral. Para visualizar ou editar o seu perfil, clique no icone com o nível do seu perfil no cabeçalho desta página. -->
                <!--                 </div> -->

            </div> 

        </body>
    </html>