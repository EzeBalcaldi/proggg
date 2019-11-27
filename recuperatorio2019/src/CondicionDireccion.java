package sadkjask;

public class CondicionDireccion extends Condicion {
	private String n;
	

	
	public CondicionDireccion(String n) {
		this.n = n;
	}



	public boolean seCumple(Correo co) {
		return co.getDestinatario().getCalle().equals(n);
	}

}
