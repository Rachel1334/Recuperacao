package br.com.senaiMotorista;

import java.util.List;
import java.util.Scanner;

import br.com.senaiVeiculo.Veiculo;

public class MotoristaController extends Veiculo {
	
	private static final List<Motorista> motoristas = null;
	private static Scanner tec;
		
	public MotoristaController() {
		tec = new Scanner(System.in);
		}
	public static int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
		}

	public static Motorista cadastrarMotorista() {
		Motorista motorista = new Motorista();
		
		System.out.println("---Cadastrar Motorista---");
		System.out.println("Iforme o nome do motorista: ");
		tec.nextLine();
		motorista.setNomeMotorista(tec.nextLine());
		return motorista;
		}
	
	public  List<Motorista> listarMotorista(List<Motorista> motoristas){
	 if(motoristas.size() <= 0) {
				  
		System.out.println("Não possui Motoristas para listar.");
		
		return null;
			}
		System.out.printf(" %5s | %15s | %10s  \n", 
					"Id","Nome", "idade", "Cidade" );
		for(int i = 0; i<motoristas.size(); i++) {
		System.out.printf(" %5s | %15s | %10d \n ", 
		i + 1,
		motoristas.get(i).getNomeMotorista(),
		motoristas.get(i).getIdade(),
		motoristas.get(i).getCategoriaHabilitacao());
		}	
		return motoristas;
		}

	public static List <Motorista> editarMotorista(List<Motorista> motoristas) {
		Motorista motorista = new Motorista();
   	if(motoristas.isEmpty()) {
   	}
   	System.out.println("Informe o Id da produto para editar: ");
	  int idMotorista = tec.nextInt() - 1;
	   	
	System.out.println("1) Nome do Motorista");
   	System.out.println("2) Idade");
   	System.out.println("3) CategoriaHabilitacao");
   	System.out.println("Informe o campo para ser editado:" );
   	int opcao = tec.nextInt();
   		
	switch(opcao) {
		case 1: 
			System.out.println("--- Editar nome do Motorista ---");
			System.out.println("Informe o novo nome da Pessoa: ");
			motorista.setNomeMotorista(null);
			
			motorista.setAnoDeNascimento(motoristas.get(idMotorista).getAnoDeNascimento());
			motorista.setCategoriaHabilitacao(motoristas.get(idMotorista).getCategoriaHabilitacao());
			motoristas.set(idMotorista, motorista);
			break;
			
		case 2:
			System.out.println("--- Editar Ano de Nascimento ---");
			System.out.println("Informe o novo ano de nascimento: ");
			motorista.setAnoDeNascimento(tec.nextInt());
				
			motorista.setNomeMotorista(motoristas.get(idMotorista).getNomeMotorista());
			motorista.setAnoDeNascimento(motoristas.get(idMotorista).getIdade());
			motorista.setCategoriaHabilitacao(motoristas.get(idMotorista).getCategoriaHabilitacao());
			
			break;
				
		case 3:
			System.out.println("--- Editar CategoriaHabilitacao---");
			System.out.println("Informe a nova CategoriaHabilitacao: ");
			motorista.setCategoriaHabilitacao(tec.nextInt());
				
			motorista.setNomeMotorista(motoristas.get(idMotorista).getNomeMotorista());
			motorista.setAnoDeNascimento(motoristas.get(idMotorista).getAnoDeNascimento());	
		    break;
}
	 return motoristas;	
	}
	   public void excluirMotorista(List<Motorista>motoristas) {
		listarMotorista(motoristas);
		int idMotorista = tec.nextInt() - 1;
		  if(motoristas.isEmpty()) {		
		   	return;
		 		}
		 System.out.println("-----Excluir Motorista-----");
		 int idMotorista1 = tec.nextInt() - 1;
		 
		 System.out.println("Informe o Id do Motorista para excluir:");
			 if(motoristas.size() <= idMotorista1) {
				System.out.println("Motorista não cadastrado.");
				return;
			}
			motoristas.remove(idMotorista1);
		        }
		 	public void menu(List<Motorista> motoristas) {
		 	System.out.println("----MENU----");
			System.out.println("1)Cadastrar Motorista");	
			System.out.println("2)Listar Motoristas cadastrados");
			System.out.println("3)Editar Motorista");
			System.out.println("4)Excluir Motorista");
			System.out.println("Informe a opção desejada: ");
			int opcao = tec.nextInt();
			switch (opcao) {

			case 1:
				motoristas.add(cadastrarMotorista());
			break;
			
			case 2:
				listarMotorista(motoristas);
			break;
			
			case 3:
				editarMotorista(motoristas);
			break;
		
			case 4:
				excluirMotorista(motoristas);
			break;
			
			default:
				System.out.println("Opção ivalida");
			break;
		}
				
			System.out.println("Sistema finalizado!!");
			
	}
}
	



