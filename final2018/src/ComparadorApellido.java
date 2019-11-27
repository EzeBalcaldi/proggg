
public class ComparadorApellido extends Comparador {

	public ComparadorApellido(Comparador siguiente) {
		super(siguiente);
	}

	public int comparar(Empresa e1, Empresa e2) {
		return e1.apellido.compareTo(e2.apellido);
	}

}
