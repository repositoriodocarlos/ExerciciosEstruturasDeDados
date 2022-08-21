package view;

import controller.NaturalNumberHandle;

public class main {

	public static void main(String[] args) {
		int n = 5;		
		NaturalNumberHandle numberHandle = new NaturalNumberHandle();
		int sum = numberHandle.recursiveSumCalculator(n);		
		System.out.println("A soma é : " + sum);
	}
}

