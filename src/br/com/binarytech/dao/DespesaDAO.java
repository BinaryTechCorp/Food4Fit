package br.com.binarytech.dao;

import br.com.binarytech.model.Despesa;

public class DespesaDAO {

	public static Boolean gravar(Despesa despesa){ return true;}                    

	public static Boolean editar(Despesa despesa){ return true;}  

	public static Boolean deletar(int idDespesa){ return true;}  

	public static Boolean ativar(int idDespesa){ return true;}  

	public static Boolean desativar(int idDespesa){ return true;}  

	public static Despesa buscar(){ return new Despesa();} 

	public static Despesa listar(){ return new Despesa();}    

}