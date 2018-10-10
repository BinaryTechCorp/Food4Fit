package br.com.binarytech.dao;

import br.com.binarytech.model.Fornecedor;

public class FornecedorDAO{

	public static Boolean gravar(Fornecedor fornecedor){ return true;}                    

	public static Boolean editar(Fornecedor fornecedor){ return true;}  

	public static Boolean deletar(int idFornecedor){ return true;}  

	public static Boolean ativar(int idFornecedor){ return true;}  

	public static Boolean desativar(int idFornecedor){ return true;}  

	public static Fornecedor buscar(){ return new Fornecedor();} 

	public static Fornecedor listar(){ return new Fornecedor();}    

}