package br.com.binarytech.model;

public class InformacaoSite {
	
    public InformacaoSite() {
    }

    private int idInformacaoSite;
    private Midia foto;
    private String titulo;
    private String texto;
    private Boolean status;
    private String assunto;
    
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getIdInformacaoSite() {
		return idInformacaoSite;
	}
	
	public void setIdInformacaoSite(int idInformacaoSite) {
		this.idInformacaoSite = idInformacaoSite;
	}
	
	public Midia getFoto() {
		return foto;
	}
	
	public void setFoto(Midia foto) {
		this.foto = foto;
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
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
    
}