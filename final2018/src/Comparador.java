import java.util.Comparator;

public abstract class Comparador implements Comparator<Empresa>{
	private Comparador siguiente;
	
	public Comparador(Comparador siguiente) {
		this.siguiente = siguiente;
	}
	public abstract int comparar(Empresa e1, Empresa e2);
	public int compare(Empresa e1, Empresa e2) {
		int resultado = comparar(e1, e2);
		if(resultado == 0 && siguiente != null) {
			resultado = siguiente.comparar(e1, e2);
		}
		return resultado;
		
	}

}
