package view;

import controllerPalindromo.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		
		PalindromoController palindromo = new PalindromoController();
		
		boolean palavraValidada = palindromo.comparaPalavras("subinoonibus");
		
		if(palavraValidada) {
			System.out.println("A palavra é um palíndrome.");
		}else {
			System.out.println("A palavra não é um palídrome.");
		}
	}
}
