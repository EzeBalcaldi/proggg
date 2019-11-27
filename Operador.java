package prefinal2018;

import java.util.ArrayList;

public class Operador extends Cuentas{
	private char operador;

	public Operador(char operador) {
		this.operador = operador;
	}
	public ArrayList<Numero> getNumeros() {
		ArrayList<Numero> aux = new ArrayList<Numero>();
		return aux;
	}
	@Override
	public ArrayList<Operador> getOperadores() {
		ArrayList<Operador> aux = new ArrayList<Operador>();
		aux.add(this);
		return aux;
	}
	@Override
	public int getValor() {
		return operador;
	}
	@Override
	public ArrayList<Integer> getResultado() {
		ArrayList<Integer> aux = new ArrayList<Integer>();
		aux.add((int)operador); // como me doy cuenta depsues si es el char?
		return aux;
	}
	
	
}
