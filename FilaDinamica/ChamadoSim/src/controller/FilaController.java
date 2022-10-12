package controller;
import br.com.leandrocolevati.filaint.*;

public class FilaController {
	
	public FilaController() {
		super();
	}
	
	public void inserirElementoNaFila(int elemento, Fila fila) {
		fila.insert(elemento);
		System.out.println("Elemento inserido na fila!");		
	}
	
	private int removerElementoNaFila(Fila fila) throws Exception {
		if(fila.isEmpty()) {
			throw new Exception("Não há niguém na fila!");
		}else {
			return fila.remove();			
		}
	}
	
	public int chamar(Fila fila, String tipo, int contador) {
		if(tipo == "P" && contador <= 3) {
			try {				
				System.out.println("Chamando senha: " + tipo 
									+ Integer.toString(removerElementoNaFila(fila)));
				if(contador == 3) {
					return 0;
				}
				return ++ contador;
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				contador = 3;
			}
			return contador;
		}else {
			try {
				System.out.println("Chamando senha: " + tipo 
						  + Integer.toString(removerElementoNaFila(fila)));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return 0;
		}		
	}
}
