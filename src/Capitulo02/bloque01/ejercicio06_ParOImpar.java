package Capitulo02.bloque01;

import java.util.Scanner;

public class ejercicio06_ParOImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero :");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("El numero es par ");
		}else {
			System.out.println("El numero es impar ");
		}

	}

}
