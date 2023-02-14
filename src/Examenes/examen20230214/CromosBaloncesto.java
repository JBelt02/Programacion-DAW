package Examenes.examen20230214;

public class CromosBaloncesto {
	public int ID ; 
	public String nombre ; 
	public int puntos ; 
	public int rebotes ;
	
	/**
	 * @param iD
	 * @param nombre
	 * @param puntos
	 * @param rebotes
	 */
	public CromosBaloncesto(int iD, String nombre, int puntos, int rebotes) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.puntos = puntos;
		this.rebotes = rebotes;
	}

	/**
	 * 
	 */
	public CromosBaloncesto() {
		super();
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the rebotes
	 */
	public int getRebotes() {
		return rebotes;
	}

	/**
	 * @param rebotes the rebotes to set
	 */
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}

	@Override
	public String toString() {
		return "CromosBaloncesto [ID=" + ID + ", nombre=" + nombre + ", puntos=" + puntos + ", rebotes=" + rebotes
				+ "]";
	} 
	
	
}
