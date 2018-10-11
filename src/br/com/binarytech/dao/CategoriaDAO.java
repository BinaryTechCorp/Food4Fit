package br.com.binarytech.dao;

import br.com.binarytech.model.Categoria;

public class CategoriaDAO {

	public static Boolean gravar(Categoria categoria){ return true;}                    

	public static Boolean editar(Categoria categoria){ return true;}  

	public static Boolean deletar(int idCategoria){ return true;}  

	public static Boolean ativar(int idCategoria){ return true;}  

	public static Boolean desativar(int idCategoria){ return true;}  

	public static Categoria buscar(){ return new Categoria();} 

	public static Categoria listar(){ return new Categoria();}    

}