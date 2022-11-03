package controller;

import javax.swing.JOptionPane;

import listaObjectController.Lista;
import model.Cadastro;

public class ManipuladorDeCadastro {
	
	Lista lista = new Lista();
	
	public ManipuladorDeCadastro() {
		super();
	}
	
	public void adicionaCadastro(Cadastro cadastro) {
		if(lista.listaVazia()) {
			lista.addFirst(cadastro);
		}else {
			try {
				lista.addLast(cadastro);
			} catch (Exception e) {				
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void exibirCadastros() {
		int tamanho = lista.size();	
		int cont = 0;
		while(cont < tamanho) {
			try {
				Cadastro cadastro = (Cadastro) lista.get(cont);
				JOptionPane
				.showInternalMessageDialog(null,
						cadastro.Nome
						+ " - " + cadastro.Email
						+ " - " + cadastro.Telefone);
			} catch (Exception e) {				
				System.out.println(e.getMessage());
			}
			cont++;
		}
		
	}

}
