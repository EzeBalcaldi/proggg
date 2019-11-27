
public class ComparadorNombre extends Comparador{

	public ComparadorNombre(Comparador siguiente) {
		super(siguiente);
	}

	public int comparar(Empresa e1, Empresa e2) {
		return e1.nombre.compareTo(e2.nombre);
	}

}
