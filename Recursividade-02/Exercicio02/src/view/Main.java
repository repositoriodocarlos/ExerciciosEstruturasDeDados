package view;

import controller.BinaryNumbersHandle;

public class Main {

	public static void main(String[] args) {
		int valueToConvert = 10;		
		BinaryNumbersHandle numberHandle = new BinaryNumbersHandle();
		String convertedValue = numberHandle.binaryConverter(valueToConvert);
		System.out.println(convertedValue);
	}
}
