package br.com.binarytech.dao;

import br.com.binarytech.model.Refeicao;

public class RefeicaoDAO {

	public static Boolean gravar(Refeicao refeicao){ return true;}                    

	public static Boolean editar(Refeicao refeicao){ return true;}  

	public static Boolean deletar(int idRefeicao){ return true;}  

	public static Boolean ativar(int idRefeicao){ return true;}  

	public static Boolean desativar(int idRefeicao){ return true;}  

	public static Refeicao buscar(){ return new Refeicao();} 

	public static Refeicao listar(){ return new Refeicao();}    

}