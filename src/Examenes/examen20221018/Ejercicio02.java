package Examenes.examen20221018;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		/*
		 * Declaracion de varialbes y del Scanner si es necesario y lectura de datos
		 * 
		 * */
		int num = 0 ;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer limite ");
		int limit1 = sc.nextInt();
		System.out.println("Introduzca el segundo limite (negativo)");
		int limit2 = sc.nextInt();
		
		/*
		 * Comprueba si el limite inferior introducido es negativo y se encarga de que siempre lo sea
		 * pidiendo en caso de que no lo sea que vuelva a introducirlo 
		 * */
		while(limit2 > 0) {
			if (limit2 > 0) {
				System.out.println("Has introducido el primer limite positivo");
			}
			System.out.println("Introduzca de nuevo el limite");
			limit2 = sc.nextInt();
		}
		/*
		 * Mediante un bucle genera los numeros aleatorios comprendidos entre los dos limites introducidos anteriormente
		 * */
		while(cont < 10) {	
			
			num = (int) (Math.random() * (limit2) + limit1);
			System.out.println("El numero es "+ num);
			
			cont++;
			}
		}
}
