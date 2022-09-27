package Capitulo02.bloque02;

import java.util.Scanner;

public class ejercicio01_SumaDe5 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero : ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num2 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num3 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num4 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num5 = sc.nextInt();
		int suma = 0;
		
		if(num1<0) {
			int neg1=0 ;
			num1=neg1 ; 
		}else if(num1>=0 && num1<=25) {
			int baj1=0;
			num1=baj1;
		}else if (num1>=26 && num1<=250) {
			int med1=0;
			num1=med1;
		}else if (num1>250) {
			int grand1=0;
			num1=grand1;
		}
		
		switch (suma) {
		case 1 :
		}
	}
}
