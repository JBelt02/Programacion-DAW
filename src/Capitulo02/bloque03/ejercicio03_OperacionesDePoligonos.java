package Capitulo02.bloque03;

import java.util.Scanner;

public class ejercicio03_OperacionesDePoligonos {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1-Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2-Cálculo de la superficie de una circunferencia..");
		System.out.println("3-Cálculo del perímetro de una circunferencia.");
		System.out.println("4-Cálculo del área de un rectángulo.");
		System.out.println("5.-Cálculo del área de un triángulo.");
		System.out.println("0.-Salir Del programa.");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			
			System.out.println("Introduzca el primer cateto");
			float cat1 = sc.nextFloat();
			System.out.println("Introduzca el segundo cateto");
			float cat2 = sc.nextFloat();
			float h = (float) Math.pow((Math.pow(cat1, 2))+(Math.pow(cat2,2)),((float)1/2));
			System.out.println("La hipotenusa de un triangulo vale "+h);
			break;
			
		case 2:
			
			System.out.println("Introduzca el radio de la circurferencia ");
			float rad1=sc.nextFloat();
			float area = (float) (Math.PI*Math.pow(rad1, 2));
			System.out.println("El area es :"+area);
			break;
			
		case 3:
			
			System.out.println("Introduzca el radio de un circulo ");
			float rad2=sc.nextFloat();
			float perim=(float) (2*Math.PI*rad2);
			System.out.println("El perimetro de un circulo es: "+perim);
			break;
			
		case 4:
			
			System.out.println("Introduzca la base ");
			float base = sc.nextFloat();
			System.out.println("Introduzca la altura ");
			float altura = sc.nextFloat();
			float area2 = base*altura;
			System.out.println("El area de un rectangulo es: "+area2);
			break;
			
		case 5:
			
			System.out.println("Introduzca la base ");
			float base2 = sc.nextFloat();
			System.out.println("Introduzca la altura ");
			float altura2 = sc.nextFloat();
			float area3 = (base2*altura2)/2;
			System.out.println("El area de un triangulo es: "+area3 );
			break;
			
		case 0:
			System.exit(0);
		default : 
			System.out.println("Opcion Incorrecta");
		}
	}
}
