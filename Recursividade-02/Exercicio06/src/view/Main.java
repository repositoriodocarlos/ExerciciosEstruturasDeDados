package view;

import controller.SeriesHandle;

public class Main {

	public static void main(String[] args) {
		int number = 3;
		
		SeriesHandle handle = new SeriesHandle();
		double result = handle.serieCalculator(number);
		
		System.out.println(result);

	}

}
