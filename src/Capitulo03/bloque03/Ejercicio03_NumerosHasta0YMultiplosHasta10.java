package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio03_NumerosHasta0YMultiplosHasta10 {

	public static void main(String[] args) {
		int num;
		int i ;
		Scanner sc = new Scanner (System.in);
		for (i=1;i!=0;++i) {
			System.out.println("\nIntroduzca un numero");
			num = sc.nextInt();
			if( num == 0) {
				System.out.println("Has finalizado ");
				break;
			}
			for( i = 0; i<=10; i++) {
				System.out.println("Multiplos de : "+num+ " son: " + (i * num));
			}

		
		}

	}

}
