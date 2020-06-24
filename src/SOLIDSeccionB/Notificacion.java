package SOLIDSeccionB;

public class Notificacion {
	private TipoNotificacion tipoNotificacion;
	
	public Notificacion(TipoNotificacion tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}
	
	public void Notificar(Pago pago) {
		tipoNotificacion.notificar(pago);
	}
}
