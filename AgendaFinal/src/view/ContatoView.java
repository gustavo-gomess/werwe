package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContatoView extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfNumero;
	private JTextField tfDdd;
	private JTextField tfEmail;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContatoView frame = new ContatoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

			
	public ContatoView() {
		setTitle("Cadastro de Contato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(60, 66, 345, 43);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		tfNumero.setBounds(60, 166, 345, 43);
		contentPane.add(tfNumero);
		
		tfDdd = new JTextField();
		tfDdd.setColumns(10);
		tfDdd.setBounds(60, 263, 345, 43);
		contentPane.add(tfDdd);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(60, 366, 345, 43);
		contentPane.add(tfEmail);
		
		JButton bntCadastrar = new JButton("Cadastrar!");
		bntCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				
			}
		});
		bntCadastrar.setBounds(128, 469, 193, 55);
		contentPane.add(bntCadastrar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(60, 44, 45, 19);
		contentPane.add(lblNome);
		
		JLabel lblNumero = new JLabel("Numero de Telefone:");
		lblNumero.setBounds(60, 143, 152, 13);
		contentPane.add(lblNumero);
		
		JLabel lblDDD = new JLabel("DDD do Telefone:");
		lblDDD.setBounds(60, 240, 152, 13);
		contentPane.add(lblDDD);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(60, 337, 45, 19);
		contentPane.add(lblEmail);
	}
}
