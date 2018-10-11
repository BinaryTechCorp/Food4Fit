package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.UsuarioCms;

public class UsuarioCmsDAO{

	public static Boolean gravar(UsuarioCms usuarioCms){
		
		Boolean sucesso = false;

		String sql = "INSERT INTO usuario_cms SET idFuncionario = ?, idPermissao = ?, status = ?, senha = ?, login = ?";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			str.setInt(1, usuarioCms.getIdFuncionario());
			str.setInt(2, usuarioCms.getIdPermissao());
			str.setBoolean(3, usuarioCms.getStatus());
			str.setString(4, usuarioCms.getSenha());
			str.setString(5, usuarioCms.getLogin());
			
			sucesso = str.execute();
			
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

	public static UsuarioCms listar(){ 
		
		return new UsuarioCms();
		
	}    

}