package parcialito4;

import java.util.ArrayList;
import java.util.Collections;

public class Continente extends Region {
	private ArrayList<Region> ciudades;

	public Continente(String n) {
		this.ciudades = new ArrayList<Region>();
		nombre = n;
	}

	@Override
	public int getHabitantes() {
		int suma = 0;
		for(Region r: ciudades) {
			suma += r.getHabitantes();
		}
		return suma;
	}

	@Override
	public double getGastos() {
		double suma = 0;
		for(Region r: ciudades) {
			suma += r.getGastos();
		}
		return suma;
	}

	@Override
	public double getIngresos() {
		double suma = 0;
		for(Region r: ciudades) {
			suma += r.getIngresos();
		}
		return suma;
	}

	@Override
	public ArrayList<Ciudad> ciudadesDeficit() {
		ArrayList<Ciudad> aux = new ArrayList<Ciudad>();
		for(Region r: ciudades) {
			aux.addAll(r.ciudadesDeficit());
		}
		Collections.sort(aux);
		return aux;
	}
	
	
}
