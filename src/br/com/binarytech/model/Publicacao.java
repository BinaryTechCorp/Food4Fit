package br.com.binarytech.model;

import java.util.*;

/**
 * 
 */
public class Publicacao {

    /**
     * Default constructor
     */
    public Publicacao() {
    }

    /**
     * 
     */
    private int idPublicacao;

    /**
     * 
     */
    private int idUsuario;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private String texto;

    /**
     * 
     */
    private int idTabela;

    /**
     * 
     */
    private Date data;

    /**
     * 
     */
    private int curtida;

    /**
     * 
     */
    private int visualizacao;

    /**
     * 
     */
    private int compartilhamento;

	public int getIdPublicacao() {
		return idPublicacao;
	}

	public void setIdPublicacao(int idPublicacao) {
		this.idPublicacao = idPublicacao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getIdTabela() {
		return idTabela;
	}

	public void setIdTabela(int idTabela) {
		this.idTabela = idTabela;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCurtida() {
		return curtida;
	}

	public void setCurtida(int curtida) {
		this.curtida = curtida;
	}

	public int getVisualizacao() {
		return visualizacao;
	}

	public void setVisualizacao(int visualizacao) {
		this.visualizacao = visualizacao;
	}

	public int getCompartilhamento() {
		return compartilhamento;
	}

	public void setCompartilhamento(int compartilhamento) {
		this.compartilhamento = compartilhamento;
	}
    
    
    
    

}