package br.com.binarytech.dao;

import br.com.binarytech.model.Tipo;

public class TipoDAO {

	public static Boolean gravar(Tipo tipo){ return true;}                    

	public static Boolean editar(Tipo tipo){ return true;}  

	public static Boolean deletar(int idTipo){ return true;}  

	public static Boolean ativar(int idTipo){ return true;}  

	public static Boolean desativar(int idTipo){ return true;}  

	public static Tipo buscar(){ return new Tipo();} 

	public static Tipo listar(){ return new Tipo();}    

}