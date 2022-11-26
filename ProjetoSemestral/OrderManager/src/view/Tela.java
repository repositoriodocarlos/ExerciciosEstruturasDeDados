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
		lblName.setBounds(78, 82, 109, 23);
		pOrder.add(lblName);
		
		JLabel lblOrderValue = new JLabel("Valor");
		lblOrderValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderValue.setBounds(78, 155,  109, 23);
		pOrder.add(lblOrderValue);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription.setBounds(78, 226, 109, 23);
		pOrder.add(lblDescription);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfName.setBounds(239, 85, 310, 20);
		pOrder.add(tfName);
		tfName.setColumns(10);
		
		tfValue = new JTextField();
		tfValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfValue.setBounds(236, 158, 157, 20);
		pOrder.add(tfValue);
		tfValue.setColumns(10);
		
		tfDescription = new JTextField();
		tfDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfDescription.setBounds(240, 221, 258, 37);
		pOrder.add(tfDescription);
		tfDescription.setColumns(10);
		
		JButton btnToOrder = new JButton("Realizar Pedido");
		btnToOrder.setBounds(213, 347, 190, 23);
		pOrder.add(btnToOrder);
		
		JPanel pManageOrder = new JPanel();
		pManageOrder.setToolTipText("Teste");
		tabbedPane.addTab("Administrar Pedidos", null, pManageOrder, null);
		pManageOrder.setLayout(null);
		
		JLabel lbManageOrder = new JLabel("Administrar Pedidos");
		lbManageOrder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbManageOrder.setBounds(196, 11, 167, 31);
		pManageOrder.add(lbManageOrder);
		
		JLabel lblOrderID = new JLabel("Id Pedido");
		lblOrderID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderID.setBounds(183, 54, 67, 14);
		pManageOrder.add(lblOrderID);
		
		tfManageOrderId = new JTextField();
		tfManageOrderId.setBounds(274, 53, 96, 20);
		pManageOrder.add(tfManageOrderId);
		tfManageOrderId.setColumns(10);
		
		JButton btnSendOrder = new JButton("Enviar proximo pedido");
		btnSendOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSendOrder.setBounds(24, 319, 187, 46);
		pManageOrder.add(btnSendOrder);
		
		JButton btnQueryOrders = new JButton("Consultar Pedido");
		btnQueryOrders.setToolTipText("Digite o  número do pedido que quer alterar, antes de clicar aqui");
		btnQueryOrders.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQueryOrders.setBounds(436, 319, 137, 46);
		pManageOrder.add(btnQueryOrders);
		
		JLabel lblName_1 = new JLabel("Nome do Cliente");
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName_1.setBounds(95, 96, 109, 23);
		pManageOrder.add(lblName_1);
		
		tfManageName = new JTextField();
		tfManageName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageName.setColumns(10);
		tfManageName.setBounds(256, 99, 310, 20);
		pManageOrder.add(tfManageName);
		
		JLabel lblOrderValue_1 = new JLabel("Valor");
		lblOrderValue_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrderValue_1.setBounds(95, 153, 109, 23);
		pManageOrder.add(lblOrderValue_1);
		
		tfManageValue = new JTextField();
		tfManageValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageValue.setColumns(10);
		tfManageValue.setBounds(256, 155, 157, 20);
		pManageOrder.add(tfManageValue);
		
		JLabel lblDescription_1 = new JLabel("Descrição");
		lblDescription_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription_1.setBounds(95, 212, 109, 23);
		pManageOrder.add(lblDescription_1);
		
		tfManageDescription = new JTextField();
		tfManageDescription.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfManageDescription.setColumns(10);
		tfManageDescription.setBounds(256, 206, 258, 37);
		pManageOrder.add(tfManageDescription);
		
		JPanel pListOrders = new JPanel();
		tabbedPane.addTab("Listar Pedidos", null, pListOrders, null);
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
		
		JButton btnModfyOrder = new JButton("Modificar Pedido");
		btnModfyOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModfyOrder.setBounds(248, 319, 157, 46);
		pManageOrder.add(btnModfyOrder);
		
		OrderController orderController = 
				new OrderController(tfName, tfValue,
				   tfDescription, tfManageOrderId,
				   tfManageName, tfManageValue,
				   tfManageDescription, taOrders);
		
		JLabel lblHowToModify = new JLabel("* Para modificar um pedido, digite seu id, clique em consultar, modifique o valor desejado e clique em modificar pedido.");
		lblHowToModify.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblHowToModify.setBounds(28, 276, 538, 23);
		pManageOrder.add(lblHowToModify);
		
		btnToOrder.addActionListener(orderController);
		btnListOrders.addActionListener(orderController);
		btnSendOrder.addActionListener(orderController);
		btnQueryOrders.addActionListener(orderController);
		btnModfyOrder.addActionListener(orderController);
	}
}
