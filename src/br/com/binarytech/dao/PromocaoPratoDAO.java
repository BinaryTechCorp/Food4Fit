package br.com.binarytech.dao;

import br.com.binarytech.model.PromocaoPrato;

public class PromocaoPratoDAO {

	public static Boolean gravar(PromocaoPrato promocaoPrato){ return true;}                    

	public static Boolean editar(PromocaoPrato promocaoPrato){ return true;}  

	public static Boolean deletar(int idPromocaoPrato){ return true;}  

	public static Boolean ativar(int idPromocaoPrato){ return true;}  

	public static Boolean desativar(int idPromocaoPrato){ return true;}  

	public static PromocaoPrato buscar(){ return new PromocaoPrato();} 

	public static PromocaoPrato listar(){ return new PromocaoPrato();}    

}