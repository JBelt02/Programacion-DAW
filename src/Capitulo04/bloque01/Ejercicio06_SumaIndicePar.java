package Capitulo04.bloque01;

public class Ejercicio06_SumaIndicePar {

	public static void main(String[] args) {
		int suma = 0;
		int[] Numeros=new int[150];
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
			int numero = Numeros[x];
			if (x%2==0) {
				suma +=numero;
			}
		}
		System.out.println("La suma de elementos cuyo indice es par es : "+suma);
	}

}
