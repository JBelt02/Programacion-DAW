package Capitulo04.bloque03;

import Utils.arrays;

public class Ejercicio04_OrdenacionSeleccion {

	public static void main(String[] args) {
		int[] numeros = arrays.creaArrayNumerosAzar(150, 0, 1000);
		int menor = 0 ; 
		int i = 0 ; 
		int j = 0; 
		int aux = 0 ;
		System.out.println("Lista sin ordenar");
		System.out.println(" ");
	
		arrays.mostrarArray(numeros);
		
		for (i = 0 ; i < numeros.length - 1; i++) {
			menor = i ; 
			for(j = i + 1; j < numeros.length ; j++) {
				if (numeros[j] < numeros[menor]) {
					menor = j ; 
				} 
				aux = numeros[i];
				numeros[i] = numeros[menor];
				numeros[menor] = aux ; 
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Lista con cambios");
		System.out.println(" ");
		arrays.mostrarArray(numeros);

	}

}
