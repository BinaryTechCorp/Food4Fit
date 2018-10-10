<!doctype html>
<html lang="pt">

    <head>
        <title> Diário de Bordo </title>
        <meta charset="utf-8">
        <!--
<link rel="stylesheet" href="view/css/style.css" type="text/css">
<script src="view/js/jquery-3.3.1.min.js"></script>
-->

        <script>

        </script>
    </head>

    <body> 
        <div id="caixa_principal">
            <div id="explicacao_pagina" class="linha">


                <div class="coluna-02">

                    <img src="view/media/img/icones/Diario%20de%20Bordo.png" alt="Diario de Bordo">
                </div>

                <div class="coluna-10">
                    Nesta página, você pode registrar o seu progresso em relação à suas dietas, 
                    compras do site, etc. 
                </div>



            </div>


            <div class="linha">
                <strong> Atualize seu Diário de Bordo! </strong>
            </div>

            <div class="linha" id="topico_diario">
                Comente sua opinião em relação aos nossos pratos, dicas de saúde e de dietas. Caso esteja seguindo uma dieta, conte-nos sobre o seu progresso. 
            </div>


            <form name="diarioBordo" method="post" action="#">
                <div class="linha">
                    <textarea name="diarioBordo" id="textarea_diario"></textarea>
                </div>

                <div class="linha">
                    <input type="submit" value="Atualizar" id="submit_diario">

                </div>

            </form>
            <div class="linha">
                <%@include file="footer.jsp" %></%@include>
            </div>
        </div>


    </body>	
</html>	



