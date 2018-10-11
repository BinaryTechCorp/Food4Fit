package br.com.binarytech.dao;

import br.com.binarytech.model.PratoPorcao;

public class PratoPorcaoDAO{

	public static Boolean gravar(PratoPorcao pratoPorcao){ return true;}                    

	public static Boolean editar(PratoPorcao pratoPorcao){ return true;}  

	public static Boolean deletar(int idPratoPorcao){ return true;}  

	public static Boolean ativar(int idPratoPorcao){ return true;}  

	public static Boolean desativar(int idPratoPorcao){ return true;}  

	public static PratoPorcao buscar(){ return new PratoPorcao();} 

	public static PratoPorcao listar(){ return new PratoPorcao();}    

}