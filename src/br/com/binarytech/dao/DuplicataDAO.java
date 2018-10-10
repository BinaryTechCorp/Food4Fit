package br.com.binarytech.dao;

import br.com.binarytech.model.Duplicata;


public class DuplicataDAO {

	public static Boolean gravar(Duplicata duplicata){ return true;}                    

	public static Boolean editar(Duplicata duplicata){ return true;}  

	public static Boolean deletar(int idDuplicata){ return true;}  

	public static Boolean ativar(int idDuplicata){ return true;}  

	public static Boolean desativar(int idDuplicata){ return true;}  

	public static Duplicata buscar(){ return new Duplicata();} 

	public static Duplicata listar(){ return new Duplicata();}    

}