package br.com.binarytech.dao;

import br.com.binarytech.model.Diario;

public class DiarioDAO {

	public static Boolean gravar(Diario diario){ return true;}                    

	public static Boolean editar(Diario diario){ return true;}  

	public static Boolean deletar(int idDiario){ return true;}  

	public static Boolean ativar(int idDiario){ return true;}  

	public static Boolean desativar(int idDiario){ return true;}  

	public static Diario buscar(){ return new Diario();} 

	public static Diario listar(){ return new Diario();}    

}