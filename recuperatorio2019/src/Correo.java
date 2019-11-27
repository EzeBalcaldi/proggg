package sadkjask;

import java.util.ArrayList;

public abstract class Correo {
	protected int id;
	public abstract void setId(int i);
	public abstract double getPeso();
	public abstract Destinatario getDestinatario();
	public abstract Destinatario getRemitente();
	public abstract ArrayList<Envio> getEnvios(Condicion c);
	
}
