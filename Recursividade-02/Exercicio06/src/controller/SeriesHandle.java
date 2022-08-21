package controller;

public class SeriesHandle {
	
	public SeriesHandle() {
		super();
	}
	
	public double serieCalculator(int number) {
		if(number == 1) {
			return 1;
		}
		else {
			return 1/((double)calculaFatorial(number)) + serieCalculator(number-1);
		}
	}
	
	private int calculaFatorial(int numero) {
		if(numero <= 1) {
			return 1;			
		}else {
			return numero * calculaFatorial(numero-1);
		}		
	}

}
