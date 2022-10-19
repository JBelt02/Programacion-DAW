package Capitulo04.bloque02;

public class Ejercicio02_3ArraysYParesEImpares {

	public static void main(String[] args) {
		int[] Numeros=new int[150];
		int[] Numeros2=new int[150];
		int[] Numeros3=new int[150];
		int num = 0;
		int num2 = 0;
		int impar = 0;
		int par = 0 ;
		int i = 0;
		
		System.out.println("Lista 1");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros[x] = (int) (Math.random()*100);
			num = Numeros[x];
			System.out.println(Numeros[x]);
			if(x%2!=0) {
				impar = num;
				Numeros3[x]=impar;
			}
		}
		System.out.println("Lista 2");
		for (int x = 0; x < Numeros.length; x++) {
			Numeros2[x] = (int) (Math.random()*100);
			num2 = Numeros2[x];
			System.out.println(Numeros2[x]);
			if(x%2==0) {
				par = num2;
				Numeros3[x]=par;
			}
		}
		System.out.println("Lista 3 (List 1 + List 2)");
		while(i < 150) {
			System.out.println(" " + Numeros3[i]);
			i++;
		}
	}
}
