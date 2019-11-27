package prefinal2018;

import java.util.ArrayList;

public class Numero extends Cuentas {
	private int num;

	public Numero(int num) {
		this.num = num;
	}

	@Override
	public ArrayList<Numero> getNumeros() {
		ArrayList<Numero> aux = new ArrayList<Numero>();
		aux.add(this);
		return aux;
	}

	@Override
	public ArrayList<Operador> getOperadores() {
		ArrayList<Operador> aux = new ArrayList<Operador>();
		return aux;
	}
	public int getValor() {
		return num;
	}

	@Override
	public ArrayList<Integer> getResultado() {
		ArrayList<Integer> aux = new ArrayList<Integer>();
		aux.add(num);
		return aux;
	}

	
}
