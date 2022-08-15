package controller;
//condição de parada: quando wordSize == 0
//chamada em função do termo anterior: letter +  wordConverter(word, wordSize-1)

public class StringHandleService {
	
	public StringHandleService() {
		super();
	}
	
	public String wordInverter(String word, int wordSize) {
		if(wordSize == 0) {
			return "";
		}else {			
			String letter = word.substring(wordSize-1, wordSize);
			return letter + wordInverter(word, wordSize-1);
		}
	}

}
