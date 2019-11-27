package sadkjask;

import java.util.ArrayList;

public class Combo extends Correo{
	private ArrayList<Correo> envios;
	private Condicion c;
	public Combo(int i, Condicion c) {
		id = i;
		this.envios = new ArrayList<Correo>();
		this.c = c;
	}
	public void add(Correo co) {
		if(c.seCumple(co)) {
			envios.add(co);
			co.setId(this.id);
		}
	}
	public void setId(int i) {
		this.id = i;
	}
	@Override
	public double getPeso() {
		double s = 0;
		for(Correo c: envios) {
			s+= c.getPeso();
		}
		return s;
	}
	@Override
	public Destinatario getDestinatario() {
		return envios.get(0).getDestinatario();
	}
	@Override
	public Destinatario getRemitente() {
		return envios.get(0).getRemitente();
	}
	@Override
	public ArrayList<Envio> getEnvios(Condicion c) {
		ArrayList<Envio> aux = new ArrayList<Envio>();
		for(Correo co: envios) {
			aux.addAll(co.getEnvios(c));
		}
		return aux;
	}
	public void imprimir() {
		for(Correo co: envios) {
			System.out.println(co.getDestinatario().getCalle());
		}
	}
	public int getId() {
		return id;
	}
	
	

}
