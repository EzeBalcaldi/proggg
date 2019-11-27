package ej2tp5;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Establecimiento e = new Establecimiento();
		Mesa m = new Mesa();
		e.add(m);
		Candidato c = new Candidato("dou", "ndeah", "xd");
		Votante v = new Votante (1);
		Votante v1 = new Votante(2);
		Condicion cond = new CondicionCandidato(c);
		Voto voto = new Voto(c, LocalDate.now());
		m.add(v);
		v1.votar(m, voto);
		

	}

}
