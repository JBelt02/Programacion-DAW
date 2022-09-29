package Capitulo02.bloque03;

import java.util.Scanner;

public class ejercicio04_ContadorDeMonedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el Importe de Compra: ");
		int comp = sc.nextInt();
		System.out.println("Introduzca la cantidad pagada");
		int pag = sc.nextInt();
		int valor = comp-pag;
		
		int cont100 = valor/100;
		int modul1 = valor%100;
		int cont50 = modul1/50;
		int modul2 = modul1%50;
		int cont25 = modul2/25;
		int modul3 = modul2%25;
		int cont5 = modul3/5;
		int modul4=modul3%5;
		int cont1= modul4/1;
		int modul5 = modul4%1;
		
		System.out.println("El cambio es : "+valor);
		System.out.println("Las monedas se dividiran en : De 100 : "+cont100+" // De 50 : " +cont50+" // De 25 : "+cont25+" // De 5 : "+cont5+" // De 1 : "+cont1 );

	}

}
