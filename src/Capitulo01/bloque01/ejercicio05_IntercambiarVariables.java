package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio05_IntercambiarVariables {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero :");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero :");
		int num2 = sc.nextInt();
		System.out.println("Los valores de las dos variables son num1: "+num1+ " y de la segunda variable num2: "+num2);
		int num3 = num2 ; 
		num2=num1;
		num1=num3;
		System.out.println("Los valores de las dos variables son num1: "+num1+ " y de la segunda variable num2: "+num2);
	}
}
