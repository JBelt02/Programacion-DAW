package Capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio01_MediaDeUnaCantidadDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos Numeros quiere ?");
		int cont = sc.nextInt();
		int sum = 0 ;
		for (int i=0;i<cont;++i) {
			System.out.println("Introzuca un numero");
			int num = sc.nextInt();
			sum += num;
		} 
		System.out.println("La media de los numeros introducidos es : "+((float)sum/cont));
	}

}
