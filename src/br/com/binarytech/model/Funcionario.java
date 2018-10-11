package br.com.binarytech.model;

import java.util.*;

public class Funcionario extends Pessoa{

    private int idFuncionario;
    private int idBeneficio;
    private ArrayList<String> beneficio;
    private String cargo;

	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getIdBeneficio() {
		return idBeneficio;
	}

	public void setIdBeneficio(int idBeneficio) {
		this.idBeneficio = idBeneficio;
	}
	
	public ArrayList<String> getBeneficio() {
		return beneficio;
	}
	
	public void setBeneficio(ArrayList<String> beneficio) {
		this.beneficio = beneficio;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}