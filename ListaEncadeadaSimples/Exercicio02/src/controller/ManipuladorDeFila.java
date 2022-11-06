package controller;

import javax.swing.JOptionPane;
import listaIntController.Lista;
import listaIntController.No;

public class ManipuladorDeFila {
	
	Lista lista = new Lista();
	Lista listaOrdenada = new Lista();
	
	public ManipuladorDeFila() {
		super();
	}
	
	public void adicionarNoInicio(int valor) {
		lista.addFirst(valor);
	}
	
	public void adicionarNoMeio(int valor, int posicao) {
		try {
			lista.add(valor, posicao);
		} catch (Exception e) {
			JOptionPane
			.showInternalMessageDialog(null,e.getMessage());		
		}
	}
	
	public void adicionarNoFim(int valor) {
		try {
			lista.addLast(valor);
		} catch (Exception e) {
			JOptionPane
			.showInternalMessageDialog(null,e.getMessage());
		}
	}
	
	public void removeMenor() {
		int tamanho = lista.size();
		No no = new No();
		int menor = 0;
		int posicao = 0;
		for(int i = 0; i < tamanho; i++) {
			try {
				no = lista.getNo(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(i==0) {				
				menor = no.dado;
				posicao = i;
			}else {
				if(no.dado < menor) {
					menor = no.dado;
					posicao = i;
				}
			}
		}
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void ordenaLista() {
		int tamanho = lista.size();
		No valor = new No();
		No sucessor = new No();
		No aux = new No();
		for(int i = 0; i < tamanho -1; i++) {
			for(int j = 0; j < tamanho - 1 - i; j++) {
				try {
					valor = lista.getNo(j);
					sucessor = lista.getNo(j+1);
				} catch (Exception e) {					
					System.out.println(e.getMessage());
				}
				if(valor.dado > sucessor.dado) {
					aux = valor;
					valor = sucessor;
					sucessor = aux;
				}
			}
		}
		tamanho --;
		for(int i = 0; i < tamanho; i++) {
			try {
				No no = lista.getNo(i);
				listaOrdenada.add(no.dado, i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
	
	public void exibirListaOrdenada() {
		int tamanho = listaOrdenada.size();	
		int cont = 0;
		while(cont < tamanho) {
			try {
				No no =  listaOrdenada.getNo(cont);
				JOptionPane
				.showInternalMessageDialog(null, no.dado);
			} catch (Exception e) {				
				System.out.println(e.getMessage());
			}
			cont++;
		}
	}

}
