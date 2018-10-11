package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Cargo;
import br.com.binarytech.model.Nutricional;

public class NutricionalDAO{

	public static Boolean gravar(Nutricional nutricional){ return true;}                    

	public static Boolean editar(Nutricional nutricional){ return true;}  

	public static Boolean deletar(int idNutricional){ return true;}  

	public static Boolean ativar(int idNutricional){ return true;}  

	public static Boolean desativar(int idNutricional){ return true;}  

	public static Nutricional buscar(){ return new Nutricional();} 

	public static ArrayList<Nutricional> listar(){ 
		ArrayList<Nutricional> listaNutricional = new ArrayList<>();
		
		String sql = "SELECT * FROM nutricional";
		
		MedidaDAO medidaDao = new MedidaDAO();
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				
				Nutricional nutricional = new Nutricional();
				nutricional.setIdNutricional((rs.getInt("idNutricional")));
				nutricional.setIdMedida(rs.getInt("idMedida"));
				nutricional.setMedida(medidaDao.buscar(nutricional.getIdMedida()).getMedida());//
				nutricional.setInformacao(rs.getString("informacao"));
				nutricional.setSigla(medidaDao.buscar(nutricional.getIdMedida()).getSigla());
				
				listaNutricional.add(nutricional);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaNutricional;
	}  
}