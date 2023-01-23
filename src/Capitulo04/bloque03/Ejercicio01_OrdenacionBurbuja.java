package Capitulo04.bloque03;

public class Ejercicio01_OrdenacionBurbuja {

	public static void main(String[] args) {
		int i = 0 ;
		int j = 0 ;
		int aux = 0 ;
		boolean band = true;  
		int[] numeros = new int[150];
		
		System.out.println("Lista sin ordenar ");
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random()*1000);
			System.out.print("  "+ numeros[x]);
		}
		
		while(band) {
			band = false;
			for(i = 0 ; i < numeros.length - 1 ; i++) {
				if(numeros[i] > numeros[i + 1]) {
					aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
					band = true;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("El array ordenado : ");
		while(j < numeros.length) {
			System.out.print("  " + numeros[j]);
			j++;
		}
	}

}
