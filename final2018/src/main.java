
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jefe j = new Jefe("dou", "dou", 5, 5, 5);
		Jefe j1 = new Jefe("dou", "dou", 5, 5, 5);

		Programador e = new Programador("matu", "dou", 5, 5, 2);
		Programador e1 = new Programador("matu", "dddddad", 5, 5, 2);
		Programador e2 = new Programador("matu", "xd", 5, 5, 2);
		Comparador c2 = new ComparadorApellido(null);
		Comparador c1 = new ComparadorNombre(c2);
		
		j.add(e);
		j.add(e1);
		j.add(e2);
		
		e.add("programador");
		e.add("down");
		e.add("raul");
		
		e1.add("matu");
		e1.add("no");
		e1.add("te");
		e1.add("suicides");
		e1.add(":c");




		System.out.println(j.getEspecialidad());
		System.out.println(j.getSueldo());
		System.out.println(e.getEspecialidad());
		System.out.println(j.cantidadProgramadores(j));
		System.out.println(j.getEspecialidad());
		j.getEmpleados(c1);
		j.g
		
	}

}
