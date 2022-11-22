package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Tela extends JFrame {

	private static final long serialVersionUID = -8533024649811972087L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfOrderId;
	private JTextField tfValue;
	private JTextField tfDescription;
	private JTextField tfManageOrderId;
	private JTextField tfManageName;
	private JTextField tfManageValue;
	private JTextField tfManageDescription;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Tela() {
		setTitle("Pedidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 606, 421);
		contentPane.add(tabbedPane);
		
		JPanel pOrder = new JPanel();
		tabbedPane.addTab("Pedido", null, pOrder, null);
		pOrder.setLayout(null);
		
		JLabel lblToOrder = new JLabel("Realizar Pedido");
		lblToOrder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblToOrder.setBounds(239, 11, 138, 14);
		pOrder.add(lblToOrder);
		
		JLabel lblName = new JLabel("Nome do Cliente");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(81, 74, 109, 23);
		pOrder.add(lblName);
		
		JLabel lblOrderId = new JLabel("Id Pedido");
		lblOrderId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderId.setBounds(81, 139, 109, 23);
		pOrder.add(lblOrderId);
		
		JLabel lblOrderValue = new JLabel("Valor");
		lblOrderValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderValue.setBounds(81, 202,  109, 23);
		pOrder.add(lblOrderValue);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription.setBounds(81, 273, 109, 23);
		pOrder.add(lblDescription);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfName.setBounds(242, 77, 310, 20);
		pOrder.add(tfName);
		tfName.setColumns(10);
		
		tfOrderId = new JTextField();
		tfOrderId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfOrderId.setBounds(239, 142, 96, 20);
		pOrder.add(tfOrderId);
		tfOrderId.setColumns(10);
		
		tfValue = new JTextField();
		tfValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfValue.setBounds(239, 205, 157, 20);
		pOrder.add(tfValue);
		tfValue.setColumns(10);
		
		tfDescription = new JTextField();
		tfDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfDescription.setBounds(243, 268, 258, 37);
		pOrder.add(tfDescription);
		tfDescription.setColumns(10);
		
		JButton btnToOrder = new JButton("Realizar Pedido");
		btnToOrder.setBounds(213, 347, 190, 23);
		pOrder.add(btnToOrder);
		
		JPanel pManageOrder = new JPanel();
		tabbedPane.addTab("Administrar Pedidos", null, pManageOrder, null);
		pManageOrder.setLayout(null);
		
		JLabel lbManageOrder = new JLabel("Administrar Pedidos");
		lbManageOrder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbManageOrder.setBounds(196, 11, 167, 31);
		pManageOrder.add(lbManageOrder);
		
		JLabel lblOrderID = new JLabel("Id Pedido");
		lblOrderID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderID.setBounds(175, 97, 67, 14);
		pManageOrder.add(lblOrderID);
		
		tfManageOrderId = new JTextField();
		tfManageOrderId.setBounds(266, 96, 96, 20);
		pManageOrder.add(tfManageOrderId);
		tfManageOrderId.setColumns(10);
		
		JButton btnSendOrder = new JButton("Enviar próximo pedido");
		btnSendOrder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSendOrder.setBounds(100, 332, 173, 23);
		pManageOrder.add(btnSendOrder);
		
		JButton btnQueryOrders = new JButton("Consultar Pedido");
		btnQueryOrders.setBounds(336, 334, 142, 23);
		pManageOrder.add(btnQueryOrders);
		
		JLabel lblName_1 = new JLabel("Nome do Cliente");
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_1.setBounds(87, 139, 109, 23);
		pManageOrder.add(lblName_1);
		
		tfManageName = new JTextField();
		tfManageName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageName.setColumns(10);
		tfManageName.setBounds(248, 142, 310, 20);
		pManageOrder.add(tfManageName);
		
		JLabel lblOrderValue_1 = new JLabel("Valor");
		lblOrderValue_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderValue_1.setBounds(87, 196, 109, 23);
		pManageOrder.add(lblOrderValue_1);
		
		tfManageValue = new JTextField();
		tfManageValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageValue.setColumns(10);
		tfManageValue.setBounds(248, 198, 157, 20);
		pManageOrder.add(tfManageValue);
		
		JLabel lblDescription_1 = new JLabel("Descrição");
		lblDescription_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription_1.setBounds(87, 255, 109, 23);
		pManageOrder.add(lblDescription_1);
		
		tfManageDescription = new JTextField();
		tfManageDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageDescription.setColumns(10);
		tfManageDescription.setBounds(248, 249, 258, 37);
		pManageOrder.add(tfManageDescription);
		
		JPanel pListOrders = new JPanel();
		tabbedPane.addTab("Listar de Pedidos", null, pListOrders, null);
		pListOrders.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de pedidos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(214, 21, 136, 24);
		pListOrders.add(lblNewLabel);
		
		JButton btnListOrders = new JButton("Listar pedidos");
		btnListOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListOrders.setBounds(231, 347, 127, 23);
		pListOrders.add(btnListOrders);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 569, 256);
		pListOrders.add(scrollPane);
		
		JTextArea taOrders = new JTextArea();
		scrollPane.setViewportView(taOrders);
		
		OrderController orderController = 
				new OrderController(tfOrderId, tfName, tfValue,
				   tfDescription, tfManageOrderId,
				   tfManageName, tfManageValue,
				   tfManageDescription, taOrders);
		
		btnToOrder.addActionListener(orderController);
		btnListOrders.addActionListener(orderController);
		btnSendOrder.addActionListener(orderController);
		btnQueryOrders.addActionListener(orderController);
	}
}
