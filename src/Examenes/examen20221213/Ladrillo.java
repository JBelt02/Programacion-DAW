package Examenes.examen20221213;

public class Ladrillo {
	/**
	 * Variables de Ladrillo
	 */
	public String color;
	public int x ; 
	public int y ;
	public int ancho ; 
	public int alto ; 
	public int puntosVida;
	public String[] colores = new String[3];{
	colores[0] = "rojo" ;
	colores[1] = "verde" ;
	colores[2] = "azul" ;
	}
	public int dest ; 
	
	/**
	 * 
	 */
	public Ladrillo() {
		super();
	}
	/**
	 * 
	 * @param color
	 * @param x
	 * @param y
	 * @param ancho
	 * @param alto
	 * @param puntosVida
	 * @param dest
	 */
	public Ladrillo(String color, int x, int y, int ancho, int alto, int puntosVida, int dest) {
		super();
		this.color = color;
		this.x = (int) (Math.random()*800);
		this.y = (int) (Math.random()*500);
		this.ancho = 100;
		this.alto = 50;
		this.puntosVida = (int) (Math.random()*(3-1))+1;
		this.dest = 0 ;
		
		if(puntosVida == 1) {
			this.color = colores[(int) ((Math.random()*(2-1))+1)];
		}
		if(puntosVida == 2) {
			this.color = "Plateado";
		}
		if(puntosVida == 3) {
			this.color = "Dorado";
		}
	}

	
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}
	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * 
	 * @return
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * 
	 * @param ancho
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * 
	 * @return
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * 
	 * @param alto
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * 
	 * @return
	 */
	public int getPuntosVida() {
		return puntosVida;
	}
	/**
	 * 
	 * @param puntosVida
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	

	/**
	 * @return the dest
	 */
	public int getDest() {
		return dest;
	}



	/**
	 * @param dest the dest to set
	 */
	public void setDest(int dest) {
		this.dest = dest;
	}



	@Override
	public String toString() {
		return "Ladrillo [color=" + color + ", x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto
				+ ", puntosVida=" + puntosVida + "]";
	}
	
}
