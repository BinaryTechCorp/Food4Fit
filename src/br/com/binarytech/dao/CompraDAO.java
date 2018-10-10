package br.com.binarytech.dao;

import br.com.binarytech.model.Compra;

public class CompraDAO {

	public static Boolean gravar(Compra Compra){ return true;}                    

	public static Boolean editar(Compra Compra){ return true;}  

	public static Boolean deletar(int idCompra){ return true;}  

	public static Boolean ativar(int idCompra){ return true;}  

	public static Boolean desativar(int idCompra){ return true;}  

	public static Compra buscar(){ return new Compra();} 

	public static Compra listar(){ return new Compra();}    

}