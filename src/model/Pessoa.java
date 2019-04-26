package model;

public class Pessoa {
	private String nome;
	private String endereco;
	private long cep;
	private String cidade;
	private String estado;
	
	//NOME
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//ENDEREÇO
	
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getendereco() {
		return endereco;
	}
	
	// CEP
	
	public void setcep(long cep) {
		this.cep = cep;
	}
	
	public long getcep() {
		return cep;
	}
	
	//CIDADE

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getcidade() {
		return cidade;
	}
	
	//ESTADO
	
	public void setestado(String estado) {
		this.estado = estado;
	}
	
	public String getestado() {
		return estado;
	}
}



