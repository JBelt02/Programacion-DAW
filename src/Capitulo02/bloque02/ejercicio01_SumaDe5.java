package Capitulo02.bloque02;

import java.util.Scanner;

public class ejercicio01_SumaDe5 {
	public static void main (String args[]) {
		
		int neg1=0 , neg2=0 , neg3=0 , neg4=0 , neg5 = 0;
		int baj1=0 , baj2=0 , baj3=0 , baj4=0 , baj5 = 0;
		int med1=0 , med2=0 , med3=0 , med4=0 , med5 = 0;
		int grand1=0 , grand2=0 , grand3=0 , grand4=0 , grand5 = 0;
		
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
			neg1=num1;
		}else if(num1>=0 && num1<=25) {
			baj1=num1;
		}else if (num1>=26 && num1<=250) {
			med1=num1;
		}else if (num1>250) {
			grand1=num1;
		}
		
		if(num2<0) {
			neg2=num2 ; 
		}else if(num2>=0 && num2<=25) {
			baj2=num2;
		}else if (num2>=26 && num2<=250) {
			med2=num2;
		}else if (num2>250) {
			grand2=num2;
		}
		
		if(num3<0) {
			neg3=num3 ; 
		}else if(num3>=0 && num3<=25) {
			baj3=num3;
		}else if (num3>=26 && num3<=250) {
			med3=num3;
		}else if (num3>250) {
			grand3=num3;
		}
		
		if(num4<0) {
			neg4=num4 ; 
		}else if(num4>=0 && num4<=25) {
			baj4=num4;
		}else if (num4>=26 && num4<=250) {
			med4=num4;
		}else if (num4>250) {
			grand4=num4;
		}
		
		if(num5<0) {
			neg5=num5 ; 
		}else if(num5>=0 && num5<=25) {
			baj5=num5;
		}else if (num5>=26 && num5<=250) {
			med5=num5;
		}else if (num5>250) {
			grand5=num5;
		}
		
		
		System.out.println("La suma de los numeros negativos es :"+ (neg1+neg2+neg3+neg4+neg5));
		System.out.println("La suma de los numeros pequeños es :"+ (baj1+baj2+baj3+baj4+baj5));
		System.out.println("La suma de los numeros medianos es :"+ (med1+med2+med3+med4+med5));
		System.out.println("La suma de los numeros grandes es :"+ (grand1+grand2+grand3+grand4+grand5));	
		
	}
}
