package ej2tp5;

import java.util.ArrayList;

public class Mesa extends ESV{
	protected ArrayList<Votante> votantes;
	protected ArrayList<Voto> votos;

	public Mesa() {
		this.votantes = new ArrayList<Votante>();
		this.votos = new ArrayList<Voto>();
	}
	public void add(Votante v) {
		votantes.add(v);
	}
	public void add(Voto v) {
		votos.add(v);
	}
	public int cantidadVotos() {
		return votos.size();
	}
	public double porcentajeVotos(Condicion c) {
		double aux = 0;
		for(Voto v: votos) {
			if(c.seCumple(v)) {
				aux++;
			}
		}
		return aux;
	}
	public void votar(Votante c, Voto v) {
		if(votantes.contains(c)) {
			add(v);
			System.out.println("Voto");
		}
	}
	
}
