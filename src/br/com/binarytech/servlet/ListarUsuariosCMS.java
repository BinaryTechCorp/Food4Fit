package br.com.binarytech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.TelefoneDAO;
import br.com.binarytech.dao.UsuarioCmsDAO;
import br.com.binarytech.model.Telefone;
import br.com.binarytech.model.UsuarioCms;


/**
 * Servlet implementation class ListarCargosServlet
 */
@WebServlet("/ListarUsuariosCMS")
public class ListarUsuariosCMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuariosCMS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<UsuarioCms> lista = UsuarioCmsDAO.listar();
		
		PrintWriter printer = response.getWriter();
		
		if(lista.isEmpty()) {
			printer.print("<div class='linha'> Sem registros. </div>");
		}
		
		for (UsuarioCms usuarioCms : lista) {
			
			Telefone telefonePrincipal = TelefoneDAO.buscarPrincipal(usuarioCms.getIdFuncionario(), 1);
			
			if(telefonePrincipal.getTelefone() == null) {
				telefonePrincipal.setTelefone("Sem telefone.");
			}
			
			String img = "";
			
			if(usuarioCms.getStatus()) {
				img = "<img src='../media/img/cms/ativo.png' alt='Ativo' class='info_img' onclick = 'mudarStatus(" + usuarioCms.getIdUsuarioCms() +  ", 0)' > ";
			} else {
				img = "<img src='../media/img/cms/nao_ativo.png' alt='Não - Ativo' class='info_img' onclick = 'mudarStatus(" + usuarioCms.getIdUsuarioCms() +  ", 0)' > ";
			}
			
			
			printer.println("    	<div class=\"conteudo_tabela linha\">\r\n" + 
					"	    	<div class=\"linha itemViewUsuario\">\r\n" + 
					"	    		<div class=\"coluna-03 info\">\r\n" + 
					usuarioCms.getNome() + 
					"	    		</div>\r\n" + 
					"	    		\r\n" + 
					"	    		<div class=\"coluna-03 info\">\r\n" + 
					usuarioCms.getEmail() + 
					"	    		</div>\r\n" + 
					"	    		\r\n" + 
					"	    		<div class=\"coluna-02 info\">\r\n" + 
					telefonePrincipal.getTelefone() + 
					"	    		</div>\r\n" + 
					"	    		\r\n" + 
					"	    		<div class=\"coluna-02 info\">\r\n" + 
					usuarioCms.getArea() + 
					"	    		</div>\r\n" + 
					"	    		\r\n" + 
					"	    		<div class=\"coluna-02 info_opcoes\">\r\n" + 
					"	    			 <img src=\"../media/img/cms/excluir.png\" alt=\"Excluir\" class=\"info_img\">\r\n" + 
					"					<img src=\"../media/img/cms/editar.png\" alt=\"Editar\" class=\"info_img\">\r\n" + 
					"	    		</div>\r\n" + 
					"	    	</div>\r\n" + 
					"    	</div>\r\n" + 
					"    	<div class=\"icone_status\">\r\n" + 
					img + 
					"    	</div>\r\n" + 
					"    	\r\n" + 
					"    </div> ");
		}
		
	}

}

