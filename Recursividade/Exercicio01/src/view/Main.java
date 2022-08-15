package view;

import controller.Fatorial;

public class Main {

	public static void main(String[] args) {		
			int number = 4;
			
			Fatorial fatorial = new Fatorial();
			
			int calculaFatorial = fatorial.calculaFatorial(number);
			
			System.out.println(calculaFatorial);
	}

}
