package Examenes.examen20221018;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Declaracion de varialbes y del Scanner si es necesario
		 * 
		 * */
		int num = 0;
		int cont = 0;
		int x = 1;
		/*
		 * El while se encargara de que solo se generen 10 numeros y dentro mediante otro while y un if
		 * tendremos que comprobar cuales son sus 
		 * divisores y mostrarlos   
		 * */
		while(cont < 10) {	
			
			num = (int) (Math.random() * 100);
			System.out.println("El numero es "+num+" //");
			while(num != x) {
				if(num % x == 0) {
					System.out.println(x+" Es divisor de "+num);
					
				}
				x++;
			}
			x = 1;
			cont++;
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println("Obviamos que todos los numeros son divisibles por ellos mismos");
		System.out.println("----------------------------------------------------------------");

	}

}
