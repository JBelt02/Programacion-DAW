package Capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplosDeUnNumero {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduzca un numero ");
		int num = sc.nextInt();	
		
		for (int i = 0; (i * num) < 100; i++) {
			System.out.println("Multiplos de : "+num+ " son: " + (i * num));
		}
	}
}
