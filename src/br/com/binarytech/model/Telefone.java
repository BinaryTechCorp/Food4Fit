package br.com.binarytech.model;

import java.util.*;

public class Telefone {

    private int idTelefone;
    private String telefone;
    private int idTipo;
    private int idExterno;
    private String contato;
    
	public int getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public int getIdExterno() {
		return idExterno;
	}
	public void setIdExterno(int idExterno) {
		this.idExterno = idExterno;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}


}