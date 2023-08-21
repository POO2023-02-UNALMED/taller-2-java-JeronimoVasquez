package test;

public class testmetodomio {
	
	public static void main(String[] args) {
		
		Auto a = new Auto();
		Motor m = new Motor();
		a.registro = 32;
		m.registro = 32;
		a.motor = m;
		a.asientos = new Asiento[5];
		a.asientos[0] = new Asiento();
		a.asientos[0].registro = 32;
		a.asientos[4] = new Asiento();
		a.asientos[4].registro = 32;
		
		
		Auto a2 = new Auto();
		Motor m2 = new Motor();
		a2.registro = 32;
		m2.registro = 32;
		a2.motor = m2;
		a2.asientos = new Asiento[5];
		a2.asientos[0] = new Asiento();
		a2.asientos[0].registro = 40;
		a2.asientos[4] = new Asiento();
		a2.asientos[4].registro = 32;

		
		
		if(a.verificarIntegridad().equals("Auto original") && 
				a2.verificarIntegridad().equals("Las piezas no son originales")) {
			System.out.println("hola");
		}
		System.out.println(a.verificarIntegridad());
		System.out.println(a2.verificarIntegridad());
	}
	


}
