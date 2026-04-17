package clases;

import java.util.ArrayList;

public class ArregloProducto {
	
private ArrayList<Producto>Pro;
public ArregloProducto () {
	Pro=new ArrayList<Producto>();
	Adicionar(new Producto(001,"Coca Cola","Coca Cola","Gaseosa",30,3,3.5));
	Adicionar(new Producto(002,"Inka Cola","Coca Cola","Gaseosa",25,3,3.5));
	Adicionar(new Producto(003,"Pepsi","Pepsi","Gaseosa",40,2,3.0));
	Adicionar(new Producto(004,"Agua Cielo","Cielo","Agua",25,1,1.8));
	Adicionar(new Producto(005,"Agua San luis","San Luis","Agua",30,1.8,2.8));
}

public void Adicionar (Producto x) {
	Pro.add(x);
}
public int Tamaño() {
	return Pro.size();
}

public Producto Obtener(int x) {
	return Pro.get(x);
}

public Producto Buscar(int codigo) {
	for (int i = 0; i< Tamaño();i++) {
		if(Obtener(i).getCodigo() == codigo) {
			return Obtener(i);
		}
	}
	return null;
}
}