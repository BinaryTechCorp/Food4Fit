package br.com.binarytech.dao;

import br.com.binarytech.model.CasosSucesso;

public class CasosSucessoDAO {

	public static Boolean gravar(CasosSucesso casosSucesso){ return true;}                    

	public static Boolean editar(CasosSucesso casosSucesso){ return true;}  

	public static Boolean deletar(int idCasosSucesso){ return true;}  

	public static Boolean ativar(int idCasosSucesso){ return true;}  

	public static Boolean desativar(int idCasosSucesso){ return true;}  

	public static CasosSucesso buscar(){ return new CasosSucesso();} 

	public static CasosSucesso listar(){ return new CasosSucesso();}    

}