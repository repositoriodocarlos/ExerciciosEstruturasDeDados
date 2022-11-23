package service;

import model.No;
import model.Order;

public class QueueService {
	
	public No start;
	public No end;
	
	public QueueService() {
		super();
	}
	
	public boolean emptyQueue() {
		if(start == null && end == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert(Order newOrder) {
		No order = new No();
		order.Order = newOrder;
		
		if(start == null) {
			start = order;
			end = order;
			order.Next = null;
		}else {
			if(start==end && start!=null) {
				end = order;
				start.Next = end;
				end.Next = null;
			}else{
				end.Next = order;
				order.Next = null;
				end = order;
			}
		}
	}
	
	public String remove() throws Exception{
		if(emptyQueue()== true) {
			throw new Exception("Não há pedidos na fila!");
		}
		
		No aux = start;
		
		if(start == end && start != null) {
			start = null;
			end = null;
		}else {
			start = start.Next;
		}
		return aux.Order.OrderId;
	}
	
	public String showOrders() throws Exception {
		if(emptyQueue() == true){
			throw  new Exception("Não há elementos na fila");			
		}
		
		No aux = start;
		String orderToString = "";
		
		while(aux != null) {
			
			String order = "Código do pedido: " + aux.Order.OrderId
								   + " | Nome do cliente: " + aux.Order.Customer
								   + " | Valor: " + aux.Order.OrderPrice
								   + " | Descrição " + aux.Order.Description + "\n";
			orderToString += order;
			aux = aux.Next;
		}
		
		return orderToString;
	}
	
	public Order getOrder(String orderId) throws Exception{
		if(emptyQueue()) {
			throw new Exception("Não há pedidos na fila!");
		}		
				
		No aux = start;
		Order orderToReturn = new Order();
		while(aux != null) {
			if(aux.Order.OrderId.equalsIgnoreCase(orderId)) {
				orderToReturn = aux.Order;
			}
			aux = aux.Next;
		}
		
		if(orderToReturn == null) {
			throw new Exception("Pedido não localizado!");
		}else {
			return orderToReturn;			
		}	
	}
	
	public int size(){

		int cont = 0;
		
		if(!emptyQueue()) {
			No aux = start;
			while(aux != null) {
				cont++;
				aux = aux.Next;
			}
		}
		
		return cont;	
	}
}
