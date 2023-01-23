package Capitulo04.bloque03;

import Utils.arrays;

public class Ejercicio03_OrdenacionShell {

	public static void main(String[] args) {
		int i = 0 ;
		int aux = 0;
		int salto = 0 ;
		boolean band ;
		int[] numeros = arrays.creaArrayNumerosAzar(150, 0, 1000);
		System.out.println("Lista sin ordenar ");
		System.out.println(" ");
		arrays.mostrarArray(numeros);
		
		for (salto = numeros.length / 2 ; salto != 0; salto /= 2) {
			band = true; 
			while(band) {
				band = false ;  
				for (i = salto ; i < numeros.length; i++) {
					if(numeros[i - salto] < numeros[i]) {
						aux = numeros [i];
						numeros[i] = numeros [i - salto]; 
						numeros[i - salto] = aux ;  
						band = true ; 
					}
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("El array ordenado : ");
		System.out.println(" ");
		arrays.mostrarArray(numeros);

	}

}
