package Capitulo04.bloque07;

import java.util.Scanner;

import Utils.arrays;

public class Ejercicio05_removeInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] numeros = arrays.creaArrayNumerosAzar(10, 0, 10);
		arrays.mostrarArray(numeros);
		
		System.out.println("Introduzca el valor a eliminar");
		int num = sc.nextInt();
		
		arrays.mostrarArray(Ejercicio05_removeInteger.removeInteger(numeros, num));

	}
	public static int[] removeInteger (int numeros[] , int num ) {
		int[] numeros2 = new int[numeros.length-Ejercicio04_countOccurrences.countOccurrences(numeros, num)];
		int j = 0 ;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] != num) {
				numeros2[j] = numeros[i];
				j++;
			}
		}
		return numeros2;
	}		
}


