package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio05_FactorialDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzc un numero para calcular su factorial ");
		int num = sc.nextInt();
		int fact = 1 ;
		int resf1=0;
		
		while(fact < num) {
			if(fact == 1) {
				resf1 = num * fact;
		
			}
			resf1 *= fact;
			++fact;
		}
		System.out.println("El factorial de "+num+" es "+resf1);
	}

}
