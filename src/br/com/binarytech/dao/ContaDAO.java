package br.com.binarytech.dao;

import br.com.binarytech.model.Conta;

public class ContaDAO{

	public static Boolean gravar(Conta conta){ return true;}                    

	public static Boolean editar(Conta conta){ return true;}  

	public static Boolean deletar(int idConta){ return true;}  

	public static Boolean ativar(int idConta){ return true;}  

	public static Boolean desativar(int idConta){ return true;}  

	public static Conta buscar(){ return new Conta();} 

	public static Conta listar(){ return new Conta();}    
}