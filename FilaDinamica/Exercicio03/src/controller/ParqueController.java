package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {
	
	public ParqueController() {
		super();
	}
	
	public void brinquedo(Fila fila) {
		
		Pessoa pessoa = new Pessoa();
		
		int contador = 0;
		
		try {
			pessoa = (Pessoa) fila.remove();
			contador ++;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(contador <= 20) {
			
			int t = fila.size();
			
			if(pessoa.Altura < 1.60 || pessoa.Idade < 16) {
				System.out.println("Pessoa " 
									+ pessoa.Nome
									+ " não entrou no binquendo");
			}else {
				System.out.println("Pessoa " 
						+ pessoa.Nome
						+ " passou para dentro do brinquedo.");				
			}			

			try {
				pessoa = (Pessoa) fila.remove();
				contador ++;
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
