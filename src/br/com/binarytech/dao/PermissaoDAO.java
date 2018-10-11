package br.com.binarytech.dao;

import br.com.binarytech.model.Permissao;

public class PermissaoDAO {

	public static Boolean gravar(Permissao permissao){ return true;}                    

	public static Boolean editar(Permissao permissao){ return true;}  

	public static Boolean deletar(int idPermissao){ return true;}  

	public static Boolean ativar(int idPermissao){ return true;}  

	public static Boolean desativar(int idPermissao){ return true;}  

	public static Permissao buscar(){ return new Permissao();} 

	public static Permissao listar(){ return new Permissao();}    

}