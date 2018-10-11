<html>
    <body>
        <div class="coluna-12" id="frm_faleConosco">
            <form name="faleConosco" method="post" action="#">
                <div class="linha">
                    <div class="coluna-06">
                        <div class="linha">
                            <label for="nome" class="labels_formulario"> Nome:  </label>
                        </div>

                        <div class="linha">
                            <input type="text" name="nome" required class="faleConosco_inputs">
                        </div>

                    </div>

                    <div class="coluna-06">
                        <div class="linha">
                            <label for="email" class="labels_formulario"> Email:  </label>
                        </div>

                        <div class="linha">
                            <input type="email" name="email" required class="faleConosco_inputs">
                        </div>
                    </div>

                </div>

                <div class="linha">

                    <div class="coluna-04">
                        <div class="linha">
                            <label for="telefone" class="labels_formulario"> Telefone:  </label>
                        </div>

                        <div class="linha">
                            <input type="tel" name="telefone" required class="faleConosco_inputs">
                        </div>
                    </div>	

                    <div class="coluna-04">
                        <div class="linha">
                            <label for="celular" class="labels_formulario"> Celular:  </label>
                        </div>

                        <div class="linha">
                            <input type="tel" name="celular" required class="faleConosco_inputs">
                        </div>
                    </div>	

                    <div class="coluna-04">
                        <div class="linha">
                            <label for="nome" class="labels_formulario"> Sexo:  </label>
                        </div>

                        <div class="linha">
                            <select name="sexo" required class="faleConosco_inputs">
                                <option value="F"> Feminino </option>
                                <option value="M"> Masculino </option>
                            </select>
                        </div>
                    </div>	

                </div>

                <div class="linha coluna-12">
                    <div class="linha">
                        <label for="mensagem" class="labels_formulario"> Mensagem:  </label>
                    </div>

                    <div class="linha">
                        <textarea name="mensagem"></textarea>
                    </div>
                </div>

                <div class="linha">
                    <div class="coluna-10">
                        <!-- Espaço -->
                    </div>

                    <div class="coluna-02">
                        <input type="submit" name="enviar" value="Enviar dados" id="submit_faleConosco">
                    </div>
                </div>

            </form>
        </div>
    </body>	
</html>	



