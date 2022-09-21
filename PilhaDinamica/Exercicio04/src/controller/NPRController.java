package controller;

import controllerLib.PilhaInt;

public class NPRController {
	
	PilhaInt pilhaInt = new PilhaInt();
	
	public void insereValor(int valor) {
		pilhaInt.push(valor);
	}
	
	public int npr(String op) {
		switch(op) {
		case "+":
			try {
				int primeiroValor = pilhaInt.pop();
				int segundoValor = pilhaInt.pop();
				int resultado = primeiroValor + segundoValor;
				pilhaInt.push(resultado);
				return resultado;
			} catch (Exception e) {
				e.getMessage();
			}
			break;
		case "-":
			try {
				int primeiroValor = pilhaInt.pop();
				int segundoValor = pilhaInt.pop();
				int resultado = segundoValor - primeiroValor;
				pilhaInt.push(resultado);
				return resultado;
			} catch (Exception e) {
				e.getMessage();
			}
			break;
		case "*":
			try {
				int primeiroValor = pilhaInt.pop();
				int segundoValor = pilhaInt.pop();
				int resultado = primeiroValor * segundoValor;
				pilhaInt.push(resultado);
				return resultado;
			} catch (Exception e) {
				e.getMessage();
			}
			break;
		case "/":
			try {
				int primeiroValor = pilhaInt.pop();
				int segundoValor = pilhaInt.pop();
				int resultado = segundoValor / primeiroValor;
				pilhaInt.push(resultado);
				return resultado;
			} catch (Exception e) {
				e.getMessage();
			}
			break;
		default:
			System.out.println("Operação inválida!");
			return 0;
		}
		return 0;
	}
}
