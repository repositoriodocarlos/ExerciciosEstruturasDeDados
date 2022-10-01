package controller;

import br.com.leandrocolevati.pilhaint.Pilha;

public class ManipulaVetor {
	
	Pilha pilha = new Pilha();
	
	public ManipulaVetor() {
		super();
	}
	
	public void manipularVetor(int[] vetor) {
		for(int elemento: vetor) {
			if(elemento >= 0) {
				pilha.push(elemento);
			}else if(elemento < 0) {
				try {
					int primeiroValor = pilha.pop();
					int segundoValor = pilha.pop();
					pilha.push(elemento);
					pilha.push(primeiroValor + segundoValor);
				} catch (Exception e) {

					System.out.println(e.getMessage());;
				}

			}
		}
		
		System.out.println("A quantidade de valores na pilha é: " + pilha.size());
	}
}
