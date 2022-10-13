package Capitulo04.bloque01;

public class Ejercicio01_150ElementosYSumaMediaMenorYMayor {

	public static void main(String[] args) {
		
		int[] Numeros=new int[150];
		int i =0;
		int o=0;
		int numero;
		int suma=0 ; 
		
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
		}
		System.out.println("La lista de numeros del array es :");
		
		while(i < 150) {
			System.out.println(" " + Numeros[i]);
			i++;
		}
		for( o = 0; o < Numeros.length; o++){
	        numero = Numeros[o];
	        suma += numero;
	    }
		System.out.println("La suma de los elementos del array es "+suma);
		
		int mayor = Numeros[0];
		for (int x = 1; x < Numeros.length; x++) {
			if (Numeros[x] > mayor) {
				mayor = Numeros[x];
			}
		}
		System.out.println("El mayor de los numeros es "+mayor);
		
		int menor = Numeros[0];
		for (int x = 1; x < Numeros.length; x++) {
			if (Numeros[x] < menor) {
				menor = Numeros[x];
			}
		}
		System.out.println("El menor de los numeros es "+menor);
		System.out.println("La media de los numeros del array es "+(suma/Numeros.length));
	}
}
