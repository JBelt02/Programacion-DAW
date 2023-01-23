package Capitulo6.bloque02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Almacen {
	
	public static HashMap<String, Articulo> map = new HashMap<String, Articulo>();
/*
 *
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option ;
		
		
//		Menu del programa 
		do {
			System.out.println("MENU:" );
					System.out.println("1) Abandonar el programa.");
					System.out.println("2) Añadir un nuevo artículo .");
					System.out.println("3) Borrar un artículo .");
					System.out.println("4) Actualizar el estante y el número de unidades en stock de un artículo.");
					System.out.println("5) Mostrar los artículos del almacén.");

			
			option = sc.nextInt();

			switch (option) {
			case 1 :
				System.out.println("El programa ha finalizado.");
				break;

			case 2:
				System.out.println("Va a añadir un nuevo artículo en el almacén, introduzca los datos necesarios.\n");
				introducirNuevoArticulo();
				break;

			case 3:
				System.out.println("Va a elminar un artículo del almacen.\n");
				eliminarArticulo();
				break;
				
			case 4:
				System.out.println("Va a modificar un árticulo del almacen.\n");
				actualizarArticulo();
				break;
			
			case 5:
				mostrarArticulos();
				break;
				
			default: 
				System.out.println("Valor incorrecto, introduzca otro valor");
			}

		} while (option != 1 );

	}
//	Metodo para introducir nuevos articulos en el almacen creando objetos con el constructor y 
//	lo añadimos al hashmap
	private static void introducirNuevoArticulo() {
		int numeroDeEstante;
		int cantidadStock;
		String codigoBarras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el código de barras : ");
		codigoBarras = sc.nextLine();
		
		System.out.println("Introduce el número de estante : ");
		numeroDeEstante = sc.nextInt();
		
		System.out.println("Introduce la cantidad de unidades en stock : ");
		cantidadStock = sc.nextInt();
		
		Articulo articulo = new Articulo(numeroDeEstante, cantidadStock, codigoBarras);

		map.put(codigoBarras, articulo);
		
	}
//	Metodo para eliminar articulos del almacen mediante la funcion hashmap.remove junto con el codigo de barras del item 
	private static void eliminarArticulo() {
		Scanner sc = new Scanner(System.in);
		String codigoDeBarras;

		System.out.println("Introduzca el código del artículo que quiere eliminar: ");
		codigoDeBarras = sc.nextLine();
  
		map.remove(codigoDeBarras);
		
	}
	
//	Metodo para mostrar los articulos que hay dentro del hashmap
	private static void mostrarArticulos() {
		Iterator a = map.values().iterator();

		while (a.hasNext()) {
			System.out.println(a.next());
		}
		
	}
//	Metodo para actualizar un articulo introducido en el hashmap creando un nuevo objeto inicializado con el valor de la key 
	private static void actualizarArticulo() {
		Scanner sc = new Scanner(System.in);
		int setNumeroDeEstante;
		int cantidadStock;
		String codigoBarras;

		System.out.println("Introduzca el código del artículo que desea modificiar: ");
		codigoBarras = sc.nextLine();

		System.out.println("Introduzca un nuevo número de estante: ");
		setNumeroDeEstante = sc.nextInt();

		System.out.println("Introduzca la nueva cantidad: ");
		cantidadStock = sc.nextInt();

		Articulo articulo = map.get(codigoBarras);
		articulo.setNumeroDeEstante(setNumeroDeEstante);
		articulo.setCantidadStock(cantidadStock);
	}	
	
	

	

}
