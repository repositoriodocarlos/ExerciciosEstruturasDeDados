package view;

import controller.StringHandleService;

public class Main {

	public static void main(String[] args) {
		
		String word = "teste";
		int wordSize = word.length();
		StringHandleService stringHandle = new StringHandleService();
		String wordInverted =  stringHandle.wordInverter(word, wordSize);
		System.out.println(("A palavra teste invertidada é " + wordInverted + "."));
	}
}
