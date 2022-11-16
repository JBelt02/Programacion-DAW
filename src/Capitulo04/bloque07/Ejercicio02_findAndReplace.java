package Capitulo04.bloque07;

import java.util.Scanner;

import Utils.arrays;

public class Ejercicio02_findAndReplace {

	public static void main(String[] args) {
		int[] numeros = arrays.creaArrayNumerosAzar(10, 0, 10);
		arrays.mostrarArray(numeros);
		Ejercicio02_findAndReplace.findAndReplace(numeros, 5, 6);
		arrays.mostrarArray(numeros);
	}
	public static void findAndReplace (int numeros[] , int num , int reemp ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el valor a buscar");
		num = sc.nextInt();
		System.out.println("Introduzca el valor a reemplazar");
		reemp = sc.nextInt();
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				numeros[i] = reemp;
			}
		}
	}
}
