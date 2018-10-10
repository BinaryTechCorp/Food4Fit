<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cadastro de Usuário</title>
    </head>
    <body>
        <div class="coluna-12 container_cadastro">

            <%@ include file="header.jsp" %></%@>

            <div class="linha" id="cabecalho_paginas">
                <div id="nome_pagina">
                    Cadastro de Usuário
                </div>
                <div id="linha_fundo"></div>
            </div>
            <div class="coluna-03"></div>
            <div class="coluna-06 formulario_cadastro">
                <div class="linha">
                    <span>Dados do Usuário:</span>
                </div>
                <div class="linha">
                    <input type="radio" class="rdo_pessoa" value="f">Pessoa Física
                    <input type="radio" class="rdo_pessoa" value="j">Pessoa Jurídica
                </div>
                <div class="linha">
                    <div class="coluna-06">
                        <span>Nome*</span>
                    </div>
                    <div class="coluna-06">
                        <span>Nome social</span>
                    </div>
                </div>
                <div class="linha">
                    <div class="coluna-06">
                        <input type="text" id="txt_nome_usuario" name="txt_nome_usuario">   
                    </div>
                    <div class="coluna-06">
                        <input type="text" id="txt_nome_social" name="txt_nome_social">
                    </div>

                </div>
                <div class="linha">
                    <div class="coluna-03">
                        <span>Data de nascimento*</span>
                    </div>
                    <div class="coluna-03">
                        <span>CPF*</span>
                    </div>
                    <div class="coluna-03">
                        <span>Sexo*</span>
                    </div>
                    <div class="coluna-03">
                        <span>Telefone</span>
                    </div>
                </div>
                <div class="linha">
                    <div class="coluna-03">
                        <input type="text" id="txt_dt_nasc" name="txt_id_nasc">
                    </div>
                    <div class="coluna-03">
                        <input type="text" id="txt_cpf" name="txt_cpf">
                    </div>
                    <div class="coluna-03">
                        <select id="sexo_usuario" name="sexo_usuario">
                            <option value="m">
                                Masculino
                            </option>
                            <option value="f">
                                Feminino
                            </option>
                            <option value="o">
                                Outro
                            </option>
                        </select>
                    </div>
                    <div class="coluna-03">
                        <input type="tel" id="txt_telefone" name="txt_telefone">
                    </div>
                </div>
                <div class="linha">
                    <div class="coluna-03"><span>CEP*</span></div>
                    <div class="coluna-06"><span>Endereço*</span></div>
                    <div class="coluna-03"><span>Número*</span></div>
                </div>
                <div class="linha">
                    <div class="coluna-03">
                        <input type="text" name="txt_cep" id="txt_cep">
                    </div>
                    <div class="coluna-06">
                        <input type="text" name="txt_endereco" id="txt_endereco">
                    </div>
                    <div class="coluna-03">
                        <input type="text" name="txt_numero" id="txt_numero">
                    </div>
                </div>
                <div class="linha">
                    <div class="coluna-03"><span>Complemento</span></div>
                    <div class="coluna-03"><span>Bairro*</span></div>
                    <div class="coluna-03"><span>Cidade*</span></div>
                    <div class="coluna-03"><span>Estado</span></div>
                </div>
                <div class="linha">
                    <div class="coluna-03">
                        <input type="text" id="txt_complemento" name="txt_complemento">
                    </div>
                    <div class="coluna-03">
                        <input type="text" id="txt_bairro" name="txt_bairro">
                    </div>
                    <div class="coluna-03">
                        <input type="text" id="txt_cidade" name="txt_cidade">
                    </div>
                    <div class="coluna-03">
                        <select name="slc_estado" id="slc_estado">
                            <option value="AC">Acre</option>
                            <option value="AL">Alagoas</option>
                            <option value="AP">Amapá</option>
                            <option value="AM">Amazonas</option>
                            <option value="BA">Bahia</option>
                            <option value="CE">Ceará</option>
                            <option value="DF">Distrito Federal</option>
                            <option value="ES">Espírito Santo</option>
                            <option value="GO">Goiás</option>
                            <option value="MA">Maranhão</option>
                            <option value="MT">Mato Grosso</option>
                            <option value="MS">Mato Grosso do Sul</option>
                            <option value="MG">Minas Gerais</option>
                            <option value="PA">Pará</option>
                            <option value="PB">Paraíba</option>
                            <option value="PR">Paraná</option>
                            <option value="PE">Pernambuco</option>
                            <option value="PI">Piauí</option>
                            <option value="RJ">Rio de Janeiro</option>
                            <option value="RN">Rio Grande do Norte</option>
                            <option value="RS">Rio Grande do Sul</option>
                            <option value="RO">Rondônia</option>
                            <option value="RR">Roraima</option>
                            <option value="SC">Santa Catarina</option>
                            <option value="SP">São Paulo</option>
                            <option value="SE">Sergipe</option>
                            <option value="TO">Tocantins</option>
                        </select>
                    </div>
                </div>
                <div class="linha">
                    <div class="coluna-12">
                        Qual é o seu objetivo ao se cadastrar na Food 4Fit ?
                    </div>
                    <div class="coluna-04">
                        <input type="radio" name="rdo_motivo" id="rdo_motivo">Perder Peso
                    </div>
                    <div class="coluna-04"><input type="radio" name="rdo_motivo" id="rdo_motivo">Estou seguindo uma dieta
                    </div>
                    <div class="coluna-04">Outro</div>
                </div>
                <div class="linha">
                    <span>Justifique-se</span>
                </div>
                <div class="linha">
                    <textarea id="txt_objetivo" name="txt_objetivo"></textarea>
                </div>
                <div class="linha">
                    <span>Login do Usuário:</span>
                </div>
                <div class="linha">
                    <div class="coluna-06"><span>E-mail</span></div>
                    <div class="coluna-06"><span>Senha</span></div>
                </div>
                <div class="linha">
                    <div class="coluna-06">
                        <input type="text" id="txt_email" name="txt_email">
                    </div>
                    <div class="coluna-06">
                        <input type="text" id="txt_email" name="txt_email">
                    </div>
                </div>
                <div class="linha">
                    Imagem
                </div>
                <div class="linha">
                    <div class="img_perfil"></div>
                </div>
                <div class="linha">
                    <input type="submit" value="enviar">
                </div>
            </div>
            <div class="coluna-03"></div>
        </div>
    </body>
</html>