package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Cargo;
import br.com.binarytech.model.Medida;
import br.com.binarytech.model.Nutricional;

public class MedidaDAO {

	public static Boolean gravar(Medida medida) {
		return true;
	}

	public static Boolean editar(Medida medida) {
		return true;
	}

	public static Boolean deletar(int idMedida) {
		return true;
	}

	public static Boolean ativar(int idMedida) {
		return true;
	}

	public static Boolean desativar(int idMedida) {
		return true;
	}

	public static Medida buscar(int idMedida) {

		String sql = "SELECT * FROM medida where idMedida = ?";
		
		Medida medida = new Medida();

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			str.setInt(1, idMedida);

			ResultSet rs = str.executeQuery();

			while (rs.next()) {

				medida.setIdMedida(rs.getInt("idMedida"));
				medida.setMedida(rs.getString("medida"));
				medida.setSigla(rs.getString("sigla"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return medida;
	}

	public static Medida listar() {
		return new Medida();
	}

}