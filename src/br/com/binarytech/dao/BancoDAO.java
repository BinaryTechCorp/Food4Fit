package br.com.binarytech.dao;

import br.com.binarytech.model.Banco;

public class BancoDAO {

	public static Boolean gravar(Banco banco){ return true;}                    

	public static Boolean editar(Banco banco){ return true;}  

	public static Boolean deletar(int idBanco){ return true;}  

	public static Boolean ativar(int idBanco){ return true;}  

	public static Boolean desativar(int idBanco){ return true;}  

	public static Banco buscar(){ return new Banco();} 

	public static Banco listar(){ return new Banco();}    

}