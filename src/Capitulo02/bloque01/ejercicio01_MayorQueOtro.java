package Capitulo02.bloque01;

import java.util.Scanner;

public class ejercicio01_MayorQueOtro {

	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("Introduzca un numero : ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println("El "+num1+" es mayor");
		}else {
			System.out.println("El "+num2+" es mayor");
		}
			
		
	}
}