package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio04_MediaDeNumeros {

	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero :");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero entero :");
		int num2 = sc.nextInt();
		System.out.println("Introduzca un numero entero :");
		int num3 = sc.nextInt();
		
		int media = (num1+num2+num3)/3;
		System.out.println("La media de los numeros es :"+media);
	}
}
