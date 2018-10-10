<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food4Fit</title>
<meta name="description"
	content="Draggable Dual-View Slideshow: A Slideshow with two views and content area" />
<meta name="keywords"
	content="draggable, slideshow, fullscreen, carousel, views, zoomed, 3d transform, perspective, dragdealer" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link
	href='http://fonts.googleapis.com/css?family=Playfair+Display:900,400|Lato:300,400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="view/site/css/menu/normalize.css" />
<link rel="stylesheet" type="text/css"
	href="view/site/css/menu/menu.css" />
<link rel="stylesheet" type="text/css"
	href="view/site/css/menu/dragdealer.css" />
<link rel="stylesheet" type="text/css"
	href="view/site/css/menu/component.css" />
<link rel="stylesheet" type="text/css" href="view/site/css/style.css">
<script src="view/site/js/menu/modernizr.custom.js"></script>
<script src="view/site/js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="view/site/css/slick/slick-theme.css">
<link rel="stylesheet" href="view/site/css/slick/slick.css">
<!-- <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=CHAVEKEY"></script> -->
<script type="text/javascript"
	src="view/site/js/home/jquery.googlemap.js"></script>
<script src="view/site/js/home/slick/jquery.min.js"></script>
<script src="view/site/js/home/slick/slick.js"></script>
<script>
                $(document).ready(function(){
                    $('.area_usuario').click(function(){
                        var visivel  = $('.menu_usuario').is(':visible');
                        if (visivel) {
                            $('.menu_usuario').hide();
                        } else {
                            $('.menu_usuario').show();
                        } 
                    });
                    $('.carrinho').click(function(){
                        var visivel  = $('.lista_pedidos').is(':visible');
                        if (visivel) {
                            $('.lista_pedidos').fadeOut(400);
                        }else{
                            $('.lista_pedidos').fadeIn(400);
                        }
                    });
                    $('.sair_carrinho').click(function(){
                        $('.lista_pedidos').fadeOut(400);
                    });
                    $('.pesquisa').click(function(){
                        var visivel  = $('.frm_pesquisa').is(':visible');
                        if (visivel) {
                            $('.frm_pesquisa').hide();
                        } else {
                            $('.frm_pesquisa').show();
                        } 
                    });

                    $(".btn_entrar").click(function(){
                        $('.container_modal').show();
                        $.ajax({
                            type:"GET",
                            url:"view/site/login.jsp",
                            success: function(data) {
                                $('.conteudo_modal').html(data);
                            }
                        });
                    });
                    $('.fechar_modal').click(function(){
                        $('.container_modal').hide();
                    });
                });
            </script>
