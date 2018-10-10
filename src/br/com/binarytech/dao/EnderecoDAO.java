package br.com.binarytech.dao;

import br.com.binarytech.model.Endereco;

public class EnderecoDAO {

	public static Boolean gravar(Endereco Endereco){ return true;}                    

	public static Boolean editar(Endereco Endereco){ return true;}  

	public static Boolean deletar(int idEndereco){ return true;}  

	public static Boolean ativar(int idEndereco){ return true;}  

	public static Boolean desativar(int idEndereco){ return true;}  

	public static Endereco buscar(){ return new Endereco();} 

	public static Endereco listar(){ return new Endereco();}    

}