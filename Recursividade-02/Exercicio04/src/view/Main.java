package view;

import javax.swing.JOptionPane;

import controller.NumberHandle;

public class Main {

	public static void main(String[] args) {
		
		boolean validator = true;
		int firstNumber = 0;
		int secondNumber = 0;
		
		while(validator) {
			firstNumber = Integer.valueOf(JOptionPane.showInputDialog(null, " Entre com o 1º numero: "));
			secondNumber = Integer.valueOf(JOptionPane.showInputDialog(null, " Entre com o 2º numero: "));
			if(firstNumber >= 10 && 
			   firstNumber <= 999999 &&
			   secondNumber >= 0 &&
			   secondNumber <=9) {
				validator = false;
			}
		}		
		
		int [] firstNum = convertToArray(firstNumber);
		
		NumberHandle handle = new NumberHandle();
		int quantity = handle.numberCounter(firstNum, secondNumber, firstNum.length);
		
		System.out.println(quantity + " vezes");

	}
	
	public static int[] convertToArray(int number) {		
		char[] caracteres = Integer.toString(number).toCharArray();
		int[] unidades = new int[caracteres.length];
		for(int i = caracteres.length-1; i >=0 ;i--) {
			unidades[i] = Character.getNumericValue(caracteres[i]);
		}	
		
		return unidades;
	}
	
	public static void numberValidator() {
		
	}	
	

}
