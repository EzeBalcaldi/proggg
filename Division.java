package prefinal20182;

public class Division extends Expresion{
	private char operador;

	public Division(Abstracto izquierdo, Abstracto derecho, char o) {
		super(izquierdo, derecho);
		operador = o;
	}

	@Override
	public char getOperador() {
		return operador;
	}

	@Override
	public double getInverso() {
 		return izquierdo.getValor() * derecho.getValor();

	}

	@Override
	public double getValor() {
		if(derecho.getValor() != 0){
	 		return izquierdo.getValor() / derecho.getValor();
		}
		return error;
	}

}
