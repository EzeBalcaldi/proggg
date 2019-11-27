import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Jefe extends Empresa{
protected int añosEmpresa;
protected ArrayList<Empresa> empleados;



public Jefe(String n, String a, int e, int s, int h) {
	nombre = n;
	apellido = a;
	edad = e;
	sueldo = s;
	añosEmpresa= h;
	empleados = new ArrayList<Empresa>();
}
public int getSueldo() {
	int suma = 0;
	for(Empresa e: empleados) {
		suma+= e.getSueldo();
	}
	return suma + sueldo;
}

public String getEspecialidad() {
	String aux = "";
	for(Empresa e: empleados) {
		aux = aux + e.getEspecialidad() + " ";
	}
	return aux;
}
public void add(Empresa e) {
	empleados.add(e);
}
@Override
public ArrayList<Programador> getProgramadores() {
	ArrayList<Programador> programadores = new ArrayList<Programador>();
	for(Empresa p: empleados) {
		programadores.addAll(p.getProgramadores());
	}
	Collections.sort(programadores);
	return programadores;
}

public int cantidadProgramadores(Jefe e) {
	return e.getProgramadores().size();
}
public Programador getEmpleado(Condicion c) {
	for(Empresa e: empleados) {
		return e.getEmpleado(c);
	}
	return null;
}
@Override
public ArrayList<Empresa> getEmpleados(Comparador c) {
	ArrayList<Empresa> empleados = new ArrayList<Empresa>();
	for(Empresa e: this.empleados) {
		empleados.addAll(e.getEmpleados(c));
	}
	Collections.sort(empleados, c);
	for(Empresa p: empleados) {
		System.out.println(p.nombre + " " + p.apellido);
	}
	return empleados;

	
}



}
