package ej2tp5;

public class CondicionCandidato extends Condicion{
	private Candidato c;

	public CondicionCandidato(Candidato c) {
		this.c = c;
	}

	public boolean seCumple(Voto v) {
		return v.c.equals(c);
	}

}
