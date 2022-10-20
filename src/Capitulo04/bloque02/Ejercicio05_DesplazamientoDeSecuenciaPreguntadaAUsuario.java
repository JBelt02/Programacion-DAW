package Capitulo04.bloque02;

import java.util.Scanner;

public class Ejercicio05_DesplazamientoDeSecuenciaPreguntadaAUsuario {

	public static void main(String[] args) {
		int[] Numeros = new int[5];
		int[] Numeros2 = new int[5];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas posiciones desea desplazarlo?");
		int desp = sc.nextInt();
		if(desp>5) {
			desp%=5;
		}
		
		System.out.println("Lista antes de desplazarla");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
			System.out.print("  "+Numeros[x]);
		}
/*		for(int x = 0 ; x < 5 ; ++x) {
			if (x < 3 & (x+desp)<Numeros.length) {
				Numeros2[x + desp] = Numeros[x];
			}
			if(x == 0 & (x + desp) >= Numeros2.length) {
				Numeros2[(0 + desp) - 5]= Numeros[0];
				
			}
			if(x == 1 & (x + desp) >= Numeros2.length) {
				Numeros2[(0 + desp) - 4]= Numeros[1];
				
			}
			if(x == 2 & (x + desp) >= Numeros2.length) {
				Numeros2[(0 + desp) - 3]= Numeros[2];
				
			}
			if(x == 3 & (x + desp) >= Numeros2.length) {
				Numeros2[(0 + desp) - 2] = Numeros[3];

			}
			if(x == 4 & (x + desp) >= Numeros2.length) {
				Numeros2[(0 + desp) - 1]= Numeros[4];
				
			}
		}
		System.out.println(" ");
		System.out.println("Lista Con el numero desplazado");
		while(i < 5) {
			System.out.print("  " + Numeros2[i]);
			i++;
		}
*/
		
		for(int j=0+desp; j<Numeros.length;j++)
		{
			Numeros2[j]= Numeros[j-desp];
		}
		
		for(int j=0;j<Numeros2.length;j++)
		{
			System.out.print(Numeros2[j]);
		}
	}

}


