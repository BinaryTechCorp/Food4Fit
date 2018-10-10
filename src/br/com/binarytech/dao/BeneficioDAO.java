package br.com.binarytech.dao;

import br.com.binarytech.model.Bandeira;
import br.com.binarytech.model.Beneficio;

/**
 * 
 */
public class BeneficioDAO  {
	
	public static Boolean gravar(Bandeira beneficio){ return true;}                    

	public static Boolean editar(Bandeira beneficio){ return true;}  

	public static Boolean deletar(int idBeneficio){ return true;}  

	public static Boolean ativar(int idBeneficio){ return true;}  

	public static Boolean desativar(int idBandeira){ return true;}  

	public static Beneficio buscar(){ return new Beneficio();} 

	public static Beneficio listar(){ return new Beneficio();}   
}