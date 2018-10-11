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

}