package Capitulo07.bloque01;

public class Ejercicio03_100nºEnHexadecimal {

	public static void main(String[] args) {
		for(int x = 0 ;x < 100; ++x) {
			String hexadecimal = Integer.toHexString(x);
			System.out.println(hexadecimal + " ");
		}

	}

}
