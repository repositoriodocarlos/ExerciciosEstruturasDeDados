package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		for(int i = 0; i < 20; i++) {
			String cliente = "Cliente" + i;
			int quantidadePecas = (int)((Math.random() * 31) + 20);
			float valorPecas = (float)((Math.random() * 96) + 5);
			Cliente novoCliente = new Cliente();
			novoCliente.Nome = cliente;
			novoCliente.QuantidadePecas = quantidadePecas;
			novoCliente.ValorPecas = valorPecas;
			fila.insert(novoCliente);
		}
		
		OperacaoController operacao = new OperacaoController();
		operacao.caixa(fila);
	}

}
