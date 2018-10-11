package br.com.binarytech.model;

import java.util.*;

public class Midia {

    private int idMidia;
    private int idTabela;
    private int idExterno;
    private String titulo;
    private String caminho;
    private String legenda;
    
	public int getIdMidia() {
		return idMidia;
	}
	public void setIdMidia(int idMidia) {
		this.idMidia = idMidia;
	}
	public int getIdTabela() {
		return idTabela;
	}
	public void setIdTabela(int idTabela) {
		this.idTabela = idTabela;
	}
	public int getIdExterno() {
		return idExterno;
	}
	public void setIdExterno(int idExterno) {
		this.idExterno = idExterno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public String getLegenda() {
		return legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

    
    
}