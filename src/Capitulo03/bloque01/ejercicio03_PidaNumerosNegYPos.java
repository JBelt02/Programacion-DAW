package Capitulo03.bloque01;

import java.util.Scanner;

public class ejercicio03_PidaNumerosNegYPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos Numeros quiere ?");
		int cont = sc.nextInt();
		int pos =0 ;
		int neg = 0;
		for (int i=0;i<cont;++i) {
			System.out.println("Introzuca un numero");
			int num = sc.nextInt();
			 if (num>0) {
				 ++pos ;
			 }else if(num<0) {
				 ++neg; 
			 }else  {
				 System.out.println("Se ha introducido 0 , no cuenta ");
			 }
		} 
		
		System.out.println("Hay numeros positivos : "+pos+" // Y negativos : "+neg);
	}

}
