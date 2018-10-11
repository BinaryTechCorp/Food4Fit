package br.com.binarytech.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import br.com.binarytech.dao.MidiaDAO;
import br.com.binarytech.dao.SobreEmpresaDAO;
import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.InformacaoSite;
import br.com.binarytech.util.Foto;

/**
 * Servlet implementation class GravarSobreEmpresa
 */
@WebServlet("/GravarSobreEmpresa")
public class GravarSobreEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:\\Users\\16254853\\eclipse-workspace\\food4fit\\WebContent\\view\\media\\img\\sobreEmpresa";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GravarSobreEmpresa() {
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
		PrintWriter printer = response.getWriter();
		InformacaoSite informacaoSite = new InformacaoSite();
		
		/* Se o local de salvar não existir, crie */
		if(!new File(UPLOAD_DIRECTORY).exists()){
			new File(UPLOAD_DIRECTORY).mkdir();
		}
		try {
			
		/* Resgata o formulário */
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_DIRECTORY, /* 15MB */ 15360 * 15360, new DefaultFileRenamePolicy());
		
		/* Salva a foto ja cortada na pasta desejada e retorna o caminho dela */
		String foto = Foto.salvarFoto(UPLOAD_DIRECTORY, multipartRequest);
		
		informacaoSite.setAssunto("SOBRE");
		informacaoSite.setTexto(multipartRequest.getParameter("texto"));
		informacaoSite.setTitulo(multipartRequest.getParameter("titulo"));
		
		response.getWriter().write("<script>alert('Deu bom :D');</script>");
		
		int sucesso = MidiaDAO.gravar(midia);
		int sucesso = SobreEmpresaDAO.gravar(informacaoSite);
		
		printer.println(sucesso);
		
		} catch (Exception erro) {
			printer.println("Upload da foto falhou devido a " + erro);
		}
	}

}
