package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio06_CalculoCuotaMensual {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el capital del prestamo :");
		double cap = sc.nextDouble();
		System.out.println("Introduzca el numero de plazos:");
		double plaz = sc.nextDouble();
		System.out.println("Introduzca el diferencial del banco:");
		double dif = sc.nextDouble();
		System.out.println("Introduzca el Euribor: ");
		double eur = sc.nextDouble();
		
		double CalcIntAnual = eur+dif;
		double lm = (CalcIntAnual/12)/100;
		double operac = Math.pow(1+lm, plaz);
		double CuotaMensual = (lm*operac)/(operac-1);

	}

}
