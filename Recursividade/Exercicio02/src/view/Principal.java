package view;
import controller.Vetores;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {2 , -6, 7, -32, -60};
		
		Vetores vet = new Vetores();
		
		int resultado = vet.somarValoresNegativos(0, vetor.length, vetor);
		
		System.out.println(resultado);
	}
}
