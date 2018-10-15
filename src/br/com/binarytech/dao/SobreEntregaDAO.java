package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.InformacaoSite;

public class SobreEntregaDAO {

	public static int gravar(InformacaoSite informacaoSite) {

		int sucesso = 0;

		String sql = "INSERT INTO informacao_site (texto, titulo, assunto, status) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setString(1, informacaoSite.getTexto());
			str.setString(2, informacaoSite.getTitulo());
			str.setString(3, informacaoSite.getAssunto());
			str.setInt(4, 0);

			sucesso = str.executeUpdate();

			BancoWEB.fecharConexao();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sucesso;
	}

	public static Boolean editar(InformacaoSite informacaoSite) {

		Boolean sucesso = false;

		String sql = "UPDATE informacao_site SET texto = ?, titulo = ? WHERE idInformacaoSite = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setString(1, informacaoSite.getTexto());
			str.setString(1, informacaoSite.getTitulo());
			str.setInt(3, informacaoSite.getIdInformacaoSite());

			sucesso = str.execute();

			BancoWEB.fecharConexao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sucesso;
	}

	public static Boolean deletar(int idInformacaoSite) {

		Boolean sucesso = false;

		String sql = "DELET FROM informacao_site WHERE idInformacaoSite = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);

			str.setInt(1, idInformacaoSite);

			sucesso = str.execute();

			BancoWEB.fecharConexao();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sucesso;
	}

	public static void status(Boolean status, int idInformacaoSite) {

		String sql = "UP-DATE informacao_site SET ativo = ? WHERE idInformacao = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);

			str.setBoolean(1, status);
			str.setInt(2, idInformacaoSite);

			str.execute();

			BancoWEB.fecharConexao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static InformacaoSite buscar(int idInformacaoSite) {

		InformacaoSite informacaoSite = new InformacaoSite();
		informacaoSite.setIdInformacaoSite(idInformacaoSite);

		String sql = "SELECT * FROM informacao_site WHERE idInformacaoSite = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idInformacaoSite);

			ResultSet rs = str.executeQuery();

			informacaoSite.setAssunto(rs.getString("assunto"));
			informacaoSite.setStatus(rs.getBoolean("status"));
			informacaoSite.setTexto(rs.getString("texto"));
			informacaoSite.setTitulo(rs.getString("titulo"));

			/* TODO: Pegar a imagem da publica��o no MidiaDAO */

			BancoWEB.fecharConexao();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return informacaoSite;
	}
	
	public static ArrayList<InformacaoSite> listar(){
		
		ArrayList<InformacaoSite> listaSobreEntrega = new ArrayList<>();
		
		String sql = "SELECT * FROM informacao_site WHRE assunto = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setString(1, "ENTREGA");
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				InformacaoSite informacaoSite = new InformacaoSite();
				informacaoSite.setAssunto("ENTREGA");
				informacaoSite.setFoto(MidiaDAO.buscar(7, rs.getInt("idInformacaoSite")));
				informacaoSite.setIdInformacaoSite(rs.getInt("idInformacaoSite"));
				informacaoSite.setStatus(rs.getBoolean("status"));
				informacaoSite.setTexto(rs.getString("texto"));
				informacaoSite.setTitulo(rs.getString("titulo"));
				listaSobreEntrega.add(informacaoSite);
				
			}
			BancoWEB.fecharConexao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaSobreEntrega;
		
	}

}