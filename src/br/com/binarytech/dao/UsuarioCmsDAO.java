package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.UsuarioCms;

public class UsuarioCmsDAO{

	public static int gravar(UsuarioCms usuarioCms){
		
		int sucesso = 0;

		String sql = "INSERT INTO usuario_cms SET idFuncionario = ?, idPermissao = ?, status = ?, senha = ?, login = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			str.setInt(1, usuarioCms.getIdFuncionario());
			str.setInt(2, usuarioCms.getIdPermissao());
			str.setBoolean(3, usuarioCms.getStatus());
			str.setString(4, usuarioCms.getSenha());
			str.setString(5, usuarioCms.getLogin());
			
			sucesso = str.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BancoWEB.fecharConexao();
		
		return sucesso;

	}	
	public static Boolean editar(UsuarioCms UsuarioCms){ 
		
		Boolean sucesso = false;
		
		return sucesso;
		
	}  

	public static Boolean deletar(int idUsuarioCms){ 
		
		Boolean sucesso = false;
		
		return sucesso;
		
	}  

	public static Boolean mudarStatus (int idUsuarioCms, int status){ 
		
		Boolean sucesso = false;
		
		return sucesso;
		
	}  


	public static UsuarioCms buscar(){
		
		UsuarioCms usuarioCms = new UsuarioCms();
		
		return  usuarioCms;
		
	} 

	public static ArrayList<UsuarioCms> listar(){ 
		
		ArrayList<UsuarioCms> lista = new ArrayList<>();
		
		String sql = "SELECT u.*, p.area FROM usuario_cms AS INNER JOIN permissao AS p ON u.idPermissao = p.idPermissao; ";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				UsuarioCms usuario = new UsuarioCms();
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BancoWEB.fecharConexao();
		
		return lista;
		
	}
	
	public static Boolean verificarFuncionario(int idFuncionario) {
		Boolean existe = false;
		
		String sql = "SELECT * FROM usuario_cms WHERE idFuncionario = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idFuncionario);
			
			ResultSet rs = str.executeQuery();
			
			if(rs.next()) {
				existe = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BancoWEB.fecharConexao();
		
		return existe;
	}

}