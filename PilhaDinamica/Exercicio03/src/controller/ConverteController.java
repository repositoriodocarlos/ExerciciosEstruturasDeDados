package controller;

import controllerLib.PilhaInt;

public class ConverteController {
	
	public ConverteController() {
		super();
	}
	
	PilhaInt pilha = new PilhaInt();
	
	public String decToBin(int decimal) {
		while(decimal >= 1) {
			int resto = decimal % 2;
			decimal = (int) decimal /2;
			pilha.push(resto);
		}
		
		String binario = new String();
		while(pilha.topo.proximo != null) {
			if(binario.isBlank()) {
				binario = String.valueOf(pilha.topo.dado);
			}else {
				binario += String.valueOf(pilha.topo.dado);
			}
			try {
				pilha.pop();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		return binario;
	}
}
