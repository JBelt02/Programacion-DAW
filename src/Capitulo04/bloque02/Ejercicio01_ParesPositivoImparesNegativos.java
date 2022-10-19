package Capitulo04.bloque02;

public class Ejercicio01_ParesPositivoImparesNegativos {

	public static void main(String[] args) {
		int[] Numeros=new int[150];
		int i = 0;
		System.out.println("Lista sin los cambios ");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*(-99-100))+100;
			int numero = Numeros[x];
			System.out.println(Numeros[x]);
			if (numero % 2 == 0) {
				numero *= -1;
				Numeros[x]=numero;
			}
		}
		System.out.println("Lista con los cambios realizados");
		while(i < 150) {
			System.out.println(" " + Numeros[i]);
			i++;
		}
	}
}

