package Capitulo04.bloque05;

import Utils.arrays;

public class Ejercicio03_ArrayConDecimales {

	public static void main(String[] args) {
		double[] numeros = Ejercicio03_ArrayConDecimales.creaArrayNumerosAzarConDec(20, 0, 0);
		
		for(int i = 0; i < numeros.length; i++) {
			double num = Ejercicio03_ArrayConDecimales.obtenerNumeroAzardec(0, 99);
			double num2 = Ejercicio03_ArrayConDecimales.obtenerNumeroAzardec(0, 1);
			numeros[i] = num + num2 ; 
		}
		Ejercicio03_ArrayConDecimales.mostrarArraydec(numeros);
	}
	/*
	 * Tengo que crear otra vez los metodos ya que el original era Int y yo lo quiero double y no podia
	 * hacer casting 
	 */
	public static double[] creaArrayNumerosAzarConDec (int longitud, int limInf, int limSup) {
		double numeros[] = new double[longitud];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Ejercicio03_ArrayConDecimales.obtenerNumeroAzardec(limInf, limSup);
		}
		return numeros;
	}
	public static double obtenerNumeroAzardec (int min, int max) {
		 return ((double) Math.round(Math.random() * (max - min)) + min);
	}
	public static void mostrarArraydec (double[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
