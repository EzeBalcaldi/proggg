package ej2tp5;

import java.time.LocalDate;

public class Voto {
protected Candidato c;
protected LocalDate fecha;
public Voto(Candidato c, LocalDate fecha) {
	this.c = c;
	this.fecha = fecha;
}
}
