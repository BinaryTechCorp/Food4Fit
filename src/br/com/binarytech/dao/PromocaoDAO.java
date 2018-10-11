package br.com.binarytech.dao;

import br.com.binarytech.model.Promocao;

public class PromocaoDAO{

	public static Boolean gravar(Promocao promocao){ return true;}                    

	public static Boolean editar(Promocao promocao){ return true;}  

	public static Boolean deletar(int idPromocao){ return true;}  

	public static Boolean ativar(int idPromocao){ return true;}  

	public static Boolean desativar(int idPromocao){ return true;}  

	public static Promocao buscar(){ return new Promocao();} 

	public static Promocao listar(){ return new Promocao();}    

}