package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Telefone;
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

	public static Boolean mudarStatus (int idUsuarioCms, Boolean status){ 
		
		Boolean sucesso = false;
		
		String sql = "UPDATE usuario_cms SET status =  ? WHERE idUsuarioCms = ?"; 
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setBoolean(1, status);
			str.setInt(2, idUsuarioCms);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sucesso;
		
	}  


	public static UsuarioCms buscar(){
		
		UsuarioCms usuarioCms = new UsuarioCms();
		
		return  usuarioCms;
		
	} 

	public static ArrayList<UsuarioCms> listar(){ 
		
		ArrayList<UsuarioCms> lista = new ArrayList<>();
		
		String sql = "SELECT  u.*, pm.area, p.* FROM usuario_cms AS u INNER JOIN permissao AS pm ON u.idPermissao = pm.idPermissao INNER JOIN pessoa as p ON p.idPessoa = u.idFuncionario ";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				UsuarioCms usuario = new UsuarioCms();
				usuario.setStatus(rs.getBoolean("status"));
				usuario.setSexo(rs.getString("sexo"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setRg(rs.getString("rg"));
				usuario.setNomeSocial(rs.getString("nomeSocial"));
				usuario.setNome(rs.getString("nome"));
				usuario.setLogin(rs.getString("login"));
				usuario.setIdUsuarioCms(rs.getInt("idUsuarioCms"));
				usuario.setIdPessoa(rs.getInt("idPessoa"));
				usuario.setIdPermissao(rs.getInt("idPermissao"));
				usuario.setIdFuncionario(rs.getInt("idFuncionario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setDataNascimento(rs.getDate("nascimento"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setArea(rs.getString("area"));
				
				ArrayList<Telefone> listaTelefone = TelefoneDAO.buscar(usuario.getIdFuncionario(), 1);
				usuario.setTelefone(listaTelefone);
				
				lista.add(usuario);
				
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