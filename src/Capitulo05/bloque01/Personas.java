package Capitulo05.bloque01;

public class Personas {
	
	public String nombre ;
	public String apellidos ; 
	public String dni ; 
	public String direccion ; 
	public int numerotlf ;
	
	public Personas(String nombre, String apellidos, String dni, String direccion, int numerotlf) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.numerotlf = numerotlf;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumerotlf() {
		return numerotlf;
	}
	public void setNumerotlf(int numerotlf) {
		this.numerotlf = numerotlf;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
				+ ", numerotlf=" + numerotlf + "]";
	} 
	
}
