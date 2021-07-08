import java.util.ArrayList;
import java.util.List;

import br.com.senaiMarcas.MarcaController;
import br.com.senaiMotorista.Motorista;
import br.com.senaiMotorista.MotoristaController;
import br.com.senaiVeiculo.Veiculo;
import br.com.senaiVeiculo.VeiculoController;

public class ProgramaController {

	public static void main(String[] args) {
		List<Motorista> motoristas = new ArrayList<>();
		List<Veiculo> veiculos = new ArrayList<>();
		
		MotoristaController motoristaController = new MotoristaController();
		VeiculoController veiculoController = new VeiculoController();
		
		boolean sair = false;
	
		do {		
			System.out.println("-----MENU PRINCIPAL-----");
			System.out.println("1)--Cadastrar Motorista--");
			System.out.println("2)--veiculo--");
			System.out.println("3)--Sair do Sistema--");
					
			int opcao = MotoristaController.leopcao();
			switch(opcao) {
			case 1:
				motoristaController.menu(motoristas);
			break;	
			case 2:
				veiculoController.menu(veiculos);
					
			default:
				System.out.println("Opção invalida! ");
			break;
			}
			}while(!sair);
		System.out.println("Sistema finalizado!");
	
	}	
}


