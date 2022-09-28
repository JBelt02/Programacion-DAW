package Capitulo02.bloque03;

import java.util.Scanner;

public class ejercicio04_ContadorDeMonedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el Importe de Compra: ");
		int comp = sc.nextInt();
		System.out.println("Introduzca la cantidad pagada");
		int pag = sc.nextInt();
		int valor = pag-comp;
		
		int cont100 = valor/100;
		int modul1 = valor%100;
		int cont50 = modul1/50;
		int modul2 = modul1%50;
		
		
		if ((valor%100)!=0) {
			
			
		}

	}

}
