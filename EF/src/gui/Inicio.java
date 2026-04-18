package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtUsuario;
	private JButton btnNewButton;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Minimarket Palacios");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(46, 29, 186, 25);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("USUARIO");
			lblNewLabel_1.setBounds(95, 99, 70, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("CONTRASEÑA");
			lblNewLabel_2.setBounds(83, 166, 86, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(83, 124, 86, 20);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			btnNewButton = new JButton("INGRESAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(72, 235, 103, 23);
			contentPane.add(btnNewButton);
		}
		{
			txtContraseña = new JPasswordField();
			txtContraseña.setBounds(83, 186, 86, 20);
			contentPane.add(txtContraseña);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		String usuario = txtUsuario.getText();
		String clave = new String(txtContraseña.getPassword());
		if(usuario.equals("admin")&& clave.equals("123")) {
			JOptionPane.showMessageDialog(this,"Binevenido");
			Interfaz i = new Interfaz();
			i.setVisible(true);
			dispose();
			
		}else JOptionPane.showMessageDialog(this,"Datos incorrectos");
		
		
		
	}
}
