package br.com.senaiMarcas;

import java.util.List;
import java.util.Scanner;

public class MarcaController {

	public Marca get(int i) {
		return null;
	}
	private static final List<Marca> marcas = null;
	private static Scanner tec;
	
	public static Marca cadastrarMarca() {
		Marca marca = new Marca();
		
		System.out.println("---Cadastrar Marca---");
		System.out.println("Iforme a marca: ");
		tec.nextLine();
		marca.setMarca(tec.nextLine());
		return marca;
}
}
