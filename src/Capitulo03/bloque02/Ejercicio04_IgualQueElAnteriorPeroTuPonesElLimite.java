package Capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio04_IgualQueElAnteriorPeroTuPonesElLimite {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduzca un numero ");
		int num = sc.nextInt();
		System.out.println("Introduzca el limite de los multiplos");
		int limit = sc.nextInt();
		
		for (int i = 0; (i * num) < limit; i++) {
			System.out.println("Multiplos de : "+num+ " son: " + (i * num));
		}
	}
}
