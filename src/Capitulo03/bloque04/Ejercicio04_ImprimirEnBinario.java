package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio04_ImprimirEnBinario {

	public static void main(String[] args) {
	/*  Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero para cambiarlo a binario ");
		int num = sc.nextInt();
		
		String binario = Integer.toBinaryString(num);
		
		System.out.println("El numero en binario es "+binario);

	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero para cambiarlo a binario ");
		int num = sc.nextInt();
		int masc = 128;
		while(masc>0) {
			if((num&masc)==0) {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
			masc = masc / 2;
		}
	
		
	}
}