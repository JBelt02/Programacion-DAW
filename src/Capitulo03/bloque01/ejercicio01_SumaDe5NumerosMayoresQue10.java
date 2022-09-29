package Capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio01_SumaDe5NumerosMayoresQue10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero :");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero :");
		int num2 = sc.nextInt();
		System.out.println("Introduzca un numero :");
		int num3 = sc.nextInt();
		System.out.println("Introduzca un numero :");
		int num4 = sc.nextInt();
		int sum = 0 ;
		int numf1 = 0;
		int numf2 = 0 ; 
		int numf3 = 0 ;
		int numf4 = 0;
		int sumf=0;
		
		if (num1>10) {
			 numf1 = num1;
		}
		if (num2>10) {
			 numf2 = num2;
		}
		if (num3>10) {
			 numf3 = num3;
		}
		if (num4>10) {
			 numf4 = num4;
		}
		
		for (int i=0;i<=1;++i) {
			
			 sumf = sum+numf1+numf2+numf3+numf4;
		}
		System.out.println("La suma de los numeros es "+sumf );
	}

}
