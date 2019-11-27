import java.util.ArrayList;

public class Programador extends Empresa implements Comparable<Programador>{
protected ArrayList<String> especialidades;
protected int horasTrabajadas;

public Programador(String n, String a, int e, int s, int h) {
	nombre = n;
	apellido = a;
	edad = e;
	sueldo = s;
	horasTrabajadas= h;
	especialidades = new ArrayList<String>();
}
public String getNombre() {
	return this.nombre;
}
public int getSueldo() {
	return this.sueldo * horasTrabajadas;
}
public String getEspecialidad() {
	String aux = "";
	for(String s: especialidades) {
		aux += s +" ";
	}
	return aux;
}

public void add(String e) {
	especialidades.add(e);
}
public int compareTo(Programador otro) {
	Integer empleado = horasTrabajadas;
	Integer otroe = otro.horasTrabajadas;
	return Integer.compare(empleado, otroe);
}
@Override
public ArrayList<Programador> getProgramadores() {
	ArrayList<Programador> aux = new ArrayList<Programador>();
	aux.add(this);
	return aux;
}
@Override
public Programador getEmpleado(Condicion c) {
	if(c.seCumple(this)) {
		return this;
	}
	return null;
}
@Override
public ArrayList<Empresa> getEmpleados(Comparador c) {
	ArrayList<Empresa> aux = new ArrayList<Empresa>();
	aux.add(this);
	return aux;

}

}
