
package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloProducto;
import clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Interfaz extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;

	private JButton btnBuscar;
	private JButton btnReportar;
	private JButton btnAdicionar;

	ArregloProducto ae = new ArregloProducto();
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTextField txtNombre;
	private JTextField txtMarca;
	private JTextField txtCategoria;
	private JTextField txtPrecioCosto;
	private JTextField txtStock;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtPrecioVenta;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_6;
	private JTextField txtBCodigo;
	private JPanel panel;
	private JPanel panel_1;
	private JTable tablaP;

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

	public Interfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botón Reportar
		btnReportar = new JButton("Reporte");
		btnReportar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnReportar.setForeground(new Color(128, 0, 255));
		btnReportar.setIcon(new ImageIcon(Interfaz.class.getResource("/imagnes/reporte.png")));
		btnReportar.setBounds(460, 153, 111, 34);
		btnReportar.setBackground(new Color(230, 230, 250));
		btnReportar.setBorder(null);
		contentPane.add(btnReportar);

		btnReportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnReportar_actionPerformed(e);
			}
		});

		// Botón Buscar
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscar.setIcon(new ImageIcon(Interfaz.class.getResource("/imagnes/buscar.png")));
		btnBuscar.setForeground(new Color(0, 0, 0));
		btnBuscar.setBackground(new Color(230, 230, 250));
		btnBuscar.setBounds(277, 11, 94, 23);
		btnBuscar.setBorder(null);
		contentPane.add(btnBuscar);

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnBuscar_actionPerformed(e);
			}
		});

		// Botón Adicionar
		btnAdicionar = new JButton("Nuevo");
		btnAdicionar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAdicionar.setForeground(new Color(0, 0, 255));
		btnAdicionar.setIcon(new ImageIcon(Interfaz.class.getResource("/imagnes/nuevo.png")));
		btnAdicionar.setBackground(new Color(230, 230, 250));
		btnAdicionar.setBounds(32, 154, 122, 32);
		btnAdicionar.setBorder(null);
		contentPane.add(btnAdicionar);

		// Botón Modificar
		btnModificar = new JButton("Modificar");
		btnModificar.setForeground(new Color(255, 128, 0));
		btnModificar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnModificar.setSelectedIcon(null);
		btnModificar.setIcon(new ImageIcon(Interfaz.class.getResource("/imagnes/editar.png")));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(179, 153, 111, 34);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(230, 230, 250));
		contentPane.add(btnModificar);

		// Botón Eliminar
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(255, 0, 0));
		btnEliminar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnEliminar.setIcon(new ImageIcon(Interfaz.class.getResource("/imagnes/eliminar.png")));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(323, 153, 111, 34);
		btnEliminar.setBackground(new Color(230, 230, 250));
		btnEliminar.setBorder(null);
		contentPane.add(btnEliminar);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 193, 598, 157);
			contentPane.add(scrollPane);
			{
				tablaP = new JTable();
				tablaP.addMouseListener(this);
				tablaP.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"CODIGO", "NOMBRE", "MARCA", "CATEGORIA", "STOCK", "P. COSTO", "P. VENTA"
					}
				));
				tablaP.getColumnModel().getColumn(0).setPreferredWidth(56);
				tablaP.getColumnModel().getColumn(1).setPreferredWidth(115);
				tablaP.getColumnModel().getColumn(2).setPreferredWidth(92);
				tablaP.getColumnModel().getColumn(3).setPreferredWidth(80);
				tablaP.getColumnModel().getColumn(4).setPreferredWidth(48);
				tablaP.getColumnModel().getColumn(5).setPreferredWidth(62);
				tablaP.getColumnModel().getColumn(6).setPreferredWidth(60);
				scrollPane.setViewportView(tablaP);
			}
		}
		{
			lblNewLabel_6 = new JLabel("Buscar producto:");
			lblNewLabel_6.setBounds(22, 11, 117, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtBCodigo = new JTextField();
			txtBCodigo.setBounds(131, 12, 136, 20);
			contentPane.add(txtBCodigo);
			txtBCodigo.setColumns(10);
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBorder(new TitledBorder(null, "Datos de producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(22, 40, 601, 111);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			{
				lblNewLabel_3 = new JLabel("Stock");
				lblNewLabel_3.setBounds(10, 87, 55, 14);
				panel_1.add(lblNewLabel_3);
			}
			
			txtStock = new JTextField();
			txtStock.setBounds(75, 85, 80, 18);
			panel_1.add(txtStock);
			txtStock.setColumns(10);
			{
				lblNewLabel_1 = new JLabel("Marca");
				lblNewLabel_1.setBounds(10, 58, 44, 12);
				panel_1.add(lblNewLabel_1);
			}
			
			{
				txtMarca = new JTextField();
				txtMarca.setBounds(75, 55, 80, 18);
				panel_1.add(txtMarca);
				txtMarca.setColumns(10);
			}
			
					// TextField
					txtCodigo = new JTextField();
					txtCodigo.setBounds(75, 21, 80, 18);
					panel_1.add(txtCodigo);
					
							// Label
							JLabel lblProducto = new JLabel("Código");
							lblProducto.setBounds(12, 23, 53, 14);
							panel_1.add(lblProducto);
							{
								lblNewLabel_2 = new JLabel("Categoría");
								lblNewLabel_2.setBounds(199, 58, 80, 12);
								panel_1.add(lblNewLabel_2);
							}
							{
								lblNewLabel = new JLabel("Nombre");
								lblNewLabel.setBounds(199, 24, 60, 12);
								panel_1.add(lblNewLabel);
							}
							
								txtNombre = new JTextField();
								txtNombre.setBounds(269, 21, 80, 18);
								panel_1.add(txtNombre);
								txtNombre.setColumns(10);
								{
									txtCategoria = new JTextField();
									txtCategoria.setBounds(269, 55, 80, 18);
									panel_1.add(txtCategoria);
									txtCategoria.setColumns(10);
								}
								{
									panel = new JPanel();
									panel.setBounds(386, 11, 205, 81);
									panel_1.add(panel);
									panel.setBackground(Color.WHITE);
									panel.setForeground(Color.WHITE);
									panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Precios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
									panel.setLayout(null);
									{
										lblNewLabel_4 = new JLabel("Precio Costo");
										lblNewLabel_4.setBounds(10, 24, 60, 14);
										panel.add(lblNewLabel_4);
									}
									{
										txtPrecioCosto = new JTextField();
										txtPrecioCosto.setBounds(107, 22, 80, 18);
										panel.add(txtPrecioCosto);
										txtPrecioCosto.setColumns(10);
									}
									{
										lblNewLabel_5 = new JLabel("Precio Venta");
										lblNewLabel_5.setBounds(10, 54, 79, 12);
										panel.add(lblNewLabel_5);
									}
									{
										txtPrecioVenta = new JTextField();
										txtPrecioVenta.setBounds(107, 51, 80, 18);
										panel.add(txtPrecioVenta);
										txtPrecioVenta.setColumns(10);
									}
								}
								Listado();
		}

		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdicionar_actionPerformed(e);
			}
		});

		
	}

	// ---------------- FUNCIONES ----------------

	protected void do_btnReportar_actionPerformed(ActionEvent e) {
		
		Listado();
	}
	
	

	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		
		try {
			Producto p = null;
			try {
			int codigo = Integer.parseInt(txtBCodigo.getText());
			 p = ae.Buscar(codigo);
			} catch (NumberFormatException ex) {
				 p = ae.Buscar(txtBCodigo.getText());
			}

			if (p != null ) {
				JOptionPane.showMessageDialog(this, "Sí existe");
			} else {
				JOptionPane.showMessageDialog(this, "No existe");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Ingrese un código válido");			
		}
	}

	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Función adicionar aún no implementada");
	}

	void Listado() {
		DefaultTableModel modelo =
				(DefaultTableModel) tablaP.getModel();

				modelo.setRowCount(0); // limpia tabla

				for(int i=0; i<ae.Tamaño(); i++){
				   Imprimir(ae.Obtener(i));
				}
	}

	void Imprimir(Producto p) {
		DefaultTableModel modelo =
				(DefaultTableModel) tablaP.getModel();

				modelo.addRow(new Object[]{
				    p.getCodigo(),
				    p.getNombre(),
				    p.getMarca(),
				    p.getCategoria(),
				    p.getStock(),
				    p.getPrecioC(),
				    p.getPrecioV()
				});
	}
	
	
	// Botón Modificar
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		try {
			
			if (txtCategoria.getText().trim().isEmpty() || txtMarca.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty() || txtPrecioCosto.getText().trim().isEmpty() || txtPrecioVenta.getText().trim().isEmpty() || txtCodigo.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(this,"Completar todos los campos!");
				return;
			}
			
			
	        int codigo = Integer.parseInt(txtCodigo.getText());

	        Producto p = ae.Buscar(codigo);

	        if (p != null) {
	            p.setNombre(txtNombre.getText());
	            p.setMarca(txtMarca.getText());
	            p.setCategoria(txtCategoria.getText());
	            p.setStock(Integer.parseInt(txtStock.getText()));
	            p.setPrecioC(Double.parseDouble(txtPrecioCosto.getText()));
	            p.setPrecioV(Double.parseDouble(txtPrecioVenta.getText()));

	            JOptionPane.showMessageDialog(this, "Producto modificado correctamente");
	        } else {
	            JOptionPane.showMessageDialog(this, "Producto no encontrado");
	        }

	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Error en los datos ingresados");
	    }
	}
	
	
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		int cod = Integer.parseInt(txtCodigo.getText());
		Producto p = ae.Buscar(cod);
		
		try {
			if (p != null) {
				ae.Eliminar(p);
				JOptionPane.showMessageDialog(this, "Producto eliminado");
				txtCodigo.setText("");
			} else {
				JOptionPane.showMessageDialog(this, "El codigo no existe");
				txtCodigo.setText("");
			}
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Ingrese el código válido");			
		}		
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tablaP) {
			do_tablaP_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void do_tablaP_mouseClicked(MouseEvent e) {
		int fila=tablaP.rowAtPoint(e.getPoint());
		txtCodigo.setText(tablaP.getValueAt(fila, 0).toString());
		txtNombre.setText(tablaP.getValueAt(fila,1).toString());
		txtMarca.setText(tablaP.getValueAt(fila,2).toString());
		txtCategoria.setText(tablaP.getValueAt(fila,3).toString());
		txtStock.setText(tablaP.getValueAt(fila,4).toString());
		txtPrecioCosto.setText(tablaP.getValueAt(fila,5).toString());
		txtPrecioVenta.setText(tablaP.getValueAt(fila,6).toString());
	}
	
}