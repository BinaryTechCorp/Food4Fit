package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.InformacaoSite;
import br.com.binarytech.model.Pessoa;

public class VantagensBeneficiosDAO {
	
	
	public static Boolean gravar(InformacaoSite informacaoSite){
		
		Boolean sucesso = true;
		
		String sql = "INSERT INTO informacaoSite (texto, titulo, assunto) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setString(1, informacaoSite.getTexto());
			str.setString(2, informacaoSite.getTitulo());
			str.setString(3,informacaoSite.getAssunto());
			
			sucesso = str.execute();
			
			BancoWEB.fecharConexao();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sucesso;
		
	}                    

	public static Boolean editar(InformacaoSite informacaoSite){
		
		Boolean sucesso = false;
		
		String sql = "UPDATE informacaoSite SET texto = ?, titulo = ? WHERE idInformacaoSite = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setString(1, informacaoSite.getTexto());
			str.setString(2, informacaoSite.getTitulo());
			str.setInt(3, informacaoSite.getIdInformacaoSite());
			
			sucesso = str.execute();
			
			BancoWEB.fecharConexao();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return sucesso;
		
	}  

	public static Boolean deletar(int idInformacaoSite){ 
		
		Boolean sucesso = false;
		
		String sql="DELETE FROM informacaoSite WHERE idInformacaoSite = ?";
		
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

	public static void status(Boolean status, int idInformacaoSite){
		
		String sql= "UPDATE informacaoSite SET ativo = ? WHERE idInformacaoSite = ?";
		
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
 

	public static InformacaoSite buscar(int idInformacaoSite){ 
		
		
		InformacaoSite informacaoSite = new InformacaoSite();
		informacaoSite.setIdInformacaoSite(idInformacaoSite);
		
		String sql= "SELECT * FROM informacaoSite WHERE idInformacaoSite = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idInformacaoSite);
		
			ResultSet rs = str.executeQuery();
			
			informacaoSite.setAssunto(rs.getString("assunto"));
			informacaoSite.setStatus(rs.getBoolean("status"));
			informacaoSite.setTexto(rs.getString("texto"));
			informacaoSite.setTitulo(rs.getString("titulo"));
			
			/*TODO: Pegar a imagem da publicação no midiaDAO*/
			
			BancoWEB.fecharConexao();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return informacaoSite;
	} 

	public static ArrayList<InformacaoSite> listar(){ 
		
		ArrayList<InformacaoSite> listaVantagens = new ArrayList<>();
		
		String sql= "SELECT * FROM informacaoSite WHERE assunto = 'VANTAGENS'";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				InformacaoSite informacaoSite = new InformacaoSite();
				informacaoSite.setAssunto("VANTAGENS");
				//informacaoSite.setFoto(rs.getString("foto"));
				informacaoSite.setIdInformacaoSite(rs.getInt("idInformacaoSite"));
				informacaoSite.setStatus(rs.getBoolean("status"));
				informacaoSite.setTexto(rs.getString("texto"));
				informacaoSite.setTitulo(rs.getString("titulo"));
				
				listaVantagens.add(informacaoSite);
				
			}
			
			BancoWEB.fecharConexao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaVantagens;
		
	}    
	
}
