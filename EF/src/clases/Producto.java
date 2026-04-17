package clases;

public class Producto {
	int codigo, stock;
	String nombre,marca,categoria;
	Double precioC,precioV;
	
	
	public Producto(int codigo, String nombre, String marca, String categoria,int stock, double precioC,
			Double precioV) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.categoria = categoria;
		this.stock = stock;
		this.precioC = precioC;
		this.precioV = precioV;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrecioC() {
		return precioC;
	}
	public void setPrecioC(Double precioC) {
		this.precioC = precioC;
	}
	public Double getPrecioV() {
		return precioV;
	}
	public void setPrecioV(Double precioV) {
		this.precioV = precioV;
	}
	
}
