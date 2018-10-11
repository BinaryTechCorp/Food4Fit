package br.com.binarytech.dao;

import br.com.binarytech.model.Ingrediente;

public class IngredienteDAO{

	public static Boolean gravar(Ingrediente ingrediente){ return true;}                    

	public static Boolean editar(Ingrediente ingrediente){ return true;}  

	public static Boolean deletar(int idIngrediente){ return true;}  

	public static Boolean ativar(int idIngrediente){ return true;}  

	public static Boolean desativar(int idIngrediente){ return true;}  

	public static Ingrediente buscar(){ return new Ingrediente();} 

	public static Ingrediente listar(){ return new Ingrediente();}    

}