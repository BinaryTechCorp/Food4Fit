package br.com.binarytech.dao;

import br.com.binarytech.model.Porcao;

public class PorcaoDAO {

	public static Boolean gravar(Porcao porcao){ return true;}                    

	public static Boolean editar(Porcao porcao){ return true;}  

	public static Boolean deletar(int idPorcao){ return true;}  

	public static Boolean ativar(int idPorcao){ return true;}  

	public static Boolean desativar(int idPorcao){ return true;}  

	public static Porcao buscar(){ return new Porcao();} 

	public static Porcao listar(){ return new Porcao();}    

}