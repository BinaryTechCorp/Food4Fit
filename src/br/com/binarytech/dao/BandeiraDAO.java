package br.com.binarytech.dao;

import br.com.binarytech.model.Bandeira;

public class BandeiraDAO {

	public static Boolean gravar(Bandeira bandeira){ return true;}                    

	public static Boolean editar(Bandeira bandeira){ return true;}  

	public static Boolean deletar(int idBandeira){ return true;}  

	public static Boolean ativar(int idBandeira){ return true;}  

	public static Boolean desativar(int idBandeira){ return true;}  

	public static Bandeira buscar(){ return new Bandeira();} 

	public static Bandeira listar(){ return new Bandeira();}    

}