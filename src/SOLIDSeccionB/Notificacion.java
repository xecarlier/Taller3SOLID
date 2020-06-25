package SOLIDSeccionB;

public class Notificacion {
	private TipoNotificacion tipoNotificacion;
	
	public Notificacion(TipoNotificacion tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}
	
	public void Notificar(Pago1 pago) {
		
		tipoNotificacion.notificar(pago);
	}
}
