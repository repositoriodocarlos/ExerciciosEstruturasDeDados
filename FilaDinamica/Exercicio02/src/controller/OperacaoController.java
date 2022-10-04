package controller;

import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {
	
	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila filaDeClientes) {
		Cliente cliente = new Cliente();
		try {
			cliente =  (Cliente) filaDeClientes.remove();
			while(cliente != null) {
				String valor = new DecimalFormat("####.00")
						.format((cliente.QuantidadePecas * cliente.ValorPecas));
				System.out.println("Nome: " + cliente.Nome 
								    + " | Valor Total Da Compra: " 
								    + valor);
				cliente =  (Cliente) filaDeClientes.remove();
			}
		} catch (Exception e) {	}
		
		System.out.println("Aplicação finalizada!");
	}
}