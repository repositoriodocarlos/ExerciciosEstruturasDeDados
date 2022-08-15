package controller;

public class Fatorial {
	public Fatorial() {
		super();
	}
	
	public int calculaFatorial(int numero) {
		if(numero <= 1) {
			return 1;			
		}else {
			return numero * calculaFatorial(numero-1);
		}		
	}
}
