package Capitulo01.bloque01;

import java.util.Scanner;

/*
 * 
 * 
 * 
 */

public class ejercicio01_PedirNumeros {

public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero :");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero flotante :");
		float num2 = sc.nextFloat();
		System.out.println("Introduzca un numero doble :");
		double num3 = sc.nextDouble();
		
		System.out.println("Los numeros son :" +num1+" El flotante "+num2+" el numero doble "+num3);
	}
}
