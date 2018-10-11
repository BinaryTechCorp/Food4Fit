package br.com.binarytech.dao;


import java.security.KeyStore.ProtectionParameter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Telefone;

public class TelefoneDAO {


	public static Boolean gravar(Telefone telefone){ 
		return true;
		
	}                  

	public static Boolean editar(Telefone telefone){ return true;}  

	public static Boolean deletar(int idTelefone){ return true;}  

	public static ArrayList<Telefone> buscar(int idExterno, int idTipo){ 
		ArrayList<Telefone> lista = new ArrayList<>();
		
		String sql = "SELECT * FROM telefone WHERE idExterno = ? AND idTipo = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idExterno);
			str.setInt(2, idTipo);
			
			ResultSet result = str.executeQuery();
			
			while(result.next()) {
				Telefone telefone = new Telefone();
				telefone.setContato(result.getString("contato"));
				telefone.setIdExterno(idExterno);
				telefone.setIdTipo(idTipo);
				telefone.setTelefone(result.getString("telefone"));
				
				lista.add(telefone);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BancoWEB.fecharConexao();
		
		return lista;
	} 
	
	
	public static Telefone buscarPrincipal(int idExterno, int idTipo) {
		Telefone telefone = new Telefone();
		
		String sql = "SELECT * FROM telefone WHERE idExterno = ? AND idTipo = ? AND contato = 'PRINCIPAL'";
		System.out.println("IdTipo: " + idTipo + " idExterno: " + idExterno);
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idExterno);
			str.setInt(2, idTipo);
			
			ResultSet rs = str.executeQuery();
			
			if(rs.next()) {
				telefone.setContato(rs.getString("contato"));
				telefone.setIdExterno(idExterno);
				telefone.setIdTipo(idTipo);
				telefone.setTelefone(rs.getString("telefone"));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BancoWEB.fecharConexao();
		
		return telefone;
	}

	public static Telefone buscar(){ return new Telefone();} 

	public static Telefone listar(){ return new Telefone();}    

}