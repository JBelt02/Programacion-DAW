package Capitulo04.bloque01;

public class Ejercicio03_ImprimirArrayOrdenInverso {

	public static void main(String[] args) {
		
		int[] Numeros=new int[150];
		int i = 149;
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
		}
		System.out.println("La lista de numeros del array es :");
		while(Numeros.length>=i) {
			if(i!=0){
			System.out.println(" " + Numeros[i]);
			--i;
			}
		}
	}

}
