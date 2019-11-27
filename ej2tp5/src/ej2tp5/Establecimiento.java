package ej2tp5;

import java.util.ArrayList;

public class Establecimiento extends ESV{
	protected ArrayList <ESV> elementos;

	public Establecimiento() {
		this.elementos = new ArrayList<ESV>();
	}
	public void add(ESV v) {
		elementos.add(v);
	}
	public double porcentajeVotos(Condicion c) {
		double aux = 0;
		for(ESV v: elementos) {
			aux = aux + v.porcentajeVotos(c);
		}
		return aux;
	}
	public int cantidadVotos() {
		int suma = 0;
		for(ESV v: elementos) {
			suma = suma + v.cantidadVotos();
		}
	return suma;
	
	}
}
