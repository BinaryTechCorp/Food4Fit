package br.com.binarytech.dao;

import br.com.binarytech.model.Pessoa;

public class PessoaDAO{

	public static Boolean gravar(Pessoa pessoa){ return true;}                    

	public static Boolean editar(Pessoa pessoa){ return true;}  

	public static Boolean deletar(int idPessoa){ return true;}  

	public static Boolean ativar(int idPessoa){ return true;}  

	public static Boolean desativar(int idPessoa){ return true;}  

	public static Pessoa buscar(){ return new Pessoa();} 

	public static Pessoa listar(){ return new Pessoa();}    

}