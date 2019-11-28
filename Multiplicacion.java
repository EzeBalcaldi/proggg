package prefinal20182;

public class Multiplicacion extends Expresion{
	private char operador;

	public Multiplicacion(Abstracto izquierdo, Abstracto derecho, char o) {
		super(izquierdo, derecho);
		operador = o;
	}

	@Override
	public char getOperador() {
		return operador;
	}

	@Override
	public double getInverso() {
		if(derecho.getValor() != 0){
	 		return izquierdo.getValor() / derecho.getValor();
		}
		return error;
	}

	@Override
	public double getValor() {
 		return izquierdo.getValor() * derecho.getValor();

	}
	
	

}
