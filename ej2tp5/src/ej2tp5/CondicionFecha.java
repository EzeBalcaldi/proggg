package ej2tp5;

import java.time.LocalDate;

public class CondicionFecha extends Condicion {
	private LocalDate minimo;
	private LocalDate maximo;
	
	public CondicionFecha(LocalDate minimo, LocalDate maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public boolean seCumple(Voto v) {
//		return v.fecha.compareTo(minimo) && v.fecha.compareTo(maximo);
		return false;
	}

}
