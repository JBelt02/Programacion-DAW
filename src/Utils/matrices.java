package Utils;

public class matrices {
	
	public static void rellenaMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = arrays.obtenerNumeroAzar(0, 100);			
				}
		}
	}
	
	public static void mostrarmatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println();
		}
	}
	public static boolean compruebapositivo (int matriz[][]) {
		boolean band = false ; 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > 0) {
					band = true; 
				}else {
					band = false ; 
				}
			}
		}
		return band;
	}
	public static boolean compruebadiagonal(int matriz[][]) {
		
		return false;
		
	}
	public static boolean compruebatriangularsuperior(int matriz[][]) {
		
		return false;
		
	}
	public static boolean compruebadispersa(int matriz[][]) {
		
		return false;
		
	}
	public static boolean compruebasimetrica(int matriz[][]) {
		
		return false;
		
	}
	public static void construyearraydematriz() {
		
	}
	public static void matriztraspuesta() {
		
	}
	public static void matrizopuesta() {
		
	}
	public static void  creamatrizsinfila() {
		
	}
}
