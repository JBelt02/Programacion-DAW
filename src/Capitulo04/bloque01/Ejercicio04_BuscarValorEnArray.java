package Capitulo04.bloque01;

import java.util.Scanner;

public class Ejercicio04_BuscarValorEnArray {

	public static void main(String[] args) {
		int[] numeros = new int[150];
		boolean estaba = false ;
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random()*100);
		}
		
		System.out.println("Introduzca un valor a buscar ");
		int val = sc.nextInt();
		for(int x = 0 ; x < numeros.length; ++x) {
			if(numeros[x] == val) {
				System.out.println("El valor estaba en el array en la posicion "+x);
				estaba = true;
				break;
			}

		}
		if(!estaba) {
			System.out.println("El numero no estaba en el array ");
		}
	}

}
