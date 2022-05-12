package view;
import conexaoBd.conexao;

import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class crudInterface extends JFrame {

	private JPanel contentPane;
	private JButton btnEnviar;
	private JPanel panel;
	private JLabel lblNome;
	private JTextField textField;
	private JPanel panel_1;
	private JTextField textField_1;
	private JLabel lblContato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudInterface frame = new crudInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criando Interface
	 */
	public crudInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 472, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		
		btnEnviar = new JButton("Enviar");
		contentPane.add(btnEnviar, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		lblNome = new JLabel("Nome:");
		panel.add(lblNome);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		
		lblContato = new JLabel("Contato:");
		panel_1.add(lblContato);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}
	
	/**
	 * Manipulando
	 */
	
	Statement inserir = conexao.createStatement();
	inserir.execute(("INSERT INTO pessoa(nome,contato) VALUES(lblNome, LblContato)"));

	
}
