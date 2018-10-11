package br.com.binarytech.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.FuncionarioDAO;
import br.com.binarytech.model.Funcionario;

/**
 * Servlet implementation class ListarFuncionarios
 */
@WebServlet("/ListarFuncionarios")
public class ListarFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarFuncionarios() {
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
		
		System.out.println("Chegou aqui");
		
		PrintWriter printer = response.getWriter();

		int idFuncionario = Integer.parseInt(request.getParameter("idFuncionario"));
		int idCargo = Integer.parseInt(request.getParameter("idCargo"));
		
		if(idFuncionario != 0) {
			//select by codigo

			Funcionario funcionario = FuncionarioDAO.listarByIdCMS(idFuncionario);
			
			printer.println("<div class=\"linha item_tabelaUsuarios\" onclick = 'DetalharFuncionario(" + funcionario.getIdFuncionario() + ")'> " + 
					"                <div class=\"coluna-03 codigoFuncionario\">" + 
					funcionario.getIdFuncionario() + 
					"                </div>" +
					"                <div class=\"coluna-03\">" + 
					funcionario.getNome() +
					"                </div>"+
					"                <div class=\"coluna-03\">" + 
					funcionario.getEmail() + 
					"                </div>" + 
					"                <div class=\"coluna-03\">" + 
					funcionario.getCargo() +  
					"                </div>" + 
					"            </div>");
			
		} else {
			//select by cargo
			
			ArrayList<Funcionario> lista = FuncionarioDAO.listarByCargoCms(idCargo);
			
			for (Funcionario funcionario : lista) {
				printer.println("<div class=\"linha item_tabelaUsuarios\" onclick = 'DetalharFuncionario(" + funcionario.getIdFuncionario() + ")'> " + 
						"                <div class=\"coluna-03 codigoFuncionario\">" + 
						funcionario.getIdFuncionario() + 
						"                </div>" +
						"                <div class=\"coluna-03\">" + 
						funcionario.getNome() +
						"                </div>"+
						"                <div class=\"coluna-03\">" + 
						funcionario.getEmail() + 
						"                </div>" + 
						"                <div class=\"coluna-03\">" + 
						funcionario.getCargo() +  
						"                </div>" + 
						"            </div>");
			}

		}
		
	}

}
