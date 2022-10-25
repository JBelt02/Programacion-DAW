package Capitulo04.bloque03;

public class Ejercicio02_OrdenacionInserccionDirecta {

	public static void main(String[] args) {
		int i = 0 ;
		int j = 0 ;
		int o = 0 ; 
		int aux = 0 ;
		int[] numeros = new int[150];
		
		System.out.println("Lista sin ordenar ");
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random()*1000);
			System.out.print("  "+ numeros[x]);
		}
		for(i = 1 ; i < numeros.length ; ++i) {
			aux = numeros[i];
			for(j = i ; j > 0 && numeros[j - 1] > aux; --j ) {
				numeros[j] = numeros[j - 1];
			}
			numeros[j] = aux;
		}
		
		
		
		
		System.out.println(" ");
		System.out.println("El array ordenado : ");
		while( o < numeros.length) {
			System.out.print("  " + numeros[o]);
			o++;
		}
	}

}
