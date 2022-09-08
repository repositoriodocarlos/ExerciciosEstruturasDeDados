package controller;

import controlller.Ordenacao;

public class OrdenacaoDeVetores {
	
	public OrdenacaoDeVetores() {
		super();
	}
	
	public int[] ordenaVetorBubbleSort(int[] vetor) {
		Ordenacao ord = new Ordenacao();		
		return ord.bubbleSort(vetor);
	}
	
	public int[] ordenaVetorMergeSort(int[] vetor) {
		Ordenacao ord = new Ordenacao();		
		return ord.quickSort(vetor, 0, vetor.length-1);
	}
	
	public int[] ordenaVetorQuickSort(int[] vetor) {
		Ordenacao ord = new Ordenacao();		
		return ord.quickSort(vetor, 0, vetor.length-1);
	}

}
