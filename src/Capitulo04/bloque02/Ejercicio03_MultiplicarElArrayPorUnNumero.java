package Capitulo04.bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplicarElArrayPorUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Numeros=new int[150];
		int numero = 0;
		int i = 0;
		
		System.out.println("Introduzca el numero por el que desea multiplicar ");
		int num = sc.nextInt();
		
		System.out.println("Lista Sin Cambiar");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
			System.out.println(Numeros[x]);
			numero = Numeros[x];
			numero *=num;
			Numeros[x]=numero;
		}
		
		System.out.println("Lista Con el numero Multiplicado");
		while(i < 150) {
			System.out.println(" " + Numeros[i]);
			i++;
		}
		
	}

}
