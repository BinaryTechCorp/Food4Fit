package br.com.binarytech.dao;

import br.com.binarytech.model.Prato;

public class PratoDAO {

	public static Boolean gravar(Prato prato){ return true;}                    

	public static Boolean editar(Prato prato){ return true;}  

	public static Boolean deletar(int idPrato){ return true;}  

	public static Boolean ativar(int idPrato){ return true;}  

	public static Boolean desativar(int idPrato){ return true;}  

	public static Prato buscar(){ return new Prato();} 

	public static Prato listar(){ return new Prato();}    

}