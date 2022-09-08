package controlller;

public class Ordenacao {
	
	public Ordenacao() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {		
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio);  //esquerda
			mergeSort(vetor, meio + 1, fim); //direita
			intercalar(vetor, inicio, meio, fim); 
		}
		
		return vetor;		
	}
	
	private void intercalar(int[] vetor, int inicio, int meio, int fim) {
		int auxiliar[] = new int[vetor.length];
		for(int i = inicio; i <= fim; i++) {
			auxiliar[i] = vetor[i];
		}
		
		int esquerda = inicio;
		int direita = meio + 1;
		
		for(int cont=inicio; cont <= fim; cont++) {
			if(esquerda > meio) {
				vetor[cont] = auxiliar[direita];
				direita++;
			}else if(direita > fim) {
				vetor[cont] = auxiliar[esquerda];
				esquerda++;
			}else if(auxiliar[esquerda] < auxiliar[direita]) {
				vetor[cont] = auxiliar[esquerda];
				esquerda ++;
			}else {
				vetor[cont] = auxiliar[direita];
				direita ++;
			}
		}
	}

	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho; i++) {			
			for(int j = 0; j < tamanho -1; j++) {
				if(vetor[j] > vetor[j+1]) {
					int auxiliar = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = auxiliar;		
				}
			}
		}
		
		return vetor;
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo-1);
			quickSort(vetor,pivoFixo +1, fim);
		}
		return vetor;
	}
	
	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[inicio];
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo ) {
				ponteiroDireita--;
			}
			if(ponteiroEsquerda < ponteiroDireita) {
				trocarValores(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		
		trocarValores(vetor, inicio, ponteiroDireita);
		 return ponteiroDireita;
	}

	private void trocarValores(int[] vetor, int numero, int segundoNumero) {
		int aux = vetor[segundoNumero];
		vetor[segundoNumero] = vetor[numero];
		vetor[numero] = aux;
	}
}