<script>
                var colors = new Array(
                    [33, 47, 89],
                    [33, 70, 89],
                    [33, 86, 89],
                    [33, 89, 6],
                    [33, 89, 51],
                    [37, 89, 33],
                    [55, 89, 33],
                    [73, 89, 33],
                    [89, 87, 33],
                    [89, 69, 33]
                    );
                var step = 0;
                //color table indices for: 
                // current color left
                // next color left
                // current color right
                // next color right
                var colorIndices = [0,1,2,3];
                //transition speed
                var gradientSpeed = 0.002;
                function updateGradient(){

                    if ( $===undefined ) return;

                    var c0_0 = colors[colorIndices[0]];
                    var c0_1 = colors[colorIndices[1]];
                    var c1_0 = colors[colorIndices[2]];
                    var c1_1 = colors[colorIndices[3]];

                    var istep = 1 - step;
                    var r1 = Math.round(istep * c0_0[0] + step * c0_1[0]);
                    var g1 = Math.round(istep * c0_0[1] + step * c0_1[1]);
                    var b1 = Math.round(istep * c0_0[2] + step * c0_1[2]);
                    var color1 = "rgb("+r1+","+g1+","+b1+")";

                    var r2 = Math.round(istep * c1_0[0] + step * c1_1[0]);
                    var g2 = Math.round(istep * c1_0[1] + step * c1_1[1]);
                    var b2 = Math.round(istep * c1_0[2] + step * c1_1[2]);
                    var color2 = "rgb("+r2+","+g2+","+b2+")";

                    $('#slideshow').css({
                        background: "-webkit-gradient(linear, left top, right top, from("+color1+"), to("+color2+"))"}).css({
                        background: "-moz-linear-gradient(left, "+color1+" 0%, "+color2+" 100%)"});

                    step += gradientSpeed;
                    if ( step >= 1 ){
                        step %= 1;
                        colorIndices[0] = colorIndices[1];
                        colorIndices[2] = colorIndices[3];
                        //pick two new target color indices
                        //do not pick the same as the current one
                        colorIndices[1] = ( colorIndices[1] + Math.floor( 1 + Math.random() * (colors.length - 1))) % colors.length;
                        colorIndices[3] = ( colorIndices[3] + Math.floor( 1 + Math.random() * (colors.length - 1))) % colors.length;
                    }
                }
                setInterval(updateGradient,5);

            </script>
			<script>
                $(function(){
                    var index = 0;
                    slide();
                    function slide(){
                        var indice;
                        var fotos = document.getElementsByClassName("fotos_slide");
                        for (indice = 0; indice < fotos.length; indice++) {
                            fotos[indice].style.display = "none";  
                        }
                        index++;
                        if (index > fotos.length){
                            index = 1;
                        }    
                        fotos[index-1].style.display = "block";  
                        setTimeout(slide, 2000);
                    }
                });
            </script>
			<script type="text/javascript">
                $(document).on('ready', function() {
                    $('.center').slick({
                        centerMode: true,
                        centerPadding: '60px',
                        slidesToShow: 5,
                        autoplay: true,
                        autoplaySpeed: 2500,
                        variableWidth: true,
                        responsive: [
                            {
                                breakpoint: 768,
                                settings: {
                                    arrows: false,
                                    centerMode: true,
                                    centerPadding: '40px',
                                    slidesToShow: 3
                                }
                            },
                            {
                                breakpoint: 480,
                                settings: {
                                    arrows: false,
                                    centerMode: true,
                                    centerPadding: '40px',
                                    slidesToShow: 1
                                }
                            }
                        ]
                    });
                });
            </script>
            
