package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio01_ComprobarSiEsPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i=0 ;
		
		do{
			System.out.println("Introduzca un numero : ");
			int num = sc.nextInt();
			if(num % num == 0 && num % 1 == 0 && num % 2 != 0) {
				System.out.println("El numero es primo ");
			}else {
				System.out.println("El numero es compuesto ");
			}
			i++;
		}while(i <= 0);
	}

}
