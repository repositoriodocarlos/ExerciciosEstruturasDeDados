package view;

import javax.swing.JOptionPane;

import controller.ManipuladorDeFila;

public class Principal {

	public static void main(String[] args) {
		
		ManipuladorDeFila manipulador = new ManipuladorDeFila();
		int escolha = 0;
		
		while(escolha != 2) {

			escolha = Integer.parseInt(JOptionPane
					.showInputDialog("Deseja inserir novo número?\n"
									 + "1 - sim \n"
									 + "2 - não"));
			switch(escolha) {
				case 1:				
					int escolha2 =
							Integer.parseInt(JOptionPane
									.showInputDialog("1 - inserir no início\n"
													 + "2 - inserir no meio \n"
													 + "3 - inserir no final"));
					switch(escolha2) {
						case 1:
							int valor = Integer.parseInt(JOptionPane
									.showInputDialog("Qual o valor?"));
							manipulador.adicionarNoInicio(valor);
							break;
						case 2:
							valor = Integer.parseInt(JOptionPane
									.showInputDialog("Qual o valor?"));
							int pos = Integer.parseInt(JOptionPane
									.showInputDialog("Qual a posicao?"));							
							manipulador.adicionarNoMeio(valor, pos);
							break;
						case 3:
							valor = Integer.parseInt(JOptionPane
									.showInputDialog("Qual o valor?"));							
							manipulador.adicionarNoFim(valor);
							break;
					}
					break;
				case 2:
					manipulador.removeMenor();
					manipulador.ordenaLista();
					manipulador.exibirListaOrdenada();
					break;
			}			
		}
	}
}
