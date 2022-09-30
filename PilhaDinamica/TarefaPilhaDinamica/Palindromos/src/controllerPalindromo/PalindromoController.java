package controllerPalindromo;

import controller_.PilhaString;

public class PalindromoController {
	
	public PalindromoController() {
		super();
	}
	
	public boolean comparaPalavras(String palavra) {
		String palavraInvertida = "";
		try {
			palavraInvertida = invertePalavra(palavra);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		boolean valid = palavraInvertida.equals(palavra); 
		
		return valid;
	}
	
	private String invertePalavra(String palavra) throws Exception {
		
		PilhaString pilha = new PilhaString();
		
		char[] letras = palavra.toCharArray();
		
		String[] letrasDaPalavra = new String[letras.length];
		
		for(int i = 0; i < letras.length; i ++) {
			letrasDaPalavra[i] = Character.toString(letras[i]);
		}
		
		for(String letra:letrasDaPalavra) {
			pilha.push(letra);
		}
		
		String palavraInvertida = "";
		
		while(pilha.topo != null) {
			try{
				palavraInvertida += pilha.pop();
			}catch(Exception e) {
				throw e;
			}			
		}		
		
		return palavraInvertida;
	}

}
