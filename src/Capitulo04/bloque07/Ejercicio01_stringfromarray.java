package Capitulo04.bloque07;

import Utils.arrays;

public class Ejercicio01_stringfromarray {

	public static void main(String[] args) {
		int[] numeros = arrays.creaArrayNumerosAzar(10, 0, 10);
		System.out.println(Ejercicio01_stringfromarray.stringFromArray(numeros));

	}
	public static String stringFromArray (int numeros[]) {
		String cad = " ";
		for (int i = 0; i < numeros.length; i++) {
			cad += " "+numeros[i];
		}
		
		return cad;
		
	}
	
}
