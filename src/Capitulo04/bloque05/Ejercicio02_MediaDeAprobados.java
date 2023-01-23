package Capitulo04.bloque05;

import Utils.arrays;

public class Ejercicio02_MediaDeAprobados {

	public static void main(String[] args) {
		int[] numeros = arrays.creaArrayNumerosAzar(20, 0, 10);
		arrays.mostrarArray(numeros);
		
		System.out.println("La media de suspensos es : "+arrays.consiguemediasusp(numeros)+" Y la de aprobados es"
				+ ": "+arrays.consiguemedaprobados(numeros));
		

	}

}
