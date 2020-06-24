package SOLIDSeccionB;

public class Notificacion {
	private int tipoNotificacion;
	
	public void Notificar(Pago pago) {
		if (tipoNotificacion==1) {
			
			
			//enviarEMAIL();
		}
		else {
			//enviar SMS();
		}
	}
}
