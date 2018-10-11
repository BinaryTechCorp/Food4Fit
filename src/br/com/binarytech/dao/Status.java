package br.com.binarytech.dao;

public class Status {

	public static Boolean gravar(Status status){ return true;}                    

	public static Boolean editar(Status status){ return true;}  

	public static Boolean deletar(int idStatus){ return true;}  

	public static Boolean ativar(int idStatus){ return true;}  

	public static Boolean desativar(int idStatus){ return true;}  

	public static Status buscar(){ return new Status();} 

	public static Status listar(){ return new Status();}

}