package br.com.binarytech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.SobreEmpresaDAO;
import br.com.binarytech.model.InformacaoSite;

/**
 * Servlet implementation class ListarSobreEmpresa
 */
@WebServlet("/ListarSobreEmpresa")
public class ListarSobreEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarSobreEmpresa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printer = response.getWriter();
		ArrayList<InformacaoSite> listaSobreEmpresa = SobreEmpresaDAO.listar();
		for (InformacaoSite informacaoSite : listaSobreEmpresa) {
			printer.println(""
					+ "<div class=\"linha\">" + 
					"        <div class=\"header_tabela\">" + 
					            informacaoSite.getTitulo() + 
					"        </div>" + 
					"" + 
					"" + 
					"        <div class=\"tabela\">" + 
					"            <div class=\"linha\">" + 
					"                <div class=\"coluna-04 topico_tabela\">" + 
					"                    Imagem" + 
					"                </div>" + 
					"" + 
					"                <div class=\"coluna-08 topico_tabela\">" + 
					"                    Descrição" + 
					"                </div>" + 
					"            </div>" + 
					"" + 
					"            <div class=\"linha\">" + 
					"                <div class=\"coluna-04 imagem_tabela\">" + 
					"                    <img src=\"../media/img/cms/imagemTeste.jpg\" alt=\"teste\">" + 
					"                </div>" + 
					"" + 
					"                <div class=\"coluna-08 descricao_tabela\">" + 
								informacaoSite.getTexto() + 
					"                </div>" + 
					"            </div>    " + 
					"        </div>" + 
					"" + 
					"        <div class=\"caixa_opcoesTabela\">" + 
					"            <div class=\"linha icone_opcoes\">    " + 
					"                <img src=\"../media/img/cms/ativo.png\" alt=\"Ativo\">" + 
					"            </div>" + 
					"" + 
					"            <div class=\"linha icone_opcoes\">" + 
					"                <img src=\"../media/img/cms/editar.png\" alt=\"Editar\">" + 
					"            </div>" + 
					"" + 
					"            <div class=\"linha icone_opcoes\">" + 
					"                <img src=\"../media/img/cms/excluir.png\" alt=\"Excluir\">" + 
					"            </div>" + 
					"        </div>" + 
					"" + 
					"    </div>"
					+ "");
		}
		
	}

}
