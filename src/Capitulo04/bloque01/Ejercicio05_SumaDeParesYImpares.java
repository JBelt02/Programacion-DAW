package Capitulo04.bloque01;

public class Ejercicio05_SumaDeParesYImpares {
	public static void main (String args[]) {
		int[] Numeros=new int[150];
		int numero ;
		int sumapar = 0 ;
		int sumaimpar = 0 ;
		int o = 0;
		
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
		}
		
		for( o = 0; o < Numeros.length; o++){
	        numero = Numeros[o];
	        if(numero%2==0) {
	        	sumapar += numero;
	        }else {
	        	sumaimpar += numero;
	        }
	    }
		System.out.println("La suma de numeros pares es : "+sumapar+"\nY la suma de numeros impares es : "+sumaimpar);
	}
}
