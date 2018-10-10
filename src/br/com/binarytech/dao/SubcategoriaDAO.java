package br.com.binarytech.dao;

import br.com.binarytech.model.Subcategoria;

public class SubcategoriaDAO{

	public static Boolean gravar(Subcategoria subcategoria){ return true;}                    

	public static Boolean editar(Subcategoria subcategoria){ return true;}  

	public static Boolean deletar(int idSubcategoria){ return true;}  

	public static Boolean ativar(int idSubcategoria){ return true;}  

	public static Boolean desativar(int idSubcategoria){ return true;}  

	public static Subcategoria buscar(){ return new Subcategoria();} 

	public static Subcategoria listar(){ return new Subcategoria();}    

}