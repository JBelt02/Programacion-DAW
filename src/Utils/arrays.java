package Utils;

import java.util.Scanner;

public class arrays {
	
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}

		
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int numeros[] = new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = arrays.obtenerNumeroAzar(limInf, limSup);
		}
		return numeros;
	}
	
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
		
}


