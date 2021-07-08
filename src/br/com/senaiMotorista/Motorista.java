package br.com.senaiMotorista;

public class Motorista {

	private String nomeMotorista ;
	private int anoDeNascimento;
	private int idade;
	private int CategoriaHabilitacao;
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public int getCategoriaHabilitacao() {
		return CategoriaHabilitacao;
	}
	public void setCategoriaHabilitacao(int categoriaHabilitacao) {
		CategoriaHabilitacao = categoriaHabilitacao;
	}
	
	public String getNomeMotorista() {
		return nomeMotorista;
	}
	public void setNomeMotorista(String motorista) {
		this.nomeMotorista = motorista;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	}
	

	

