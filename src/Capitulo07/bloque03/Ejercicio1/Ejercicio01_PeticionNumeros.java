package Capitulo07.bloque03.Ejercicio1;

import java.util.Scanner;


public class Ejercicio01_PeticionNumeros {

	public static void main(String[] args) {
		try {
			pideNumeroPar();
		} catch (NumeroNoParException e) {
			System.out.println("El numero introducido no es par ");
		}

	}
	private static void pideNumeroPar() throws NumeroNoParException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero Par");
		int num = sc.nextInt();
		
		if(num%2!=0) {
			throw new NumeroNoParException("El numero no es par ");
		}else {
			System.out.println("El numero es Par");
		}
		
		
	}

}
