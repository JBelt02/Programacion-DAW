package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio04_NumerosHasta0YPositivosYNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num ;
		int i ;
		int pos = 0 ;
		int neg = 0 ;
		
		for (i=1;i!=0;++i) {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();  
			if( num == 0) {
				break;
			}
			if (num>0) {
				++pos;
			}
			if (num<0) {
				++neg;
			}
		}
		System.out.println("La cantidad de numeros positivos son : "+pos+" \nY la de negativos es : "+neg);
	}

}
