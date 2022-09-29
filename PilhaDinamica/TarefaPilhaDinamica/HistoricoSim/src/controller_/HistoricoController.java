package controller_;

import javax.swing.JOptionPane;

import controller.PilhaString;

public class HistoricoController {
	
	PilhaString urls = new PilhaString();
	
	public HistoricoController(){
		super();
	}	
	
	public void inserirUrl(String url) {
		
		boolean validar = validarUrl(url);
		if(validar) {
			urls.push(url);
			JOptionPane.showMessageDialog(null, "Url armazenada com sucesso!");			
		}else {
			JOptionPane.showMessageDialog(null, "Url Invalida!");
		}
	}
	
	public void removerEndereco() throws Exception{
		String url = new String(); 
		try {
			 url = urls.pop();
		}catch(Exception e) {
			throw new Exception("Histórico Vazio!");
		}
		
		JOptionPane.showMessageDialog(null, "Url " 
									 + url + " removida!");
	}
	
	public void consultarUltimoEndereco() throws Exception{
		String url = new String(); 
		try {
			 url = urls.topo();
		}catch(Exception e) {
			throw new Exception("Histórico Vazio!");
		}
		JOptionPane.showMessageDialog(null, "Último site visitado: " + url);
	}
	
	public boolean validarUrl(String url) {
		String[] primeiraDivisao = url.split("//");
		int validacao1 = primeiraDivisao[0].compareTo("http:");		
		boolean validacao2 = primeiraDivisao[1].contains("www");
		if(validacao1 == 0 && validacao2 == true) {
			return true;
		}else {
			return false;
		}
	}
}
