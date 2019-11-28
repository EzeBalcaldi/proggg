package prefinal20182;

import java.util.ArrayList;

public class Valor extends Abstracto {
	private double valor;

	public Valor(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

	@Override
	public ArrayList<Valor> getNumeros() {
		ArrayList<Valor> aux = new ArrayList<Valor>();
		aux.add(this);
		return aux;
	}
}
