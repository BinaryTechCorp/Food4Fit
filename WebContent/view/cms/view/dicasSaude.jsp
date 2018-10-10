<script>
    $(document).ready(function(){
        $(".botao_adicionar").click(function(){
            $.ajax({
                type:"GET",
                url:"view/cadastroDicasSaude.jsp",
                success: function(data) {
                    $('.conteudo_cms').html(data);
                }
            });
        });
    });
</script>
<div class="coluna-12">

    <div class="linha" id="nome_pagina">
        Dicas de Saúde
        <img src="../media/img/cms/adicionar.png" alt="Adicionar" class="botao_adicionar">
    </div>

    <div class="linha">
        <div class="header_tabela">
            Título
        </div>


        <div class="tabela">
            <div class="linha">
                <div class="coluna-04 topico_tabela">
                    Imagem
                </div>

                <div class="coluna-08 topico_tabela">
                    Descrição
                </div>
            </div>

            <div class="linha">
                <div class="coluna-04 imagem_tabela">
                    <img src="../media/img/cms/imagemTeste.jpg" alt="teste">
                </div>

                <div class="coluna-08 descricao_tabela">
                    Lorem Ipsum é simplesmente texto fictício da indústria tipográfica e de impressão. Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500, quando uma impressora desconhecida pegou uma galé do tipo e subiu para fazer um livro de espécimes de tipo. Ele sobreviveu não apenas cinco séculos, mas também o salto para a composição eletrônica, permanecendo essencialmente inalterado. Foi popularizado nos anos 60 com o lançamento de folhas de Letraset contendo passagens de Lorem Ipsum, e mais recentemente com software de editoração eletrônica como Aldus PageMaker incluindo versões de Lorem Ipsum.
                </div>
            </div>    
        </div>

        <div class="caixa_opcoesTabela">
            <div class="linha icone_opcoes">    
                <img src="../media/img/cms/ativo.png" alt="Ativo">
            </div>

            <div class="linha icone_opcoes">
                <img src="../media/img/cms/editar.png" alt="Editar">
            </div>

            <div class="linha icone_opcoes">
                <img src="../media/img/cms/excluir.png" alt="Excluir">
            </div>
        </div>

    </div>

    <div class="linha">
        <div class="header_tabela">
            Título

        </div>


        <div class="tabela">
            <div class="linha">
                <div class="coluna-04 topico_tabela">
                    Imagem
                </div>

                <div class="coluna-08 topico_tabela">
                    Descrição
                </div>

            </div>

            <div class="linha">
                <div class="coluna-04 imagem_tabela">       

                    <img src="../media/img/cms/imagemTeste.jpg" alt="teste">
                </div>

                <div class="coluna-08 descricao_tabela">
                    Lorem Ipsum é simplesmente texto fictício da indústria tipográfica e de impressão. Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500, quando uma impressora desconhecida pegou uma galé do tipo e subiu para fazer um livro de espécimes de tipo. Ele sobreviveu não apenas cinco séculos, mas também o salto para a composição eletrônica, permanecendo essencialmente inalterado. Foi popularizado nos anos 60 com o lançamento de folhas de Letraset contendo passagens de Lorem Ipsum, e mais recentemente com software de editoração eletrônica como Aldus PageMaker incluindo versões de Lorem Ipsum.
                </div>
            </div>    
        </div>

        <div class="caixa_opcoesTabela">
            <div class="linha icone_opcoes">    
                <img src="../media/img/cms/nao_ativo.png" alt="Não - Ativo">

            </div>

            <div class="linha icone_opcoes">
                <img src="../media/img/cms/editar.png" alt="Editar">
            </div>

            <div class="linha icone_opcoes">
                <img src="../media/img/cms/excluir.png" alt="Excluir">
            </div>
        </div>

    </div>


</div>