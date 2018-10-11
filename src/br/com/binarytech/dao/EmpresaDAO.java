package br.com.binarytech.dao;

import br.com.binarytech.model.Empresa;

public class EmpresaDAO {

	public static Boolean gravar(Empresa empresa){ return true;}                    

	public static Boolean editar(Empresa empresa){ return true;}  

	public static Boolean deletar(int idEmpresa){ return true;}  

	public static Boolean ativar(int idEmpresa){ return true;}  

	public static Boolean desativar(int idEmpresa){ return true;}  

	public static Empresa buscar(){ return new Empresa();} 

	public static Empresa listar(){ return new Empresa();}    

}