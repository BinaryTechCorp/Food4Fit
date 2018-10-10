package br.com.binarytech.dao;

import br.com.binarytech.model.Progresso;

public class ProgressoDAO{

	public static Boolean gravar(Progresso progresso){ return true;}                    

	public static Boolean editar(Progresso progresso){ return true;}  

	public static Boolean deletar(int idProgresso){ return true;}  

	public static Boolean ativar(int idProgresso){ return true;}  

	public static Boolean desativar(int idProgresso){ return true;}  

	public static Progresso buscar(){ return new Progresso();} 

	public static Progresso listar(){ return new Progresso();}    

}