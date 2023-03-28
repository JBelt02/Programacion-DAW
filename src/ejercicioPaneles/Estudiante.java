package ejercicioPaneles;

public class Estudiante {
	public int id ;
	public String nombre ; 
	public String descipcion ;
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param descipcion
	 */
	public Estudiante(int id, String nombre, String descipcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descipcion = descipcion;
	}


	/**
	 * 
	 */
	public Estudiante() {
		super();
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the descipcion
	 */
	public String getDescipcion() {
		return descipcion;
	}


	/**
	 * @param descipcion the descipcion to set
	 */
	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	} 
	
	
}
