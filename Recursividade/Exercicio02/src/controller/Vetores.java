//condição de parada: tamanho do vetor igual a zero
//função para o termo n em funçao do termo anterior: somarValoresNegativo(soma, tamanho, vetor), onde tamanho recebeu tamanho-1

package controller;

public class Vetores {
	public Vetores() {
		super();
	}
	
	public int somarValoresNegativos(int soma, int tamanho, int[]vetor) {
		if(tamanho == 1) {
			return soma;
		}else {
			if(vetor[tamanho-1]<0){
				soma += vetor[tamanho-1];
				tamanho--;
				return somarValoresNegativos(soma,tamanho,vetor);
			}else {
				tamanho--;
				return somarValoresNegativos(soma, tamanho, vetor);
			}		
		}
	}
}
