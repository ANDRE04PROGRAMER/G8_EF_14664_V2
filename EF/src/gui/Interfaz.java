package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloProducto;
import clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtProducto;
	private JButton btnNewButton;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(20, 50, 84, 20);
		contentPane.add(btnReportar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(109, 50, 84, 20);
		contentPane.add(btnBuscar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(203, 50, 84, 20);
		contentPane.add(btnAdicionar);
		
		txtProducto = new JTextField();//
		txtProducto.setBounds(97, 10, 96, 18);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Producto:");//
		lblNewLabel.setBounds(20, 13, 44, 12);
		contentPane.add(lblNewLabel);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 93, 416, 160);
		contentPane.add(txtS);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	/*-----------------------*/
	ArregloProducto ae =new ArregloProducto();
	private JScrollPane scrollPane;
	private JButton btnBuscar;
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		
	}
	void Listado() {
		Imprimir("Codigo\tNombre\tMarca\tCategoria\tStock\tPrecio Costo\tPrecio Venta");
		for (int i = 0;i<ae.Tamaño();i++) {
			Imprimir(""+ae.Obtener(i).getCodigo()+"\t"+ae.Obtener(i).getNombre()
					+"\t"+ae.Obtener(i).getMarca()+"\t"+ae.Obtener(i).getCategoria()
					+"\t"+ae.Obtener(i).getStock()+"\t"+ae.Obtener(i).getPrecioC()
					+"\t"+ae.Obtener(i).getPrecioV());
		}
	}
	
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		int codigo = Integer.parseInt(txtProducto.getText());
		Producto p = ae.Buscar(codigo);
		if (p != null) {
			JOptionPane.showMessageDialog(this, "Si existe");
		}else {
			JOptionPane.showMessageDialog(this, "No existe");
		}
	}
}
