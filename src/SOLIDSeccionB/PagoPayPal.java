package SOLIDSeccionB;

public class PagoPayPal implements Pago {
	private boolean loggedIn;//conexion a cuenta PayPal
	

	@Override
	public void relizarCobro(double monto) {
		if (!loggedIn) {
			
			loggedInUser();
		}
		
		//cargar el monto de compra al medio de pago
	}

	private void loggedInUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarFactura() {
		// TODO Auto-generated method stub
		
	}
}
