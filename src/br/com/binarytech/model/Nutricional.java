package br.com.binarytech.model;

public class Nutricional extends Medida{


    public Nutricional() {
    }

    private int idNutricional;
    private String informacao;
    private int idMedida;
    private float vd;
	public int getIdNutricional() {
		return idNutricional;
	}
	public void setIdNutricional(int idNutricional) {
		this.idNutricional = idNutricional;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public int getIdMedida() {
		return idMedida;
	}
	public void setIdMedida(int idMedida) {
		this.idMedida = idMedida;
	}
	public float getVd() {
		return vd;
	}
	public void setVd(float vd) {
		this.vd = vd;
	}

    
}