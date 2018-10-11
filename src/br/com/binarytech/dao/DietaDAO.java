package br.com.binarytech.dao;

import br.com.binarytech.model.Dieta;

public class DietaDAO {

	public static Boolean gravar(Dieta dieta){ return true;}                    

	public static Boolean editar(Dieta dieta){ return true;}  

	public static Boolean deletar(int idDieta){ return true;}  

	public static Boolean ativar(int idDieta){ return true;}  

	public static Boolean desativar(int idDieta){ return true;}  

	public static Dieta buscar(){ return new Dieta();} 

	public static Dieta listar(){ return new Dieta();}    

}