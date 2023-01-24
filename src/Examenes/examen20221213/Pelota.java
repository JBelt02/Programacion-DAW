package Examenes.examen20221213;

public class Pelota {
	/**
	 * Variables de Pelota
	 */
	public int x ; 
	public int y ;
	/**
	 * @param x
	 * @param y
	 */
	public Pelota(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 */
	public Pelota() {
		super();
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Pelota [x=" + x + ", y=" + y + "]";
	} 
	
}
