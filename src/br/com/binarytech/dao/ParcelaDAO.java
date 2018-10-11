package br.com.binarytech.dao;

import br.com.binarytech.model.Parcela;

public class ParcelaDAO {

	public static Boolean gravar(Parcela parcela){ return true;}                    

	public static Boolean editar(Parcela parcela){ return true;}  

	public static Boolean deletar(int idParcela){ return true;}  

	public static Boolean ativar(int idParcela){ return true;}  

	public static Boolean desativar(int idParcela){ return true;}  

	public static Parcela buscar(){ return new Parcela();} 

	public static Parcela listar(){ return new Parcela();}    

}