package view;

import controller.OrdenacaoDeVetores;

public class Main {

	public static void main(String[] args) {
			int [] vetor = {69,68,32,36,91,19,28,44,88,73,37,99,1};
			
			OrdenacaoDeVetores ordenacao = new OrdenacaoDeVetores(); 
			
			int [] vetorBubbleSort = ordenacao.ordenaVetorBubbleSort(vetor);		
			int [] vetorMergeSort = ordenacao.ordenaVetorMergeSort(vetor);
			int [] vetorQuickSort = ordenacao.ordenaVetorQuickSort(vetor);
			
			exibirVetor(vetorBubbleSort);
			exibirVetor(vetorMergeSort);
			exibirVetor(vetorQuickSort);

	}
	
	private static void exibirVetor(int[] vetor) {
		System.out.print("[");		
		for(int numero:vetor) {			
			System.out.print(numero + " ");			
		}
		System.out.print("]");	
		System.out.println();
	}

}
