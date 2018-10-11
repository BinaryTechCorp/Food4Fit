package br.com.binarytech.dao;

import br.com.binarytech.model.Nutricional;

public class NutricionalDAO{

	public static Boolean gravar(Nutricional nutricional){ return true;}                    

	public static Boolean editar(Nutricional nutricional){ return true;}  

	public static Boolean deletar(int idNutricional){ return true;}  

	public static Boolean ativar(int idNutricional){ return true;}  

	public static Boolean desativar(int idNutricional){ return true;}  

	public static Nutricional buscar(){ return new Nutricional();} 

	public static Nutricional listar(){ return new Nutricional();}  
}