package br.com.binarytech.model;

import java.util.*;

/**
 * 
 */
public class Ingrediente extends Medida{

    /**
     * Default constructor
     */
    public Ingrediente() {
    }

    private int idIngrediente;
    private String ingrediente;
    private ArrayList<Nutricional> nutrientes;
    private int estoque;
    private int margemSeguranca;
    
	public int getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public ArrayList<Nutricional> getNutrientes() {
		return nutrientes;
	}
	public void setNutrientes(ArrayList<Nutricional> nutrientes) {
		this.nutrientes = nutrientes;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public int getMargemSeguranca() {
		return margemSeguranca;
	}
	public void setMargemSeguranca(int margemSeguranca) {
		this.margemSeguranca = margemSeguranca;
	}
    
    

}