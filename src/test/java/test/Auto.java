package test;

public class Auto {
	
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	
	public int cantidadAsientos() {
		
		int c = 0;
		
		for (int i = 0; i  < asientos.length; i++) {
			
			if (asientos[i] != null) {
				c++;
			}
		}
		
		return c;
		
		
	}
	
	public String verificarIntegridad() {
		if(this.registro == motor.registro) {
			
			int c = 0;
			
			for(int i = 0; i > asientos.length; i++) {
				
				if (asientos[i] != null) {
					
					if (asientos[i].registro == this.registro) {
						c++;
					}
				}
				else {
					continue;
				}
				
				
			}
			
			if (c == this.cantidadAsientos()) {
				return "Auto original";
			}
			else {
				return "Las piezas no son originales";
			}
			
		
			
		   
		}
		else {
			return "Las piezas no son originales";
		}
			
			
	}
 	

}
