package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		
		int numeroDecimal = Integer
				.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		while(numeroDecimal > 1000) {
			numeroDecimal = Integer
					.parseInt(JOptionPane
							.showInputDialog("O número não pode ser maior que 1000."
									+ "Digite um número:"));
		}
		
		ConverteController conversor = new ConverteController();
		
		String numeroBinario = conversor.decToBin(numeroDecimal);
		
		System.out.println("O número " + numeroDecimal
				+ " em binário é: " + numeroBinario);
	}
}
