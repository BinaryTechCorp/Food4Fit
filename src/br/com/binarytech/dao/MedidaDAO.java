package br.com.binarytech.dao;

import br.com.binarytech.model.Medida;

public class MedidaDAO {

	public static Boolean gravar(Medida medida){ return true;}                    

	public static Boolean editar(Medida medida){ return true;}  

	public static Boolean deletar(int idMedida){ return true;}  

	public static Boolean ativar(int idMedida){ return true;}  

	public static Boolean desativar(int idMedida){ return true;}  

	public static Medida buscar(){ return new Medida();} 

	public static Medida listar(){ return new Medida();}  

}