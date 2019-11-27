import java.util.ArrayList;

public abstract class Empresa {
protected String nombre;
protected String apellido;
protected int edad;
protected int sueldo;
public abstract int getSueldo();
public abstract String getEspecialidad();
public abstract ArrayList<Programador> getProgramadores();
public abstract Programador getEmpleado(Condicion c);
public abstract ArrayList<Empresa> getEmpleados(Comparador c);

}
