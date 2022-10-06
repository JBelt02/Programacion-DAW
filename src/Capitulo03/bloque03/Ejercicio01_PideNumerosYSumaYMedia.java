package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio01_PideNumerosYSumaYMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0 ;
		int cont =0;
		int i;
		for (i=1;i!=0;++i) {
			System.out.println("Introduzca un numero");
			int num = sc.nextInt();
			 sum += num ;
			 cont = i;  
			if( num == 0) {
				break;
			}
		}
		System.out.println("El valor de la suma es "+sum+"\n El valor de la media es "+((float)sum/cont-1));

	}

}
