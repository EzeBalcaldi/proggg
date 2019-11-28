package prefinal20182;

public class main {

	public static void main(String[] args) {
		Valor v = new Valor(2);
		Valor v1 = new Valor(3);
		Valor v2 = new Valor(5);
		Multiplicacion m = new Multiplicacion(v, v1, '*');
		Suma s = new Suma(m, v2, '+');
		System.out.println(s.getValor());
		
		Valor v3 = new Valor(7);
		Valor v4 = new Valor(8);

		Suma s1 = new Suma(v3, v4, '+');
		Resta r = new Resta(v2, v1, '-');
		Division d = new Division(s1, r, '/');
		System.out.println(d.getValor());
		
	}

}
