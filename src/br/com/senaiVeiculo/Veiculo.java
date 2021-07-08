package br.com.senaiVeiculo;

import br.com.senaiMarcas.Marca;

public class Veiculo extends Marca {
	
	private String modelo;
	private int ano;
	private int tipoCombustivel;
	private int placa;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(int i) {
		this.tipoCombustivel = i;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	
	}

