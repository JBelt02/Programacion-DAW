package Capitulo04.bloque05;
import Utils.matrices;

public class Ejercicio04_MatrizYMetodos {
	public static void main (String[] args) {
		/*
		 * Los metodos creados estan en Utils.matrices.java
		 *  
		 */
		
		
		int matriz[][] = new int[5][5];
		matrices.rellenaMatriz(matriz);
		matrices.mostrarmatriz(matriz);
		if(matrices.compruebapositivo(matriz)) {
			System.out.println("La matriz es positiva ");
		}else {
			System.out.println("La matriz tiene algun valor negativo ");
		}
		
	}
	
}
