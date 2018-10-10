package br.com.binarytech.dao;

import br.com.binarytech.model.CaixaEntrada;

public class CaixaEntradaDAO {

	
	public static Boolean gravar(CaixaEntrada caixaEntrada){ return true;}                    

	public static Boolean editar(CaixaEntrada caixaEntrada){ return true;}  

	public static Boolean deletar(int idCaixaEntrada){ return true;}  

	public static Boolean ativar(int idCaixaEntrada){ return true;}  

	public static Boolean desativar(int idCaixaEntrada){ return true;}  

	public static CaixaEntrada buscar(){ return new CaixaEntrada();} 

	public static CaixaEntrada listar(){ return new CaixaEntrada();}  

}