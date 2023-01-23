package Examenes.examen20221123;

import Utils.arrays;

public class utils {
	
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int numeros[] = new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = arrays.obtenerNumeroAzar(limInf, limSup);
		}
		return numeros;
	}
	
	public static void mostrarArray(int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void mostrarArrayD(double[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void mostrarArrayC(char[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void rellenaArrayRafanacci (double[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (i >= 2) {
				numeros[i] = ((numeros[i-2]*numeros[i-1])+(numeros[i-1]/2));
			}
		}
	}
	
	public static String minúsculas (char frase[]) {
		String frasef = "" ; 
		for (int i = 0; i < frase.length; i++) {
			if(frase[i] == ('A' | 'B' | 'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'Ñ'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z') ) {

			}
			frasef += frase[i];
			
		}
		
		return frasef;
	}
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean compruebamatriz(int matriz[][]) {
		boolean band = true ;
		int j = 0;
		for (int i = 0; i < matriz.length-1; i++) {
			if(matriz[i][j] < matriz[i+1][j]) {
				
			}else {
				band = false ; 
			}
			if(i == 3 && j < matriz.length) {
				j++;
				i=0;
			}
		}
		return band;
	}
}

