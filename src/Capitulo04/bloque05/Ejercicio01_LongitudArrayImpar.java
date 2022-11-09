package Capitulo04.bloque05;

import Utils.arrays;

public class Ejercicio01_LongitudArrayImpar {

	public static void main(String[] args) {
		int posmed = 0 ; 
		int pos = 0 ; 
		int[] numeros = arrays.creaArrayNumerosAzar((int) (Math.random()*100), 0, 100);
		arrays.mostrarArray(numeros);
		if(arrays.compruebaimpar(numeros)==0) {
			System.out.println("La longitud es impar ");
			pos = numeros.length ;
			posmed = pos / 2;
			System.out.println("El valor que se encuentra en la posicion media es "+numeros[posmed]);
		}else {
			System.out.println("La longitud es par ");
		}
	}

}
