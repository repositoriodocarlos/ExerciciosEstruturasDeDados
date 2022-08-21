package controller;

public class SeriesHandle {
	
	public SeriesHandle() {
		super();
	}
	
	public double seriesCalculator(int number) {
		if(number == 0) {
			return 0;
		}
		if(number == 1) {
			return 1;
		}
		else {			
			return  (1 / (double) number + seriesCalculator(number - 1));
		}
	}
}
