package Capitulo03.bloque02;

import java.util.Scanner;

public class Ejercicio02_MayorYMenorDeUnaCantidadDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos Numeros quiere ?");
		int cont = sc.nextInt();
		int mayor = 0;
		int menor = 0;
		for (int i=0;i<cont;++i) {
			System.out.println("Introzuca un numero");
			int num = sc.nextInt();
			if(num>mayor) {
				mayor = num ; 
			}else {
				menor = num ; 
			}
		}
		System.out.println("De los numeros introducidos el mayor es : "+mayor+"// Y el menor es : "+menor);

	}

}
