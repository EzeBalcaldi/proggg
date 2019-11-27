package sadkjask;

public class Destinatario {
	private String ciudad;
	private String calle;
	private String numero;
	public Destinatario(String ciudad, String calle, String numero) {
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public String getNumero() {
		return numero;
	}
	
	
}
