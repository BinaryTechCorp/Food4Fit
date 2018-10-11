package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.InformacaoSite;
import br.com.binarytech.model.Midia;

public class MidiaDAO {

	public static Boolean gravar(Midia midia) {
		return true;
	}

	public static Boolean editar(Midia midia) {
		return true;
	}

	public static Boolean deletar(int idMidia) {
		return true;
	}

	public static Boolean ativar(int idMidia) {
		return true;
	}

	public static Boolean desativar(int idMidia) {
		return true;
	}

	public static Midia buscar(int idTabela, int idExterno) {
		String sql = "SELECT * FROM midia WHERE idExterno = ?  AND idTabela = ?";
		Midia midia = new Midia();
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idExterno);
			str.setInt(2, idTabela);

			ResultSet rs = str.executeQuery();
			
			if(rs.next()) {
				midia.setIdMidia(rs.getInt("idMidia"));
				midia.setIdTabela(rs.getInt("idTabela"));
				midia.setIdExterno(rs.getInt("idExterno"));
				midia.setTitulo(rs.getString("titulo"));
				midia.setCaminho(rs.getString("caminho"));
				midia.setLegenda(rs.getString("legenda"));
			}

			BancoWEB.fecharConexao();
		} catch (SQLException erro) {
			erro.printStackTrace();
		}
		return midia;
	}

	public static Midia listar() {
		return new Midia();
	}

}