package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio02_PedirNumerosYVerAlInstante {

		public static void main (String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero entero :");
			int num1 = sc.nextInt();
			System.out.println("El numero introducido es : "+num1);
			System.out.println("Introduzca un numero flotante :");
			float num2 = sc.nextFloat();
			System.out.println("El numero introducido es : "+num2);
			System.out.println("Introduzca un numero doble :");
			double num3 = sc.nextDouble();
			System.out.println("El numero introducido es : "+num3);
		} 
}
