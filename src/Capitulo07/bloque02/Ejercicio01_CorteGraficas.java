package Capitulo07.bloque02;

public class Ejercicio01_CorteGraficas {

	public static void main(String[] args) {
		double y1;
		double y2;
		
		for (float x = 0; x < 1; x+= 0.0001) {
			y1 = Math.sqrt(x);
			y2 = - Math.log(x);
			
			if(Math.abs(y1 - y2) < 0.001) {
				System.out.println("El punto donde se cortan es: " + x);
			}
		}

	}

}
