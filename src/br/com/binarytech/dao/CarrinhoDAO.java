package br.com.binarytech.dao;

import br.com.binarytech.model.Carrinho;


public class CarrinhoDAO {
	
	public static Boolean gravar(Carrinho carrinho){ return true;}                    

	public static Boolean editar(Carrinho carrinho){ return true;}  

	public static Boolean deletar(int idCarrinho){ return true;}  

	public static Boolean ativar(int idCarrinho){ return true;}  

	public static Boolean desativar(int idCarrinho){ return true;}  

	public static Carrinho buscar(){ return new Carrinho();} 

	public static Carrinho listar(){ return new Carrinho();}    

}