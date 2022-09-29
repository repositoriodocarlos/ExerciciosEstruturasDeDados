package view;

import javax.swing.JOptionPane;

import controller_.HistoricoController;

public class Main {

	public static void main(String[] args) {
		
		HistoricoController historico = new HistoricoController();
		int escolha = 0;
		
		while(escolha!=4) {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Selecione a opção desejada: \n"
					+ "1 - Inserir endereço;\n"
					+ "2 - Remover último endereço;\n"
					+ "3 - Consultar último endereço;\n"
					+ "4 - Sair"));
			
			switch(escolha) {
				case 1:
					String url = JOptionPane.showInputDialog(null, "Digite a url: ");
					historico.inserirUrl(url);
					break;
				case 2:
					try {
						historico.removerEndereco();						
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}					
					break;
				case 3:
					try {
						historico.consultarUltimoEndereco();						
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}					
					break;
				case 4:
					JOptionPane.showMessageDialog(null, 
							"A aplicação será encerrada.");
					break;
				default:
					JOptionPane.showMessageDialog(null, 
							"Opção inválida!");					
			}
		}
	}

}
