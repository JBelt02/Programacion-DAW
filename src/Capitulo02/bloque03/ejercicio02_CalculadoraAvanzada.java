package Capitulo02.bloque03;

import java.util.Scanner;

public class ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-Raices :");
		System.out.println("2-Potencias :");
		System.out.println("3-Modulo de Divison :");
		System.out.println("¿Que desea realizar?");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1 :
			
			System.out.println("Introduzca su primer numero :");
			int num1=sc.nextInt();
			System.out.println("Introduzca la base de la raiz :");
			int base=sc.nextInt();
			float raiz =  (float) Math.pow(num1, ((float)1/base));
			System.out.println("La solucion es "+raiz);
			break;
			
		case 2 :
			
			System.out.println("Introduzca su primer numero :");
			int num2=sc.nextInt();
			System.out.println("Introduzca la potencia  :");
			int pot=sc.nextInt();
			float potencia = (float) Math.pow(num2, pot);
			System.out.println("El resultado es "+potencia);
			break;
			
		case 3 :
			
			System.out.println("Introduzca el dividendo :");
			int num3=sc.nextInt();
			System.out.println("Introduzca el divisor :");
			int num4=sc.nextInt();
			double mod=num3%num4;
			System.out.println("El resultado es :"+mod);
			break;
		}
		
		

	}

}
