package view;

import javax.swing.JOptionPane;

import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		
		NPRController calculadora = new NPRController();
		
		String valor = new String();
		
		while(valor.equalsIgnoreCase("sair") != true) {
				valor = JOptionPane.showInputDialog(null, 
					"Digite um valor inteiro ou uma operação (+-*/) \n"
					+ "para aplicar a operação aos dois últimos valores digitados");
			if(valor.equals("+") ||valor.equals("-")
			   ||valor.equals("*") ||valor.equals("/")) {
				JOptionPane.showMessageDialog(null, "O resultado da operação " + valor 
					     + " é: " + calculadora.npr(valor));
			}else {
				try {
					calculadora.insereValor(Integer.parseInt(valor));
					JOptionPane.showMessageDialog(null, valor.toString() 
							+ " inserido na pilha!");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Aplicação finalizada!");
	}
}
