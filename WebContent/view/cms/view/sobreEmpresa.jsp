<script>
    $(function(){
        $(".botao_adicionar").click(function(){
            $.ajax({
                type:"GET",
                url:"view/cadastroSobreEmpresa.jsp",
                success: function(data) {
                    $('#conteudoCms').html(data);
                }
            });
        });
    });
</script>
<div class="coluna-12">

    <div class="linha" id="nome_pagina">
        Sobre a Empresa
        <img src="../media/img/cms/adicionar.png" alt="Adicionar" class="botao_adicionar">
    </div>

    <div class="linha" id="listaSobreEmpresa">


    </div>


</div>