package prefinal20182;

public class Suma extends Expresion{
	private char operador;
	public Suma(Abstracto izquierdo, Abstracto derecho, char o) {
		super(izquierdo, derecho);
		operador = o;
	}
	public double getValor(){
		return izquierdo.getValor() + derecho.getValor();
	}
	public char getOperador() {
		return operador;
	}
 	public double getInverso() {
 		return izquierdo.getValor() - derecho.getValor();
	}
	
	
}
