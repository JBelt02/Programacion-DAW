package Capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio02_ElUsusarioPidaLosNumerosQueQuiera {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sumf=0;
		System.out.println("¿Cuantos Numeros quiere ?");
		int cont = sc.nextInt();
		for (int i=0;i<cont;++i) {
			System.out.println("Introzuca un numero");
			int num = sc.nextInt();
			 if(num>=10) {
				 sumf += num; 
			 } 
		}
		System.out.println("La suma de los numeros es "+sumf );
	

	}

}
