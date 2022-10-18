package Examenes.examen20221018;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Declaracion de varialbes y del Scanner si es necesario
		 * 
		 * */
		int num = 0 ;
		int cont = 0;
		int mult = 0;
		int imp = 0;
		/*
		 * Creacion del bucle el cual para en cuanto el contador llegue a 10
		 * y se encarga de comparar los numeros creados aleatoriamente para saber 
		 * si son multiplos de 5 y si son impares
		 * */
		while(cont < 10) {	
		
			num = (int) (Math.random()*100);
			System.out.println("El numero es "+num);
			if(num % 5 == 0) {
				mult += num ;   
			}    
			if(num % 2 != 0) {
				imp += num;
			}
			cont++;
		}
		/*
		 * Salida del programa el cual muestra la suma de los multiplos de 5 y realiza la media de los impares
		 * */
		System.out.println("La suma de multiplos de 5 es : "+mult+" La media de numeros impares es: "+(imp/10));
	}
		

}
