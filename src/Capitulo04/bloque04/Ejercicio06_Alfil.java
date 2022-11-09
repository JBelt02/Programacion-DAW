package Capitulo04.bloque04;

import java.util.Scanner;

public class Ejercicio06_Alfil {

	public static void main(String[] args) {
		int xAlfil , yAlfil;
		int tablero[][] = Utils.arrays.creaEInicializaMatriz(0, 0, 0);
		
		System.out.println("Tablero de Ajedrez ");
		Utils.arrays.mostrarMatriz(tablero);
		
		Scanner sc = new Scanner(System.in);
	
		int limiteinf = 1 , limiteSup = 0;
		boolean datocorrecto = false ; 
		do {
			try {
				datocorrecto = true; 
				System.out.println("Introduzca la fila del alfil");
				yAlfil =sc.nextInt();
				if (yAlfil < limiteinf || yAlfil >limiteSup) {
					datocorrecto = false;
					System.out.println("ERROR , debes introducir un dato numerico entre "+limiteinf+ " y "+limiteSup);
				}
			}
			catch(Exception ex) {
				
			}
		}while(!datocorrecto);
	}

}
