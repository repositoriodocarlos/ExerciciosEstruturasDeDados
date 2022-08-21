package controller;

//condição de parada: quando lenght for maior que zero

/* e o número do vetor, na posição for igual ao segundo número digitado:
  	1 + numberCounter(firstNumber,secondNumber,firtNumberLenght--);
 senão
 	return numberCounter(firstNumber,secondNumber,firtNumberLenght--);*/

public class NumberHandle {
	public NumberHandle() {
		super();
	}
	
	public int numberCounter(int[] firstNumber, int secondNumber, int firtNumberLenght) {			
		
		if(firtNumberLenght<=0) {
			return 0;
		}
		else {			
			if(firstNumber[firtNumberLenght-1] == secondNumber) {				
				return 1 + numberCounter(firstNumber,secondNumber,firtNumberLenght--);
			}else {				
				return numberCounter(firstNumber,secondNumber,firtNumberLenght--);
			}
		}		
	}
}
 