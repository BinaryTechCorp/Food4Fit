package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Publicacao;

public class PublicacaoDAO {

	public static Boolean gravar(Publicacao publicacao){ return true;}                    

	public static Boolean editar(Publicacao publicacao){ return true;}  

	public static Boolean deletar(int idPublicacao){ return true;}  

	public static Boolean ativar(int idPublicacao){ return true;}  

	public static Boolean desativar(int idPublicacao){ return true;}  

	
	public static Publicacao buscar(int idPublicacao){ 
		Publicacao publicacao = new Publicacao();
		String sql = "select * from publicacao WHERE idPublicacao = ? and idTabela = ? ";
		try {
			PreparedStatement stm = BancoWEB.abrirConexao().prepareStatement(sql);
			stm.setInt(1, idPublicacao);
			stm.setInt(2, 2);
			ResultSet rs = stm.executeQuery();
			publicacao.setIdPublicacao(idPublicacao);
			publicacao.setIdUsuario(rs.getInt("idUsuario"));
			publicacao.setIdTabela(2);
			publicacao.setTitulo(rs.getString("titulo"));
			publicacao.setTexto(rs.getString("texto"));
			publicacao.setIdUsuario(rs.getInt("idUsuario"));
			publicacao.setIdUsuario(rs.getInt("idUsuario"));
			BancoWEB.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publicacao;
		} 

	public static Publicacao listar(){ return new Publicacao();}    

}