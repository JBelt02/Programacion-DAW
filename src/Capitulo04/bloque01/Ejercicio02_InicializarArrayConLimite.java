package Capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio02_InicializarArrayConLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Introduzca el primer limite del array ");
		int limit01 = sc.nextInt();
		System.out.println("Introduzca el segundo limite del array ");
		int limit02 = sc.nextInt();
		
		int[] Numeros=new int[150]; 
		
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*(limit02)+limit01);
		}
		System.out.println("La lista de numeros del array es :");
		while(i < 150) {
			System.out.println(" " + Numeros[i]);
			i++;
		}
	}

}
