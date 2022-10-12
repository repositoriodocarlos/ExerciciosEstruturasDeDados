package view;
import javax.swing.JOptionPane;

import br.com.leandrocolevati.filaint.*;
import controller.FilaController;

public class Principal {

	public static void main(String[] args) {
		Fila prioritaria = new Fila();
		Fila comum = new Fila();
		FilaController filaController = new FilaController();
		int sequencialFila = 1;
		int contadorPrioritario = 0;
		
		int opcao = Integer.parseInt(
				JOptionPane.showInputDialog("Escolha a opcão desejada: \n" 
										    + "1 - Inserir senha na fila comum \n" 
										    + "2 - Inserir senha na fila prioritaria \n"
										    + "3 - Chamar o próximo  \n"
										    + "4 - Encerrar "));
		
		while(opcao != 4) {
			switch(opcao) {
				case 1:
					filaController.inserirElementoNaFila(sequencialFila, comum);
					sequencialFila++;
					break;
				case 2:
					filaController.inserirElementoNaFila(sequencialFila, prioritaria);
					sequencialFila++;					
					break;
				case 3:					
					if(prioritaria.size() > 0) {						
						contadorPrioritario = filaController.chamar(prioritaria, "P", contadorPrioritario);
						break;
					}
					
					filaController.chamar(comum, "N", 0);	
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha a opcão desejada: \n" 
											    + "1 - Inserir senha na fila comum \n" 
											    + "2 - Inserir senha na fila prioritaria \n"
											    + "3 - Chamar o próximo  \n"
											    + "4 - Encerrar "));
		}
		
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}
}
