package lsp.good;

import java.time.LocalDate;
import java.util.ArrayList;

public class FacturaElectronica extends Factura {
	
	int numAutorizacion;
	LocalDate fechaAutorizacion;
	
	public FacturaElectronica(int nombreCliente, ArrayList<Producto> productos, ArrayList<Impuesto> impuestos) {
		super(nombreCliente, productos, impuestos);
		// TODO Auto-generated constructor stub
	}
	private void obtenerAutorizacion() {
		//Logica para obtener autorizacion al SRI
		//if conexionEstablecida {
		
		numAutorizacion = 0//Numero que me de el SRI
		fechaAutorizacion = LocalDate.now();
		//}
		
	}
	@Override
	public boolean emitir() {
		obtenerAutorizacion();
		//Logica para emitir una factura
		// TODO Auto-generated method stub
		return estado;
	}

	@Override
	public boolean anular() {
		// Logica para anular
		return super.anular();
	}

	@Override
	public boolean cambiarEstado() {
		// Logica para cambiar de estado
		return super.cambiarEstado();
	}

	

}
