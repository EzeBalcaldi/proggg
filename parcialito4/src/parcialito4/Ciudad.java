package parcialito4;

import java.util.ArrayList;

public class Ciudad extends Region implements Comparable<Ciudad>{
	private int habitantes;
	private double gastos;
	private double ingresos;
	public Ciudad(String n, int habitantes, double gastos, double ingresos) {
		nombre = n;
		this.habitantes = habitantes;
		this.gastos = gastos;
		this.ingresos = ingresos;
	}
	@Override
	public int getHabitantes() {
		return habitantes;
	}
	@Override
	public double getGastos() {
		return gastos;
	}
	@Override
	public double getIngresos() {
		// TODO Auto-generated method stub
		return ingresos;
	}
	@Override
	public ArrayList<Ciudad> ciudadesDeficit() {
		ArrayList<Ciudad> aux = new ArrayList<Ciudad>();
		if(esDeficit()) {
			aux.add(this);
		}
		return aux;
	}
	@Override
	public int compareTo(Ciudad o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	
}
