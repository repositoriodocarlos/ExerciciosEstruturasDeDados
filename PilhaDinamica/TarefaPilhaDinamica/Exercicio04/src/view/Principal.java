package view;

import javax.swing.JOptionPane;

import controller.ManipulaVetor;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetorDeInteiros = new int[16];
		
		for(int i = 0; i <16; i++) {
			JOptionPane.showInputDialog(null,"Digite um número: ");
		}
		ManipulaVetor manipulaVetor = new ManipulaVetor();
		
		manipulaVetor.manipularVetor(vetorDeInteiros);
	}
}
