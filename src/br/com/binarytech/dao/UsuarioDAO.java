package br.com.binarytech.dao;

import br.com.binarytech.model.Usuario;

public class UsuarioDAO{

	public static Boolean gravar(Usuario usuario){ return true;}                    

	public static Boolean editar(Usuario usuario){ return true;}  

	public static Boolean deletar(int idUsuario){ return true;}  

	public static Boolean ativar(int idUsuario){ return true;}  

	public static Boolean desativar(int idUsuario){ return true;}  

	public static Usuario buscar(){ return new Usuario();} 

	public static Usuario listar(){ return new Usuario();}    

}