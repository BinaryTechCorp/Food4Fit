package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Funcionario;
import br.com.binarytech.model.Telefone;

public class FuncionarioDAO {

	public static Boolean gravar(Funcionario funcionario) {
		return true;
	}

	public static Boolean editar(Funcionario funcionario) {
		return true;
	}

	public static Boolean deletar(int idFuncionario) {
		return true;
	}

	public static Boolean ativar(int idFuncionario) {
		return true;
	}

	public static Boolean desativar(int idFuncionario) {
		return true;
	}

	public static Funcionario buscar() {
		return new Funcionario();
	}
	
	public static ArrayList<Funcionario> listarByCargoCms(int idCargo) {

		ArrayList<Funcionario> lista = new ArrayList<>();

		String sql = "SELECT f.idFuncionario AS codigo, f.idBeneficio, p.*, c.cargo"
				+ "				FROM funcionario AS f"
				+ "				INNER JOIN pessoa AS p ON f.idPessoa = p.idPessoa"
				+ "				INNER JOIN cargo_funcionario AS cf ON cf.idFuncionario = f.idFuncionario"
				+ "				INNER JOIN cargo AS c ON c.idCargo = cf.idCargo"
				+ "				WHERE c.idCargo = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, idCargo);

			ResultSet result = str.executeQuery();

			while (result.next()) {
				Funcionario funcionario = new Funcionario();

				funcionario.setIdFuncionario(result.getInt("codigo"));
				funcionario.setCpf(result.getString("cpf"));
				funcionario.setNome(result.getString("nome"));
				funcionario.setEmail(result.getString("email"));
				funcionario.setCargo(result.getString("cargo"));
				funcionario.setIdBeneficio(result.getInt("idBeneficio"));
				funcionario.setSexo(result.getString("sexo"));
				funcionario.setRg(result.getString("rg"));
				funcionario.setNomeSocial(result.getString("nomeSocial"));
				funcionario.setIdPessoa(result.getInt("idPessoa"));

				// Setando a lista de telefones do funcionario
				int idTipo = 1; // TIPO = FUNCIONARIO
				ArrayList<Telefone> telefones = TelefoneDAO.buscar(funcionario.getIdFuncionario(), idTipo);
				funcionario.setTelefone(telefones);

				// Arrumar
				funcionario.setDataNascimento(result.getDate("nascimento"));

				lista.add(funcionario);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		BancoWEB.fecharConexao();
		
		return lista;
	}    
	
	
	
	public static Funcionario listarByIdCMS(int codigo) {

		Funcionario funcionario = new Funcionario();

		String sql = "SELECT f.idFuncionario AS codigo, f.idBeneficio, p.*, c.cargo\r\n"
				+ "	FROM funcionario AS f\r\n" + "	INNER JOIN pessoa AS p ON f.idPessoa = p.idPessoa\r\n"
				+ "	INNER JOIN cargo_funcionario AS cf ON cf.idFuncionario = f.idFuncionario\r\n"
				+ "	INNER JOIN cargo AS c ON c.idCargo = cf.idCargo\r\n" + "	WHERE f.idFuncionario = ?";

		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			str.setInt(1, codigo);

			ResultSet result = str.executeQuery();
			if (result.next()) {
				funcionario.setIdFuncionario(result.getInt("codigo"));
				funcionario.setCpf(result.getString("cpf"));
				funcionario.setNome(result.getString("nome"));
				funcionario.setEmail(result.getString("email"));
				funcionario.setCargo(result.getString("cargo"));
				funcionario.setIdBeneficio(result.getInt("idBeneficio"));
				funcionario.setSexo(result.getString("sexo"));
				funcionario.setRg(result.getString("rg"));
				funcionario.setNomeSocial(result.getString("nomeSocial"));
				funcionario.setIdPessoa(result.getInt("idPessoa"));

				// Setando a lista de telefones do funcionario
				int idTipo = 1; // TIPO = FUNCIONARIO
				ArrayList<Telefone> lista = TelefoneDAO.buscar(codigo, idTipo);
				funcionario.setTelefone(lista);

				// Arrumar
				funcionario.setDataNascimento(result.getDate("nascimento"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return funcionario;

	}

}