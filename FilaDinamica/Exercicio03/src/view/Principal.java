package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;

import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
Fila fila = new Fila();
		
		for(int i = 0; i <= 20; i++) {
			String pessoa = "Pessoa" + i;
			int idade = (int)(Math.random() * 100);
			float altura = (float)((Math.random() * 0.65) + 1.35 );
			Pessoa novaPessoa = new Pessoa();
			novaPessoa.Nome = pessoa;
			novaPessoa.Idade = idade;
			novaPessoa.Altura = altura;
			fila.insert(novaPessoa);
		}
		
		ParqueController operacao = new ParqueController();
		operacao.brinquedo(fila);
	}

}
