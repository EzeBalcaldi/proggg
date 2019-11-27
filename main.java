package prefinal2018;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Expresion e = new Expresion();
		Numero n = new Numero(5);
		Numero n1 = new Numero(1);
		Numero n2= new Numero(2);
		Numero n3 = new Numero(6);
		Operador o = new Operador('-');
		Operador o1 = new Operador('+');
		Operador o2= new Operador('*');

		e.add(n);
		e.add(o);
		e.add(n1);
//		e.add(n2);
//		e.add(n3);
//		e.add(o1);
//		e.add(o1);
//		e.add(o2);

		ArrayList<Numero> numeros = e.getNumeros();
		for(Numero num: numeros) {
			System.out.println(num.getValor());
		}
		ArrayList<Operador> operadores = e.getOperadores();
		for(Operador op: operadores) {
			System.out.println((char)op.getValor());
		}
		System.out.println(e.getResultado());
		


	

		

	}

}
