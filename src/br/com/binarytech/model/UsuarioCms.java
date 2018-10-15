package br.com.binarytech.model;

public class UsuarioCms extends Funcionario{

    private int idUsuarioCms;
    private int idPermissao;
    private Boolean status;
    private String senha;
    private String login;
    private String area;
    
    
	public int getIdUsuarioCms() {
		return idUsuarioCms;
	}
	
	public void setIdUsuarioCms(int idUsuarioCms) {
		this.idUsuarioCms = idUsuarioCms;
	}
	
	public int getIdPermissao() {
		return idPermissao;
	}
	
	public void setIdPermissao(int idPermissao) {
		this.idPermissao = idPermissao;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
    
    

}