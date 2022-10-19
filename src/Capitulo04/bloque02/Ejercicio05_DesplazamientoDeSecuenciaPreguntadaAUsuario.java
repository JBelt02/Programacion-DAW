package Capitulo04.bloque02;

import java.util.Scanner;

public class Ejercicio05_DesplazamientoDeSecuenciaPreguntadaAUsuario {

	public static void main(String[] args) {
		int[] Numeros = new int[5];
		int ultimo = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas posiciones desea desplazarlo?");
		int desp = sc.nextInt();
		
		System.out.println("Lista antes de desplazarla");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
			System.out.print("  "+Numeros[x]);
		}
		for(i=0;i>=desp;++i) {
			ultimo = Numeros[Numeros.length-1];
			for(i=Numeros.length-1; i>0; i--){
	            Numeros[i]=Numeros[i-1];
	        }
			i++;
		}
		Numeros[0] = ultimo ;  
		
		System.out.println(" ");
		System.out.println("Lista Con el numero desplazado");
		while(i < 5) {
			System.out.print("  " + Numeros[i]);
			i++;
		}
		System.out.println(Numeros[0]);
	}

}


