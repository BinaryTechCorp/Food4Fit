package br.com.binarytech.dao;

import br.com.binarytech.model.Tabela;

public class TabelaDAO {

	public static Boolean gravar(Tabela tabela){ return true;}                    

	public static Boolean editar(Tabela tabela){ return true;}  

	public static Boolean deletar(int idTabela){ return true;}  

	public static Boolean ativar(int idTabela){ return true;}  

	public static Boolean desativar(int idTabela){ return true;}  

	public static Tabela buscar(){ return new Tabela();} 

	public static Tabela listar(){ return new Tabela();}    

}