</head>
<body>
	<div class="container_modal">
		<div class="coluna-04"></div>
		<div class="coluna-04 modal">
			<span class="fechar_modal">Fechar</span>
			<div class="coluna-12 conteudo_modal"></div>
		</div>
		<div class="coluna-04"></div>
	</div>
	<div class="container">
		<header id="header" class="codrops-header">
			<button class="slider-switch">Switch view</button>
		</header>
		<div id="overlay" class="overlay"></div>
		<div id="slideshow" class="dragslider">
			<section class="img-dragger img-dragger-large dragdealer">
				<div class="handle">
					<div class="slide" data-content="content-1">
						<div class="img-wrap">
							<img src="view/media/img/menu/1.jpg" alt="img1" />
						</div>
						<h2>
							Home<span></span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<div class="slide" data-content="content-2">
						<div class="img-wrap">
							<img src="view/media/img/menu/1.jpg" alt="img1" />
						</div>
						<h2>
							Casos de Sucesso<span>Veja a transformação que os produtos
								da Food 4Fit fazem!</span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<div class="slide" data-content="content-3">
						<div class="img-wrap">
							<img src="view/media/img/menu/2.jpg" alt="img2" />
						</div>
						<h2>
							Dicas de Saúde<span>Dicas de saúde pra você não ter um
								infarto</span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>

					<div class="slide" data-content="content-4">
						<div class="img-wrap">
							<img src="view/media/img/menu/5.jpg" alt="img5" />
						</div>
						<h2>
							Fale Conosco<span></span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<div class="slide" data-content="content-5">
						<div class="img-wrap">
							<img src="view/media/img/menu/6.jpg" alt="img6" />
						</div>
						<h2>
							Meu Personal Fitness<span>Decomposing fruits and burning
								houses</span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<div class="slide" data-content="content-6">
						<div class="img-wrap">
							<img src="view/media/img/menu/7.jpg" alt="img7" />
						</div>
						<h2>
							Vantagens e Benefícios<span>Only kale could make her happy</span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<div class="slide" data-content="content-7">
						<div class="img-wrap">
							<img src="view/media/img/menu/7.jpg" alt="img7" />
						</div>
						<h2>
							Fórum<span>Only kale could make her happy</span>
						</h2>
						<button class="content-switch">Read more</button>
					</div>
					<!-- <div class="slide" data-content="content-9">
                                <div class="img-wrap"><img src="view/media/img/menu/7.jpg" alt="img7"/></div>
                                <h2>Perfil do Usuário<span>Only kale could make her happy</span></h2>
                                <button class="content-switch">Read more</button>
                            </div> -->
				</div>
			</section>
			<!-- /img-dragger-->
			<!-- Content section -->
			<section class="pages">
				<div class="content" data-content="content-1">
					<h2>
						Home<span></span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<%@ include file="view/site/home.jsp"%></%@>
				</div>
				<div class="content" data-content="content-2">
					<h2>
						Casos de Sucesso<span></span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<%@ include file="view/site/casos_de_sucesso.jsp"%></%@>
				</div>
				<div class="content" data-content="content-3">
					<h2>
						Dicas de Saúde<span>Dicas de de saúde pra você não ter um
							infarto</span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<%@ include file="view/site/dicas_de_saude.jsp"%></%@>
				</div>
				<div class="content" data-content="content-4">
					<h2>
						Diário de Bordo<span>Atualize seu progresso com a Food 4Fit
							e ganhe a chance de aparecer nos Casos de Sucesso!</span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<div class="linha" id="cabecalho_paginas">
						<div id="nome_pagina">Fale Conosco</div>
						<div id="linha_fundo"></div>
					</div>
					<%@ include file="view/site/faleConosco.jsp"%></%@>
				</div>
				<div class="content" data-content="content-5">
					<h2>
						Meu Personal Fitness<span>Veja e intraja com dicas para a
							sua vida fitness!</span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<div class="linha" id="cabecalho_paginas">
						<div id="nome_pagina">Meu Personal Fitness</div>
						<div id="linha_fundo"></div>
					</div>
					<%@ include file="view/site/personalFitness.jsp"%></%@>
				</div>
				<div class="content" data-content="content-6">
					<h2>
						Vantagens e Benefícios<span>Veja o que você ganha ao
							consumir nossos produtos!</span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<div class="linha" id="cabecalho_paginas">
						<div id="nome_pagina">Vantagens e Benefícios</div>
						<div id="linha_fundo"></div>
					</div>
					<%@ include file="view/site/vantagens_e_beneficios.jsp"%></%@>
				</div>
				<div class="content" data-content="content-7">
					<h2>
						Fórum<span>Troque experiências com outros usuários</span>
					</h2>
					<%@ include file="view/site/header.jsp"%></%@>
					<div class="linha" id="cabecalho_paginas">
						<div id="nome_pagina">Fórum</div>
						<div id="linha_fundo"></div>
					</div>
					<%@ include file="view/site/forum/forum.jsp"%></%@>
				</div>
			</section>
		</div>
	</div>
	<!-- /container -->
	<script src="view/site/js/menu/dragdealer.js"></script>
	<script src="view/site/js/menu/classie.js"></script>
	<script src="view/site/js/menu/dragslideshow.js"></script>
	<script>
                (function() {

                    var overlay = document.getElementById( 'overlay' ),
                        overlayClose = overlay.querySelector( 'button' ),
                        header = document.getElementById( 'header' )
                    switchBtnn = header.querySelector( 'button.slider-switch' ),
                        toggleBtnn = function() {
                        if( slideshow.isFullscreen ) {
                            classie.add( switchBtnn, 'view-maxi' );
                        }
                        else {
                            classie.remove( switchBtnn, 'view-maxi' );
                        }
                    },
                        toggleCtrls = function() {
                        if( !slideshow.isContent ) {
                            classie.add( header, 'hide' );
                        }
                    },
                        toggleCompleteCtrls = function() {
                        if( !slideshow.isContent ) {
                            classie.remove( header, 'hide' );
                        }
                    },
                        slideshow = new DragSlideshow( document.getElementById( 'slideshow' ), {
                        // toggle between fullscreen and minimized slideshow
                        onToggle : toggleBtnn,
                        // toggle the main image and the content view
                        onToggleContent : toggleCtrls,
                        // toggle the main image and the content view (triggered after the animation ends)
                        onToggleContentComplete : toggleCompleteCtrls
                    }),
                        toggleSlideshow = function() {
                        slideshow.toggle();
                        toggleBtnn();
                    },
                        closeOverlay = function() {
                        classie.add( overlay, 'hide' );
                    };

                    // toggle between fullscreen and small slideshow
                    switchBtnn.addEventListener( 'click', toggleSlideshow );
                    // close overlay
                    overlayClose.addEventListener( 'click', closeOverlay );

                }());
            </script>
</body>
</html>
