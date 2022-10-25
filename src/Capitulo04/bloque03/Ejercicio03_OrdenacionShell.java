package Capitulo04.bloque03;

public class Ejercicio03_OrdenacionShell {

	public static void main(String[] args) {
		int[] numeros = new int[150];
		int o = 0 ;
		
		System.out.println("Lista sin ordenar ");
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random()*1000);
			System.out.print("  "+ numeros[x]);
		}
		
		
		
		System.out.println(" ");
		System.out.println("El array ordenado : ");
		while( o < numeros.length) {
			System.out.print("  " + numeros[o]);
			o++;
		}

	}

}
