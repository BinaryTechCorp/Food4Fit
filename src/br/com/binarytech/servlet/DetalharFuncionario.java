package br.com.binarytech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.FuncionarioDAO;
import br.com.binarytech.dao.TelefoneDAO;
import br.com.binarytech.model.Funcionario;
import br.com.binarytech.model.Telefone;

/**
 * Servlet implementation class DetalhesFuncionario
 * 	Criada para auxiliar o cadastro de usuários do CMS
 */
@WebServlet("/DetalharFuncionario")
public class DetalharFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetalharFuncionario() {
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
		// TODO Auto-generated method stub
		
		int idFuncionario = Integer.parseInt(request.getParameter("idFuncionario"));
		
		PrintWriter printer = response.getWriter();
		
		Funcionario funcionario = FuncionarioDAO.listarByIdCMS(idFuncionario);
		
		System.out.println(funcionario);
		
		//Pegando o telefone principal do funcionario
		int idTipo = 1; // TIPO = FUNCIONARIO
		Telefone telefonePrincipal = TelefoneDAO.buscarPrincipal(idFuncionario, idTipo);
		
		printer.println(""
				+ "<script>"
				+ "$('#usuarioNome').html('"+funcionario.getNome()+"');"
				+ "$('#usuarioEmail').html('"+funcionario.getEmail()+"');"
				+ "$('#usuarioSexo').html('"+funcionario.getSexo()+"');"
				+ "$('#usuarioRG').html('"+funcionario.getRg()+"');"
				+ "$('#usuarioTelefone').html('"+telefonePrincipal.getTelefone()+"');"
				+ "$('#usuarioCargo').html('"+funcionario.getCargo()+"');"
				+ "$('#formCadastroUsuario').attr('data-idFuncionario', "+ funcionario.getIdFuncionario() + ");"
				+ "</script>");
	}

}
