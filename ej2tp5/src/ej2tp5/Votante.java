package ej2tp5;

public class Votante {
protected int dni;

public Votante(int dni) {
	this.dni = dni;
}
public void votar(Mesa m, Voto v) {
	m.votar(this, v);
}
}
