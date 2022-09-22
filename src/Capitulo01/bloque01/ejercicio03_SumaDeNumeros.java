package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio03_SumaDeNumeros {

		public static void main (String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero entero :");
			int num1 = sc.nextInt();
			System.out.println("Introduzca un numero flotante :");
			float num2 = sc.nextFloat();
			System.out.println("Introduzca un numero doble :");
			double num3 = sc.nextDouble();
			
			double sum = num1+num2+num3;
			System.out.println("La suma es :"+sum);
		}
}
