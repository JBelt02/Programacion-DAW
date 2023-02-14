package Examenes.examen20230214;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;




public class Ejercicio02_CromosMenu {

	private static HashMap<Integer, CromosBaloncesto> hm = new HashMap<Integer, CromosBaloncesto> ();
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * cromos predefinos y insertados en el hm
		 */
		hm.put(1, new CromosBaloncesto( 1, "Pau Gasol",  78, 5));
		hm.put(2, new CromosBaloncesto( 2, "Marc Gasol",  98, 15));
		hm.put(3, new CromosBaloncesto( 3, "Pepe Gasol",  48, 3));
		
	int option;
	/**
	 * do while que se encarga que el menu siempre se repita a menos que se salga del menu 
	 */
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.- Abandonar el programa.\n"
				+ " 1.- Visualizar los valores de todos los cromos guardados.\n"
				+ " 2.- Introducir un nuevo cromo guardado.\n"
				+ " 3.- Eliminar un cromo, especificando su id numérico.\n"
				+ " 4.- Imprimir en consola los datos del jugador o jugadora con más puntos obtenidos.\n"
				+ " 5.- Modificar los valores de un jugador concreto.\n"
				+ " 6.- Imprimir en consola los datos del jugador o jugadora con menos rebotes.");
		
		System.out.println("Introduzca una opcion ");
		option = sc.nextInt();
		
		switch (option) {
		case 0:
			System.exit(0);
			break;
			
		case 1: // Ver cromos
			mostrarCromos();
			break;
			
		case 2: // Insertar cromos
			insertarCromo();
			break;
	
		case 3: // Eliminar cromo
			System.out.println("Introduzca el ID del cromo: ");
			int codigoAEliminar = sc.nextInt();
			hm.remove(codigoAEliminar);	
			break;
	
		case 4: // Imprimir El jugador con mas puntos 
			masPuntos();
			break;
			
		case 5: // Modificar un cromo 
			modCromo();
			break;
		case 6: // Imprimir el jugador con menos rebotes
			menosRebotes();
			break;
		}
	}while(option!=0);	

}

	private static void menosRebotes() {
		
		
	}

	private static void masPuntos() {
		
		Object claves[] = hm.keySet().toArray();
		
}
		
		
	
	/**
	 * Metodo que modifica un cromo mediante la Key ID
	 */
	private static void modCromo() {
		Scanner sc = new Scanner(System.in);
		CromosBaloncesto crom = new CromosBaloncesto();
		System.out.println("Introzuca el id del cromo: ");
		crom.setID(sc.nextInt());
		System.out.println("Introduzca nombre: ");
		crom.setNombre(sc.next());
		System.out.println("Introduzca número de puntos del cromo: ");
		crom.setPuntos(sc.nextInt());
		System.out.println("Introduzca numero de rebotes: ");
		crom.setRebotes(sc.nextInt());
		 
		hm.replace(crom.getID(), crom);
		
	}
/**
 * metodo que pide al usuario los datos del contructor de cromo y los inserta en al HM
 */
	private static void insertarCromo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca El ID del cromo: ");
		int id = sc.nextInt();
		System.out.println("Introduzca nombre: ");
		String nombre = sc.next();
		System.out.println("Introduzca número de puntos del cromo: ");
		int puntos = sc.nextInt();
		System.out.println("Introduzca numero de rebotes: ");
		int rebotes = sc.nextInt();
		
		hm.put(id, new CromosBaloncesto( id, nombre,  puntos, rebotes));
		
	}
/**
 * Metodo para mostrar los cromos en pantalla
 */
	private static void mostrarCromos() {
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("id: " + claves[i] + 
					"\nDatos del  " + hm.get(claves[i]));
		}
		
	}

}
