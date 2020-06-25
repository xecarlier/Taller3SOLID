package lsp.good;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
	int num;
	int nombreCliente;
	LocalDate fechaEmision;
	int estado;
	ArrayList<Producto> productos;
	ArrayList<Impuesto> impuestos;
	int total;
	public Factura(int nombreCliente, ArrayList<Producto> productos, ArrayList<Impuesto> impuestos) {
		super();
		this.nombreCliente = nombreCliente;
		this.productos = productos;
		this.impuestos = impuestos;
	}
	public boolean emitir() {
		//Logica para emitir una factura
		return true;
	};
	public boolean anular() {
		return true;
	}
	public boolean cambiarEstado() {
		return true;
	}
	
}
