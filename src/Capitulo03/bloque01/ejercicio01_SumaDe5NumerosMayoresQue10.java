package Capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio01_SumaDe5NumerosMayoresQue10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sumf=0;
		for (int i=0;i<4;++i) {
			System.out.println("Introzuca un numero");
			int num = sc.nextInt();
			 if(num>=10) {
				 sumf += num; 
			 } 
		}
		System.out.println("La suma de los numeros es "+sumf );
	}

}
