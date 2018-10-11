<div class="coluna-12">
    <div class="linha" id="nome_pagina">
        Nova Dica de SaÃºde
    </div>

    <form name='dicaSaude' method="post" action="#" enctype="multipart/form-data" class="formularios">

        <div class="linha">
            <div class="coluna-04">
                <span class="label_formulario" > Imagem: </span>

                <div class="formularios_imagens" id="visualizarImg">
                    <img src="data:image/gif;base64,R0lGODlhAQABAAD/ACwAAAAAAQABAAACADs%3D" alt="Imagem" class="visualizarImg"> 
                </div>

                <div class="linha">
                    <div id="labelFile"> 
                        <img src="../media/img/cms/upload.png" alt="Upload">

                        <label for="fileImagem" > Escolher Imagem  </label>

                        <input id='fileImagem' type='file' value='' name="fileImagem" required accept="image/*"/>

                    </div>    
                </div>    

            </div>


            <div class="coluna-08">
                <div class="linha">
                    <label for="titulo" class="label_formulario"> Título: </label> <br>
                    <input type="text" name="titulo" required class="inputs_formulario" maxlength="50">
                </div>
                <div class="linha">
                    <label for="descricao" class="label_formulario"> Descriçãoo: </label> <br>
                    <textarea id="formulario_textarea" required></textarea>
                </div>
            </div>
        </div>
        <div class="linha">
            <input type="submit" name="cadastrar" value="Salvar" class="salvarCadastro">
        </div>
    </form>

</div>