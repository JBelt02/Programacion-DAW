package Capitulo05.bloque01;

import java.util.Scanner;
import java.util.Set;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i=0;
		Personas arrayObjetos[]=new Personas[3];
		System.out.println("MENU : "
				+ "0.- Salir "
				+ "1.- Introducir Datos	de Persona"
				+ "2.- Ver las Personas Introducidas ");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 0:
			
			break;
		case 1:
			System.out.println("Introduzca el nombre de la persona");
			String nombre = sc.next();
			System.out.println("Introduzca el nombre de la persona");
			String apellidos = sc.next();
			System.out.println("Introduzca el nombre de la persona");
			String direccion = sc.next();
			System.out.println("Introduzca el nombre de la persona");
			String dni = sc.next();
			System.out.println("Introduzca el nombre de la persona");
			int numerotlf = sc.nextInt();
			arrayObjetos[i] = new Personas(nombre, apellidos, dni, direccion, numerotlf);
			i++;
			break;
		case 2:
			System.out.println(Personas.class.toString());
			break;
		}

	}

}
