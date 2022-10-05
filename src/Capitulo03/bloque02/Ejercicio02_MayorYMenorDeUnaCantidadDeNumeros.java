package Capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorDeUnaCantidadDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos Numeros quiere ?");
		int cont = sc.nextInt();
		int num=0;
		int mayor ;
		int menor ;

		
		System.out.println("Introzuca un numero");
		num = sc.nextInt();
		mayor = num;
		menor = num;
		
		for (int i=0;i<(cont-1);++i) {
			System.out.println("Introzuca un numero");
			num = sc.nextInt();

			if(num>mayor) {
				mayor = num ; 
			}
			if(num<menor){
				menor = num;
			}
		}
		System.out.println("De los numeros introducidos el mayor es : "+mayor+"// Y el menor es : "+menor);

	}

}
