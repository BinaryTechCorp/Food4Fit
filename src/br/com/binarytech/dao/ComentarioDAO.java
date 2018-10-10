package br.com.binarytech.dao;

import br.com.binarytech.model.Comentario;


public class ComentarioDAO {

	public static Boolean gravar(Comentario Comentario){ return true;}                    

	public static Boolean editar(Comentario Comentario){ return true;}  

	public static Boolean deletar(int idComentario){ return true;}  

	public static Boolean ativar(int idComentario){ return true;}  

	public static Boolean desativar(int idComentario){ return true;}  

	public static Comentario buscar(){ return new Comentario();} 

	public static Comentario listar(){ return new Comentario();}    

}