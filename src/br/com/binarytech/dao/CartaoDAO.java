package br.com.binarytech.dao;

import br.com.binarytech.model.Cartao;


public class CartaoDAO {

	public static Boolean gravar(Cartao cartao){ return true;}                    

	public static Boolean editar(Cartao cartao){ return true;}  

	public static Boolean deletar(int idCartao){ return true;}  

	public static Boolean ativar(int idCartao){ return true;}  

	public static Boolean desativar(int idCartao){ return true;}  

	public static Cartao buscar(){ return new Cartao();} 

	public static Cartao listar(){ return new Cartao();}    

}