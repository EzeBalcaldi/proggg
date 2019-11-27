package sadkjask;

import java.util.ArrayList;

public class Envio extends Correo{
	private Destinatario destinatario;
	private Destinatario remitente;
	private boolean retiraSuc;
	private double peso;
	public Envio(Destinatario destinatario, Destinatario remitente, boolean retiraSuc, double peso, int i) {
		id = i;
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.retiraSuc = retiraSuc;
		this.peso = peso;
	}
	@Override
	public void setId(int i) {
		this.id = i;
	}
	@Override
	public double getPeso() {
		return peso;
	}
	@Override
	public Destinatario getDestinatario() {
		return destinatario;
	}
	@Override
	public Destinatario getRemitente() {
		return remitente;
	}
	@Override
	public ArrayList<Envio> getEnvios(Condicion c) {
		ArrayList<Envio> aux = new ArrayList<Envio>();
		if(c.seCumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	public int getId() {
		return id;
	}
	
}
