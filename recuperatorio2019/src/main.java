package sadkjask;

public class main {

	public static void main(String[] args) {
		Condicion co = new CondicionDireccion("dou");
		Combo c = new Combo(5, co);
		Destinatario d = new Destinatario("du", "du", "du");
		Destinatario d1 = new Destinatario("du", "du", "du");
		Destinatario d2= new Destinatario("dou", "dou", "dou");
		Destinatario d3 = new Destinatario("du", "du", "du");

		Envio e= new Envio(d2, d2, false, 15, 4);
		Envio e1= new Envio(d2, d2,false, 15, 3);
		Envio e2= new Envio(d2, d2, false, 15, 5);
		Envio e3= new Envio(d2, d2, false, 15, 55);
		c.add(e);
		c.add(e1);
		c.add(e2);
		c.add(e3);
		c.imprimir();
		System.out.println(c.getEnvios(co));
		System.out.println(e2.getId());
		
		

	}

}
