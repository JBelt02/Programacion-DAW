package Examenes.examen20221213;

import java.util.Scanner;

public class Juego {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			partida();
			System.out.println("¿Desea volver a jugar ? escriba 1 si desea o 0 si no ");
			num = sc.nextInt();
		}while(num  == 1);
	}

	
	
	/**
	 * Metodo que se encarga de realizar la partida y repetirla en bucle hasta que 
	 * todos los ladrillos sean destruidos
	 */
	public static void partida () {
		/**
		 * Variables de Juego
		 */
	
		Ladrillo[] arkanoid = new Ladrillo[20] ;
		Pelota redon = new Pelota();
		int reset = 0;
		do {
			boolean band = false ; 
			redon.setX((int) (Math.random()*900));
			redon.setY((int) (Math.random()*600));
			for (int i = 0; i < arkanoid.length; i++) {
				if((redon.getX() > arkanoid[i].getX() && redon.getX() < (arkanoid[i].getX() + arkanoid[i].getAncho())) && (redon.getY() > arkanoid[i].getY() && redon.getY() < (arkanoid[i].getY() + arkanoid[i].getAlto()))) {
					band = true ; 
				}
				if(band) {
					arkanoid[i].puntosVida -= 1;
					if(arkanoid[i].puntosVida <= 0) {
						arkanoid[i] = null ;
						arkanoid[i].dest = reset;
						reset +=1;
						 
					}
				}
				for (int j = 0; j < arkanoid.length; j++) {
					if(arkanoid[j] != null) {
						System.out.println(arkanoid.toString());
					}
				}
				
				/**
				 * Variables de Ladrillo
				 */}
			
		}while(reset==20);
	
	
	}
}

