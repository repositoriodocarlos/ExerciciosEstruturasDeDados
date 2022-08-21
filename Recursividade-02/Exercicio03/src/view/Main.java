package view;

import controller.SeriesHandle;

public class Main {

	public static void main(String[] args) {
		int number = 3;
		SeriesHandle handle = new SeriesHandle();		 
		System.out.println("O resultado da soma é: " + handle.seriesCalculator(number));
	}
}
