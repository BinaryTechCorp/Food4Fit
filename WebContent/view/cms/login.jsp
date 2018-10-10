<!doctype html>
<html lang="pt">

    <head>
        <title> CMS - Sistema de Gerenciamento do Site</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href='View/css/style.css'>
        <link rel = "icon" type = "imagem/png" href = "View/Imagens/CMS_icone.png"/>

    </head>
    
    <body id="login">
        <div id="caixa_login">
            <div class="linha" id="login_introducao">
                         
                <span id="nome_sistema"> CMS - </span>                      <span id="nome_site"> Food 4Fit </span>
                    
            </div>
            
            <div class="linha" id="login_titulo">
                Acessar Conta
            </div>
            
            
            <div class="linha erro_login">
                <div id="icone_erro">
                    <img src='View/Imagens/erro_login.png' alt="Erro">
                </div>
                
                <div id="mensagem_erro">
                    Usuário ou senha incorretos.
                </div>
            </div>
            
            <div class='linha'>
                <form name="loginUsuario" method="post" action="#"> 
                    <div class="linha">
                        <div class="icone_login">
                            <img src="View/Imagens/login.png" alt="Login">
                        </div>
                        
                        <input type="text" name="login" class="login_inputs" placeholder="Login">
                    
                    </div>   
                    
                    <div class="linha">
                        <div class="icone_login">
                            <img src="View/Imagens/senha_login.png" alt="Login">
                        </div>
                        
                        <input type="password" name="senha" class="login_inputs" placeholder="Senha">
                    
                    </div>  
                    
                    <div class="linha">
                    
                        <input type="submit" name="entrar" value="Entrar" id="btn_login">
                    </div>
                
                </form>
            
            </div>
        
        </div>
    </body>
    
</html>    