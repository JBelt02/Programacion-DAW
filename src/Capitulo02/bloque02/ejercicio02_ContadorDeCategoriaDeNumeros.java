package Capitulo02.bloque02;

import java.util.Scanner;

public class ejercicio02_ContadorDeCategoriaDeNumeros {
public static void main (String args[]) {
		
		int baj1=0 , baj2=0 , baj3=0 , baj4=0 , baj5 = 0;
		int med1=0 , med2=0 , med3=0 , med4=0 , med5 = 0;
		int grand1=0 , grand2=0 , grand3=0 , grand4=0 , grand5 = 0;
		int contbaj=0 , contmed=0 , contgrand=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero : ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num2 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num3 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num4 = sc.nextInt();
		System.out.println("Introduzca un numero : ");
		int num5 = sc.nextInt();
		
		
		if(num1<0) {
			System.out.println("no se pueden introducir negativos");
			System.exit(0);
		}else if(num1>=0 && num1<=25) {
			baj1=num1;
			++contbaj;
		}else if (num1>=26 && num1<=250) {
			med1=num1;
			++contmed;
		}else if (num1>250) {
			grand1=num1;
			++contgrand;
		}
		
		if(num2<0) {
			System.out.println("no se pueden introducir negativos"); 
			System.exit(0);
		}else if(num2>=0 && num2<=25) {
			baj2=num2;
			++contbaj;
		}else if (num2>=26 && num2<=250) {
			med2=num2;
			++contmed;
		}else if (num2>250) {
			grand2=num2;
			++contgrand;
		}
		
		if(num3<0) {
			System.out.println("no se pueden introducir negativos");
			System.exit(0);
		}else if(num3>=0 && num3<=25) {
			baj3=num3;
			++contbaj;
		}else if (num3>=26 && num3<=250) {
			med3=num3;
			++contmed;
		}else if (num3>250) {
			grand3=num3;
			++contgrand;
		}
		
		if(num4<0) {
			System.out.println("no se pueden introducir negativos");
			System.exit(0);
		}else if(num4>=0 && num4<=25) {
			baj4=num4;
			++contbaj;
		}else if (num4>=26 && num4<=250) {
			med4=num4;
			++contmed;
		}else if (num4>250) {
			grand4=num4;
			++contgrand;
		}
		
		if(num5<0) {
			System.out.println("no se pueden introducir negativos");
			System.exit(0);
		}else if(num5>=0 && num5<=25) {
			baj5=num5;
			++contbaj;
		}else if (num5>=26 && num5<=250) {
			med5=num5;
			++contmed;
		}else if (num5>250) {
			grand5=num5;
			++contgrand;
		}
		System.out.println("La cantidad de numeros pequeños es :"+contbaj);
		System.out.println("La cantidad de numeros medianos es :"+contmed);
		System.out.println("La cantidad de numeros grandes es :"+contgrand);
		
			
		
	}
}
