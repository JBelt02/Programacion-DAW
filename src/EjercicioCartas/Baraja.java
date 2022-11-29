package EjercicioCartas;

import java.util.Arrays;

public class Baraja {
	private Carta[] cartas = new Carta[52];

	public Baraja() {
		int j = 0 ;
		//Inicializo las cartas de la baraja
		//Picas 
		for (int i = 0; i < 13; i++ , j++) {
			this.cartas[i] = new Carta("Picas", i + 1, j);
		}
		//Diamantes 
		for (int i = 0; i < 13; i++ , j++) {
			this.cartas[j] = new Carta("Diamante", i + 1, j);
		}
		//Treboles 
		for (int i = 0; i < 13; i++ , j++) {
			this.cartas[j] = new Carta("Treboles", i + 1, j);
		}
		//Corazones
		for (int i = 0; i < 13; i++ , j++) {
			this.cartas[j] = new Carta("Corazones", i + 1, j);
		}
	}

	public Baraja(Carta[] cartas) {
		super();
		this.cartas = cartas;
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
	
	public void movimientoCirc () {
		boolean band = true ;
		Carta aux = new Carta();
		Carta aux1 = new Carta();
			while(band) {
				band = false;
				for (int i = 0; i < cartas.length-1; i++) {
						if(i == 0) {
							aux1 = cartas[i];
							cartas[i] = cartas[i + 1]; 
						}
						if(i != cartas.length-1) {
						aux = cartas[i];
						cartas[i] = cartas[i + 1];
						band = true;
						}
				}
				cartas[cartas.length-1] = aux1 ; 
				band = false ; 
			}
	}
	public void movimientoCircCont() {
		boolean band = true ;
		Carta aux = new Carta();
		Carta aux1 = new Carta();
			while(band) {
				band = false;
				for (int i = cartas.length-1; i > 0; i--) {
						if(i == cartas.length) {
							aux1 = cartas[i];
							cartas[i] = cartas[i - 1]; 
						}
						if(i != 0) {
						aux = cartas[i];
						cartas[i] = cartas[i - 1];
						band = true;
						}
				}
				cartas[cartas.length-1] = aux1 ; 
				band = false ; 
			}
	}
	
}
