package prefinal2018;

import java.util.ArrayList;

public class Expresion  extends Cuentas{
	private ArrayList<Cuentas> cuenta;

	public Expresion() {
		this.cuenta = new ArrayList<Cuentas>();
	}

	@Override
	public ArrayList<Numero> getNumeros() {
		ArrayList<Numero> aux = new ArrayList<Numero>();
		for(Cuentas c: cuenta) {
			aux.addAll(c.getNumeros());
		}
		return aux;
	}
	public void add(Cuentas c) {
		cuenta.add(c);
	}

	@Override
	public ArrayList<Operador> getOperadores() {
		ArrayList<Operador> aux = new ArrayList<Operador>();
		for(Cuentas c: cuenta) {
			aux.addAll(c.getOperadores());
		}
		return aux;
	}

	@Override
	public int getValor() {
		int aux = 0;
		for(Cuentas c: cuenta) {
			aux = c.getValor();
		}
		return aux;
	}

	@Override
	public ArrayList<Integer> getResultado() {
		int aux1 = 0;
		ArrayList<Integer> aux = new ArrayList<Integer>();
		for(Cuentas c: cuenta) {
//			aux1 = c.getValor();
//			aux.add(aux1);
			aux.addAll(c.getResultado());
			
		}
		return aux;
	}

	
	
}
