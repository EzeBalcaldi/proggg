package prefinal20182;

import java.util.ArrayList;


public abstract class Expresion extends Abstracto{
	protected Abstracto izquierdo;
	protected Abstracto derecho;
	protected static double error;
	
	
	public Expresion(Abstracto izquierdo, Abstracto derecho) {
		this.izquierdo = izquierdo;
		this.derecho = derecho;
	}
	public ArrayList<Valor> getNumeros() {
		ArrayList<Valor> aux = new ArrayList<Valor>();
		aux.addAll(izquierdo.getNumeros());
		aux.addAll(derecho.getNumeros());
		return aux;
	}
	public abstract char getOperador();
	public abstract double getInverso();
	public static void setError(double e){
		error = e;
	}
	public String toString(){
		return "(" + izquierdo + getOperador() + derecho + ")";
		
	}

}
