package Examenes.examen20221123;

public class Ejercicio01 {
/*
 * Todos los metodos estan el la clase utils .
 */
	public static void main(String[] args) {
		int[][] matriz = new int[][] { {1, 2, 3, 4}, 
		                               {5, 6, 7, 8}, 
		                               {9, 10,11,12}, 
		                               {13,14,15,16} };
		                               
		utils.mostrarMatriz(matriz);
		                               
		if(utils.compruebamatriz(matriz)) {
			System.out.println("La matriz esta ordenada");
		}else {
			System.out.println("La matriz no esta ordenada");
		}

	}

}
