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
	public static int[][] creaEInicializaMatriz  (int filas , int cols , int ValorInicial){
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = ValorInicial ; 
			}
		}
		return m;
	}
	public static void mostrarMatriz (int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.println(m[i][j] + "\t");
			}
		}
	}
	public static int compruebaimpar (int numeros[]) {
		int i ;
		if(numeros.length % 2 != 0) {
			i = 0 ;
		}else {
			i = -1;
		}
		return i;
	}
	public static float consiguemediasusp(int numeros[]) {
		int susp = 0;
		int j = 0 ; 
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 5) {
				susp += numeros[i]; 
				++j;
			}
		}
		float med = (float)susp / (float)j ; 
		return med;
	}
	public static float consiguemedaprobados(int numeros[]) {
		int aprob = 0;
		int j = 0 ; 
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 5) {
				aprob+= numeros[i]; 
				++j;
			}
		}
		float med = (float)aprob / (float)j ; 
		return med;
	}


	
}


