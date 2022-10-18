package Examenes.examen20221018;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Declaracion de varialbes y del Scanner si es necesario y lectura de datos
		 * 
		 * */
		int cont =0;
		int num02 = 0;
		float num03 = 0 ;
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero de una sola cifra ");
		int num01 = sc.nextInt();
		
		/*
		 * el while se encarga que el maximo de numeros creados sea de 100 y luego dentro 
		 * tendremos que comprobar si el numero introducido anteriormente y el que crea tienen la misma
		 * ultima cifra dejando los 2 numeros en 0,X y comparandolos 
		 * */
		while(cont < 100) {	
			
			num02 = (int) (Math.random()*100);
			num03 = (float)num02 / (float)10;
			aux = (int)num02 / (int)10;
			num03 -= aux;
			if((float)num01 / (float)10 == num03) {
				System.out.println("El numero con misma terminacion es "+num02);
			}
			
			cont++;
		}

	}

}
