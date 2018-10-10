package br.com.binarytech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.binarytech.jdbc.BancoWEB;
import br.com.binarytech.model.Cargo;


public class CargoDAO {

	public static ArrayList<Cargo> listar(){
		
		ArrayList<Cargo> listaCargo = new ArrayList<>();
		
		String sql = "SELECT * FROM cargo";
		
		try {
			PreparedStatement str = BancoWEB.abrirConexao().prepareStatement(sql);
			
			ResultSet rs = str.executeQuery();
			
			while(rs.next()) {
				
				Cargo cargo = new Cargo();
				cargo.setIdCargo(rs.getInt("idCargo"));
				cargo.setCargo(rs.getString("cargo"));
				
				listaCargo.add(cargo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaCargo;
	
	}    

}