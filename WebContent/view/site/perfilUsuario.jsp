<!Doctype html>
<html lang="pt">

    <head>
        <title> Perfil do Usuário </title>
        <meta charset="utf-8">

        <script>
        
        </script>
    </head>

    <body>
        


        <form name="editarPerfil" method="post" action="#">
            <div class="coluna-12" id="caixa_principal">
                <div class="linha">
                    <div class="coluna-03">
                        <div class="linha">
                            <div class="labels_formulario">
                                Imagem do perfil:
                            </div>   
                        </div>

                        <div id="img_usuario">
                            <img src="../view/media/img/icones/perfil_masculino.png" alt='Imagem de Perfil'>
                        </div> 

                        <div class="linha">
                            <div class="links">
                                Trocar imagem de perfil
                            </div>   
                        </div>    
                    </div>

                    <div class="coluna-09">
                        <div class="linha">

                            <div class="coluna-06">

                                <div class="linha">
                                    <label for="nome" class="labels_formulario"> Nome: </label>
                                </div>

                                <div class="linha">
                                    <input type="text" name="nome" placeholder="João" class="perfilUsuario_input">
                                </div>


                            </div>    
                            <div class="coluna-06">
                                <div class="linha">
                                    <label for="nome" class="labels_formulario"> Nome social/fantasia: </label>
                                </div>

                                <div class="linha">
                                    <input type="text" name="nome_social" placeholder="Joãozinho" class="perfilUsuario_input">
                                </div>
                            </div>    

                        </div>

                        <div class="linha">

                            <div class="coluna-04">

                                <div class="linha">
                                    <label for="dataNascimento" class="labels_formulario"> Data de Nascimento: </label>
                                </div>

                                <div class="linha">
                                    <input type="text" name="dataNascimento" class="perfilUsuario_input" placeholder="05/04/1999">
                                </div>

                            </div>    

                            <div class="coluna-04">

                                <div class="linha">
                                    <label for="sexo" class="labels_formulario"> Sexo: </label>
                                </div>

                                <div class="linha">
                                    <select name="sexo" class="perfilUsuario_input">
                                        <option value="F"> Feminino </option>
                                        <option value="M" selected> Masculino </option>
                                    </select>
                                </div>

                            </div>  

                            <div class="coluna-04">

                                <div class="linha">
                                    <label for="telefone" class="labels_formulario"> Telefone: </label>
                                </div>

                                <div class="linha">
                                    <input type="text" name="telefone" class="perfilUsuario_input" placeholder="011 4444-2222">
                                </div>

                            </div>    


                        </div>

                        <div class="linha">
                            <div class="coluna-12">
                                <div class="linha">
                                    <label for="motivo" class="labels_formulario"> Motivo do cadastro: </label>
                                </div>
                                <div class="linha">
                                    <div class="coluna-04">
                                        <input type="radio" name="motivo" value="1" class="radio"> Gosto de comida fitness
                                    </div>

                                    <div class="coluna-04">
                                        <input type="radio" name="motivo" value="2" class="radio" checked> Estou seguindo uma dieta
                                    </div>

                                    <div class="coluna-04">
                                        <input type="radio" name="motivo" value="3" class="radio"> Outros
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>    

                </div>    


                <div class="linha">
                    <label for="detalhes" class="labels_formulario"> Detalhes: </label>
                </div>

                <div class="linha">
                    <textarea name="detalhes" id="textarea_perfil">Comecei uma dieta para perder peso pois preciso fazer uma cirurgia arriscada.</textarea>
                </div>

                <div class="linha">
                    <input type="submit" name="salvar" value="Salvar Alterações" class="links btnSalvar">

                </div>   

            </div>
        </form>    
    </body>	
</html>	



