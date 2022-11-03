package view;

import javax.swing.JOptionPane;
import controller.ManipuladorDeCadastro;
import model.Cadastro;

public class Principal {
	
	public static void main(String[] args) {
		
		ManipuladorDeCadastro cadastros = new ManipuladorDeCadastro();
		
		int escolha = 0;
		
		while(escolha != 2) {
			
			escolha = Integer.parseInt(JOptionPane
					.showInputDialog("Deseja inserir novo cadastro?\n"
									 + "1 - sim \n"
									 + "2 - não"));
			switch(escolha) {
				case 1:
					Cadastro cadastro = new Cadastro();
					cadastro.Nome = JOptionPane
							.showInputDialog("Digite o nome: ");
					cadastro.Email = JOptionPane
							.showInputDialog("Digite o email: ");
					cadastro.Telefone = JOptionPane
							.showInputDialog("Digite o telefone: ");
					
					cadastros.adicionaCadastro(cadastro);				
					break;
					
				case 2:
					cadastros.exibirCadastros();
					break;
					
				default:
					JOptionPane
					.showInternalMessageDialog(null, "Opção inválida!");
			}	
			
		}
	}

}
