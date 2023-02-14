package Examenes.examen20230214;

import java.util.Scanner;

public class Ejercicio03_PideString {

	public static void main(String[] args) {
		/**
		 * pedimos la frase al usuario
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca frase: ");
		String frase = sc.nextLine();
		
		int mayusc = 0;
		int minusc = 0;
		int digit = 0;
		int noAlfa = 0;
		/**
		 * Comparamos cada caracter de la frase para comprobar si son mayusculas , minusculas o digitos 
		 */
		String palabras[] = frase.split("[ ]+");
		for (String string : palabras) {
			for(int i = 0; i < string.length(); i++) {
				if (Character.isUpperCase(string.charAt(i))) {
					mayusc += 1;
				} 
				if (Character.isLowerCase(string.charAt(i))) {
					minusc += 1;
				}
				if (Character.isDigit(string.charAt(i))) {
					digit += 1;
				}
				if (!Character.isLetterOrDigit(string.charAt(i))) {
					noAlfa += 1;
					if(noAlfa == 3) {
						System.out.println(string);
						noAlfa = 0;
					}
				}
			}
				
			}
		/**
		 * mostramos en pantalla la cantidad de caracteres 
		 */
		System.out.println("La frase tiene una cantidad de mayusculas de : "+mayusc+" De minusculas : "+minusc+" Y de digitos: "+digit);
		}
	}


