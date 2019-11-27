package ej2tp5;

public class Candidato {
protected String nombre;
protected String partido;
protected String agrupacion;
public Candidato(String nombre, String partido, String agrupacion) {
	this.nombre = nombre;
	this.partido = partido;
	this.agrupacion = agrupacion;
}
public boolean equals(Candidato o) {
	if(nombre.equals(o.nombre)){
		return true;
	}
	return false;
}

}
