<script>
    function updateCoords(im,obj){
        $('#x').val(obj.x1);
        $('#y').val(obj.y1);
        $('#w').val(obj.width);
        $('#h').val(obj.height);
    }

    //check coordinates
    function checkCoords(){
        if(parseInt($('#w').val())) return true;
        alert('Please select a crop region then press submit.');
        return false;
    }

    $(function(){
        //prepare instant image preview
        var p = $("#filePreview");
        $("#foto").change(function(){
            //fadeOut or hide preview
            p.fadeOut();

            //prepare HTML5 FileReader
            var oFReader = new FileReader();
            oFReader.readAsDataURL(document.getElementById("foto").files[0]);

            oFReader.onload = function (oFREvent) {
                p.attr('src', oFREvent.target.result).fadeIn();
            };
        });

        //implement imgAreaSelect plugin
        $('img#filePreview').imgAreaSelect({
            // set crop ratio (optional)
            //aspectRatio: '2:1',
            
            onSelectEnd: updateCoords
        });
        imagem = $('img#filePreview').imgAreaSelect({ fadeSpeed: 400, handles: true,
            instance: true });
        $('img#filePreview').imgAreaSelect({ x1: 25, y1: 25, x2: 270, y2: 210 });
        
        $("#formSobreEmpresa").submit(function(event){
            event.preventDefault();
           $.ajax({
                type: "POST",
                url: "../../GravarSobreEmpresa",
                data: new FormData($('#formSobreEmpresa')[0]),
                cache: false,
                contentType: false,
                processData: false,
                async:true,
                success: function(dados){
                    $("#retornoScript").html(dados);
                }
            });
                  
        });
    });
    </script>
<div class="coluna-12">
    <div class="linha" id="nome_pagina">
        Sobre a Empresa
    </div>
    <form id="formSobreEmpresa" name='formSobreEmpresa' enctype="multipart/form-data" class="formularios">

        <div class="linha">
            <div class="coluna-04">
                <span class="label_formulario" > Imagem: </span>

                <div class="formularios_imagens" id="visualizarImg">
                    <img src="data:image/gif;base64,R0lGODlhAQABAAD/ACwAAAAAAQABAAACADs%3D" alt="Imagem" class="visualizarImg"> 
                </div>

                <div class="linha">
                    <div id="labelFile"> 
                        <img id="filePreview"
						src="data:image/gif;base64,R0lGODlhAQABAAD/ACwAAAAAAQABAAACADs%3D"
						alt="Imagem" class="visualizarImg">

                        <label for="foto" > Escolher Imagem  </label>
                        <input id='foto' type='file' value='' name="foto" required accept="image/*"/>
					<input type="hidden" id="x" name="x"/>
					<input type="hidden" id="y" name="y"/>
 					<input type="hidden" id="w" name="w"/> 
 					<input type="hidden" id="h" name="h"/>
                    </div>    
                </div>    

            </div>


            <div class="coluna-08">
                <div class="linha">
                    <label for="titulo" class="label_formulario"> Título: </label> <br>
                    <input type="text" name="titulo" required class="inputs_formulario" maxlength="50">
                </div>
                <div class="linha">
                    <label for="descricao" class="label_formulario"> Descrição: </label> <br>
                    <textarea id="texto" name="texto" class="jqte-test" required></textarea>
                    <script>
                    /** sobre_titulo **/
	$('.jqte-test').jqte();
	
	// settings of status
	var jqteStatus = true;
	$(".status").click(function()
	{
		jqteStatus = jqteStatus ? false : true;
		$('.jqte-test').jqte({"status" : jqteStatus})
	});
</script>
                </div>
            </div>
        </div>
        <div class="linha">
            <input type="submit" name="cadastrar" value="Salvar" class="salvarCadastro">
        </div>
    </form>

</div>