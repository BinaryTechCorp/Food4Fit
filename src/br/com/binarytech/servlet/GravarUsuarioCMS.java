package br.com.binarytech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.UsuarioCmsDAO;
import br.com.binarytech.model.UsuarioCms;
import br.com.binarytech.util.Utilidade;

/**
 * Servlet implementation class GravarUsuarioCMS
 */
@WebServlet("/GravarUsuarioCMS")
public class GravarUsuarioCMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GravarUsuarioCMS() {
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
		
		//Resgatando os dados mandados
		int idPermissao = Integer.parseInt(request.getParameter("permissoes[]"));
		String senha = request.getParameter("senha");
		
		String senhaCriptografada = Utilidade.criptografarSenha(senha);
		
		String login = request.getParameter("login");
		
		UsuarioCms usuario = new UsuarioCms();
		usuario.setStatus(false);
		usuario.setSenha(senhaCriptografada);
		usuario.setLogin(login);
		usuario.setIdPermissao(idPermissao);
		
		Boolean sucesso = UsuarioCmsDAO.gravar(usuario);
		
		PrintWriter printer = response.getWriter();
		
		if(sucesso) {
			printer.println("<script> alert('Gravou'); </script> ");
		} else {
			printer.println("<script> alert('Não - Gravou'); </script> ");
		}
	}

}
