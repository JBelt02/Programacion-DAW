package Capitulo04.bloque07;

import java.util.Scanner;

import Utils.arrays;

public class Ejercicio03_addInteger {

	public static void main(String[] args) {
		int num = 0 ;
		int[] numeros = arrays.creaArrayNumerosAzar(10, 0, 10);
		arrays.mostrarArray(numeros);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor a añadir");
		num = sc.nextInt();
		arrays.mostrarArray(Ejercicio03_addInteger.addInteger(numeros, num));

	}
	public static int[] addInteger (int numeros[] , int num ) {
		int[] numeros2 = new int[numeros.length+1];
		numeros2[numeros2.length - 1] = num;
		int j = 0 ;
		for (int i = 0; i < numeros.length ; i++) {
				numeros2[i] = numeros[j];
				j++;
		}
		
		return numeros2;
		
	}

}
