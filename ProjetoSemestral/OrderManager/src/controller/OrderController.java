package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.No;
import model.Order;
import service.QueueService;

public class OrderController implements ActionListener{

	private QueueService orders;
	private JTextField tfOrderId;
	private JTextField tfName;
	private JTextField tfValue;
	private JTextField tfDescription;
	private JTextField tfManageOrderId;
	private JTextField tfManageName;
	private JTextField tfManageValue;
	private JTextField tfManageDescription;	
	private JTextArea taOrders;

	public OrderController(JTextField tfOrderId, 
						   JTextField tfName, JTextField tfValue,
						   JTextField tfDescription, JTextField tfManageOrderId,
						   JTextField tfManageName, JTextField tfManageValue,
						   JTextField tfManageDescription, JTextArea taOrders) {
		this.orders = new QueueService();
		this.tfOrderId = tfOrderId;
		this.tfName = tfName;
		this.tfValue = tfValue;
		this.tfDescription = tfDescription;
		this.tfManageOrderId = tfManageOrderId;
		this.tfManageName = tfManageName;
		this.tfManageValue = tfManageValue;
		this.tfManageDescription = tfManageDescription;
		this.taOrders = taOrders;
	}	

	public void addOrder(boolean removedOrder) throws IOException {
		Order order = new Order();
		order.Customer = tfName.getText();
		order.OrderId = tfOrderId.getText();
		order.OrderPrice =  tfValue.getText();
		order.Description = tfDescription.getText();			
		storeOrder(order.generateOrderStringToStore(), removedOrder);		
		JOptionPane.showMessageDialog(null, "Pedido adicionado a fila!");
		tfName.setText("");
		tfOrderId.setText("");
		tfValue.setText("");
		tfDescription.setText("");
	}

	private void storeOrder(String order, boolean removedOrder) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "GerenciadorDePedidos";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "pedidos.csv");
		if(arq.exists()) {
			if(removedOrder) {
				arq.delete();
				arq = new File(path, "pedidos.csv");
			}
		}
		
		boolean existsValid = false;
		if(arq.exists()) {
			existsValid = true;
		}
		FileWriter fw = new FileWriter(arq, existsValid);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(order+"\r\n");
		pw.flush();
		pw.close();
		fw.close();
	}

	public Order consultOrder() {
		Order order = new Order();
		try {
			order = queryOrder(tfManageOrderId.getText());
			if(order != null) {
				tfManageName.setText(order.Customer);
				tfManageValue.setText(order.OrderPrice);
				tfManageDescription.setText(order.Description);				
			}else {
				JOptionPane.showMessageDialog(null, "Id inválido!");				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		return order;
	}
	
	public Order queryOrder(String orderId) throws IOException {
		Order order = new Order();
		String path = System.getProperty("user.home") + File.separator + "GerenciadorDePedidos";
		File arq = new File(path, "pedidos.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String line = buffer.readLine();
			while(line != null) {
				String[] vetLine = line.split(";");
				if (vetLine[0].equals(orderId)) {
					order.OrderId = vetLine[0];
					order.Customer = vetLine[1];
					order.OrderPrice = vetLine[2];
					order.Description = vetLine[3];
					break;
				}
				line = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();			
		}
		if(order.OrderId == null) {
			order = null;
		}
		return order;
	}
	
	public void queryOrders() throws IOException {		
		String path = System.getProperty("user.home") + File.separator + "GerenciadorDePedidos";
		File arq = new File(path, "pedidos.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String line = buffer.readLine();
			while(line != null) {
				String[] vetLine = line.split(";");
				Order order = new Order();
				order.OrderId = vetLine[0];    
				order.Customer = vetLine[1];   
				order.OrderPrice = vetLine[2];
				order.Description = vetLine[3];
				orders.insert(order);
				line = buffer.readLine();					
			}
			buffer.close();
			isr.close();
			fis.close();				
		}			
	}
	

	public void modifyOrder() {
		try {
			queryOrders();
			Order order = new Order();
			order = orders.getOrder(tfManageOrderId.getText());
			order.Customer = tfManageName.getName();
			order.OrderPrice = tfManageValue.getText();
			order.Description = tfManageDescription.getText();
			JOptionPane.showMessageDialog(null, "Pedido modificado!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void sendOrder() {
		try {
			queryOrders();
			String orderId = orders.remove();
			JOptionPane.showMessageDialog(null, 
										 "Pedido " + orderId + " Enviado!");
			No aux = new No();
			int cont = 0;
			aux = orders.start;
			while(aux != null) {
				if(cont == 0) {
					storeOrder(aux.Order.generateOrderStringToStore(),true);					
				}else {
					storeOrder(aux.Order.generateOrderStringToStore(),false);					
				}				
				aux = aux.Next;
				cont++;
			}
			tfManageName.setText("");
			tfManageValue.setText("");
			tfManageDescription.setText("");
			tfManageOrderId.setText("");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void toListOrders() {
		try {
			String ordersToString = orders.showOrders();
			taOrders.setText(ordersToString);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Realizar Pedido")) {
			try {
				addOrder(false);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Erro ao armazenar pedido!");

			}
		}
		if(cmd.equals("Enviar Pedido")) {
			sendOrder();
		}
		if(cmd.equals("Consultar Pedido")) {
			consultOrder();			
		}
		if(cmd.equals("Listar pedidos")) {
			toListOrders();
		}		
	}	
}
