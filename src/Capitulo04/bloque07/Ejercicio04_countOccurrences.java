package Capitulo04.bloque07;

import java.util.Scanner;

import Utils.arrays;

public class Ejercicio04_countOccurrences {

	public static void main(String[] args) {
		int[] numeros = arrays.creaArrayNumerosAzar(10, 0, 10);
		arrays.mostrarArray(numeros);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor que desea contabilizar ");
		int num = sc.nextInt();
		System.out.println("La cantidad de veces que aparece es valor es de "
				+Ejercicio04_countOccurrences.countOccurrences(numeros, num));

	}
	public static int countOccurrences (int numeros[] , int num) {
		int cont = 0 ;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				cont++;
			}
		}
		return cont;
	}

}
