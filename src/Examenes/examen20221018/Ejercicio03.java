package Examenes.examen20221018;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Declaracion de varialbes y del Scanner si es necesario
		 * 
		 * */
		int num = 0;
		int cont = 0;
		
		/*
		 * Mediante el bucle while se encarga de que solo se generen 10 numeros en total 
		 * los if se encargan de que los numeros que se generen aleatoriamente solo se muestren los que se encuentran
		 * entre 20-30 y 40-50 y los muestra
		 * */
		while(cont < 10) {	
			num = (int) (Math.random()*100);
			if(num % 2 == 0) {
				if(num >= 20 & num <= 30) {
					System.out.println("el numero es "+num);
					cont++;
				}
				if(num >= 40 & num <= 50) {
					System.out.println("el numero es "+num);
					cont++;
				}
			}
			
			
		}

	}

}
