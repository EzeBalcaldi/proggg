package parcialito4;

import java.util.ArrayList;

public abstract class Region {
	protected String nombre;
	public abstract int getHabitantes();
	public abstract double getGastos();
	public abstract double getIngresos();
	public boolean esDeficit() {
		if(this.getIngresos() > this.getGastos()) {
			return true;
		}
		return false;
	}
	public abstract ArrayList<Ciudad> ciudadesDeficit();
	}
