package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio02_IntroducirNumerosHasta0YMayorYMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		int cont ;
		int mayor ;
		int menor ;
		
		System.out.println("Introduzca un numero");
		int num = sc.nextInt();
		mayor = num;
		menor = num;
		
		for (i=1;i!=0;++i) {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
			if(num>mayor && num!=0) {
				mayor = num ; 
			}
			if(num<menor && num!=0){
				menor = num;
			}  
			if( num == 0) {
				break;
			}
		}
		System.out.println("De los numeros introducidos el mayor es : "+mayor+" \nY el menor es : "+menor);
	}

}
