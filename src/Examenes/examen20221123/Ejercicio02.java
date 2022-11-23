package Examenes.examen20221123;

public class Ejercicio02 {
	/*
	 * Todos los metodos estan el la clase utils .
	 */
	public static void main(String[] args) {
		int numeros[] = utils.creaArrayNumerosAzar(5, 0, 100);
		utils.mostrarArray(numeros);
		
		int numeros2[] = new int[5];
		
		for (int i = 0; i < numeros.length;) {
			int j = utils.obtenerNumeroAzar(0, 4);
			if(numeros2[j] == 0) {
				numeros2[j] = numeros[i];
				i++;
			}
		}
		utils.mostrarArray(numeros2);
	}

}
