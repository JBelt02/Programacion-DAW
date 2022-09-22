package Caputilo02.bloque01;

import java.util.Scanner;

public class ejercicio03_MayorQue5Variables {

		public static void main (String args) {
			int mayor = 0 ;
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
			
			if(num1>num2 & num2>num3 & num3>num4 & num4>num5) {
				 mayor = num1;
				
			}else if(num1<num2 & num2>num3 & num3>num4 & num4>num5) {
				 mayor = num2;
				
			}else if(num1<num2 & num2<num3 & num3>num4 & num4>num5) {
				 mayor = num3;
				
			}else if(num1<num2 & num2<num3 & num3<num4 & num4>num5) {
				 mayor = num4;
				
			}else if(num1<num2 & num2<num3 & num3<num4 & num4<num5) {
				 mayor = num5;
			}
			System.out.println("El numero mayor es "+mayor);
		}
}
