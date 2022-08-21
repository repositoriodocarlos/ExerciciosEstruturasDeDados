package controller;

public class BinaryNumbersHandle {
	public BinaryNumbersHandle() {
		super();
	}
	
	public String binaryConverter(int dividend ) {		
		if(dividend > 2000) {
			return "O número não pode ser maior que 2000!";
		}
		
		if(dividend<2) {
			return Integer.toString(dividend % 2);
		}
		else {
			String rest = Integer.toString(dividend % 2);
			dividend = (int) dividend / 2;
			return  binaryConverter(dividend) + rest;			
		}	
	}
}
