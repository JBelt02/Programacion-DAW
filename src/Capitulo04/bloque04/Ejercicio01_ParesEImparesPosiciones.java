package Capitulo04.bloque04;

import Utils.arrays;

public class Ejercicio01_ParesEImparesPosiciones {
	public static void main (String args[]) {
		int[] numeros = arrays.creaArrayNumerosAzar(20, 0, 100);
		int[] numeros2 = new int[20];
		int i = 0 ; 
		int aux = 0 ;
		boolean cambios = true ; 
		
		System.out.println("Lista sin cambios ");
		arrays.mostrarArray(numeros);
		
		for (i = 0; i < numeros.length; i++) { 
			while(cambios) {
				cambios = false ; 
				if(numeros[i] % 2 == 0) {
					aux = numeros[i];
					if(numeros2[i] == 0) {
						numeros2[i] = aux ;
						cambios = true ; 
					}else if (numeros2[i] != 0) {
						
					}
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Lista ordenada");
		System.out.println(" ");
		arrays.mostrarArray(numeros);
		
	}
}
