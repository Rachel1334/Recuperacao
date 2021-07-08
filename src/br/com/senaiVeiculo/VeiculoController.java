package br.com.senaiVeiculo;

import java.util.List;
import java.util.Scanner;

import br.com.senaiMarcas.Marca;
import br.com.senaiMarcas.MarcaController;
import br.com.senaiMarcas.*;
public class VeiculoController {

	private static final List<Veiculo> veiculos = null;
	private static Scanner tec;
	private static Veiculo marca;
		
	public VeiculoController() {
		tec = new Scanner(System.in);
		}
	public static int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
		}

	public Veiculo cadastrarveiculo() {
		Veiculo veiculo = new Veiculo();
		
		System.out.println("---Cadastrar Veiculo---");
		System.out.println("Iforme o modelo: ");
		tec.nextLine();
		veiculo.setModelo(tec.nextLine());
	
		System.out.println("--- Ano--- ");
		System.out.print("Informe o ano: ");
		veiculo.setAno(tec.nextInt());
				
		System.out.print("Informe o Tipo de Combustivel: ");
		veiculo.setTipoCombustivel(tec.nextInt());
		
		System.out.println("--Informe a placa--");
		veiculo.setPlaca(tec.nextInt());	
		
		System.out.println("--Produto cadastrado Informe a marca--");
		System.out.println("Informe a Marca: ");
		tec.nextInt();
		veiculo.setMarca(tec.nextLine());
		return veiculo;
		
		}
	
	public  List<Veiculo> listarVeiculo(List<Veiculo> veiculos){
	 if(veiculos.size() <= 0) {
				  
		System.out.println("Não possui Veiculos para listar.");
		return null;
			}
		System.out.printf(" %7s | %4s | %10s | %8s | %5s\n", 
					"Id","Modelo", "Ano", "Tipo de Combustivel","Placa","Marca");
		for(int i = 0; i<veiculos.size(); i++) {
		System.out.printf(" %7s | %4s | %10s | %8s | %5s\n ", 
		i + 1,
		veiculos.get(i).getModelo(),
		veiculos.get(i).getAno(),
		veiculos.get(i).getTipoCombustivel(),
		veiculos.get(i).getPlaca(),
		veiculos.get(i).getMarca());
		}
		return veiculos;
		}

	public static List <Veiculo> editarVeiculo(List<Veiculo> veiculos) {
		Veiculo veiculo = new Veiculo();
   	if(veiculos.isEmpty()) {
   	}
   	System.out.println("Informe o Id do Veiculo para editar: ");
	  int idVeiculo= tec.nextInt() - 1;
	   	
	System.out.println("1) Modelo do Veiculo");
   	System.out.println("2) Ano");
   	System.out.println("3) Tipo de Combustivel");
   	System.out.println("4) Placa");
   	System.out.println("Informe o campo para ser editado:" );
   	int opcao = tec.nextInt();
   		
	switch(opcao) {
		case 1: 
			System.out.println("--- Editar o modelo do Veiculo ---");
			System.out.println("Informe o novo nome do veiculo: ");
			veiculo.setModelo(null);
			
			veiculo.setAno(veiculos.get(idVeiculo).getAno());
			veiculo.setTipoCombustivel(veiculos.get(idVeiculo).getTipoCombustivel());
			veiculo.setPlaca(veiculos.get(idVeiculo).getPlaca());
			break;
			
		case 2:
			System.out.println("--- Editar Ano  ---");
			System.out.println("Informe o novo ano: ");
			veiculo.setAno(tec.nextInt());
				
			veiculo.setModelo(veiculos.get(idVeiculo).getModelo());
			veiculo.setTipoCombustivel(veiculos.get(idVeiculo).getTipoCombustivel());
			veiculo.setPlaca(veiculos.get(idVeiculo).getPlaca());
			break;
				
		case 3:
			System.out.println("--- Editar  Tipo de Combustivel---");
			System.out.println("Informe o novo tipo de Combustivel: ");
			veiculo.setTipoCombustivel(tec.nextInt());
				
			veiculo.setModelo(veiculos.get(idVeiculo).getModelo());
			veiculo.setAno(veiculos.get(idVeiculo).getAno());	
			veiculo.setPlaca(veiculos.get(idVeiculo).getPlaca());
		    break;
		case 4:
			System.out.println("--- Editar Placa---");
			System.out.println("Informe a nova Placa: ");
			veiculo.setPlaca(tec.nextInt());
				
			veiculo.setModelo(veiculos.get(idVeiculo).getModelo());
			veiculo.setAno(veiculos.get(idVeiculo).getAno());	
			veiculo.setTipoCombustivel(veiculos.get(idVeiculo).getTipoCombustivel());
 }
	 return veiculos;	
	}
	     public void excluirMVeiculo(List<Veiculo>veiculos) {
		 	listarVeiculo(veiculos);	
		 	if(veiculos.isEmpty()) {
		   			
		   	return;
		 		}
		System.out.println("-----Excluir Veiculo-----");	
		System.out.println("Informe o Id do veiculo para excluir:");
		 	int idVeiculo = tec.nextInt() - 1;
			
			if(veiculos.size() <= idVeiculo) {
		System.out.println("Motorista não cadastrado.");
				return;
			}
			veiculos.remove(idVeiculo);
		        }
		public void menu(List<Veiculo> veiculos) {
		System.out.println("----MENU----");
		System.out.println("1)Cadastrar Veiculo");	
		System.out.println("2)Listar Veiculos cadastrados");
		System.out.println("3)Editar Veiculo");
		System.out.println("4)Excluir veiculo");
		System.out.println("Informe a opção desejada: ");
		int opcao = tec.nextInt();
		switch (opcao) {

		case 1:
			veiculos.add(cadastrarveiculo());
		break;
			
		case 2:
			listarVeiculo(veiculos);
		break;
			
		case 3:
			editarVeiculo(veiculos);
		break;
		
		case 4:
			editarVeiculo(veiculos);
		break;
			
		default:
			System.out.println("Opção ivalida");
		break;
		}
				
			System.out.println("Sistema finalizado!!");
			
	}
}
	


