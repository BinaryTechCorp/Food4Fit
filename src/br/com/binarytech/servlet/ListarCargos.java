package br.com.binarytech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.binarytech.dao.CargoDAO;
import br.com.binarytech.model.Cargo;

/**
 * Servlet implementation class ListarCargosServlet
 */
@WebServlet("/ListarCargos")
public class ListarCargos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCargos() {
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
		String options = "<option value=''> Selecione </option>";
		ArrayList<Cargo> listaCargos = CargoDAO.listar();
		
		for (Cargo cargo : listaCargos) {
			options += "<option value='"+cargo.getIdCargo()+"'>"+cargo.getCargo()+"</option>/n";
		}
		
		PrintWriter printer = response.getWriter();
		printer.print(options);
		
	}

}
