package controller;

//condição de parada: sendo n um número inteiro, n <=0
//chamada em função do termo anterior:  n + recursiveSumCalculator(n-1)

public class NaturalNumberHandle {
	
	public NaturalNumberHandle() {
		super();
	}
	
	public int recursiveSumCalculator(int n) {
		
		if( n <= 0) {
			return 0;
		}
		else {
			return n + recursiveSumCalculator(n-1); 			
		}		
	}

}
