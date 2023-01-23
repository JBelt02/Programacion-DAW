package Capitulo6.bloque02;

public class Articulo {
	
	
	public int numeroDeEstante ; 
	public int cantidadStock ; 
	public String codigoBarras ;
	
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}
	
	
	
	/**
	 * @param numeroDeEstante
	 * @param cantidadStock
	 * @param codigoBarras
	 */
	public Articulo(int numeroDeEstante, int cantidadStock, String codigoBarras) {
		super();
		this.numeroDeEstante = numeroDeEstante;
		this.cantidadStock = cantidadStock;
		this.codigoBarras = codigoBarras;
	}
	
	
	/**
	 * @return the numeroDeEstante
	 */
	public int getNumeroDeEstante() {
		return numeroDeEstante;
	}
	/**
	 * @param numeroDeEstante the numeroDeEstante to set
	 */
	public void setNumeroDeEstante(int numeroDeEstante) {
		this.numeroDeEstante = numeroDeEstante;
	}
	/**
	 * @return the cantidadStock
	 */
	public int getCantidadStock() {
		return cantidadStock;
	}
	/**
	 * @param cantidadStock the cantidadStock to set
	 */
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	/**
	 * @return the codigoBarras
	 */
	public String getCodigoBarras() {
		return codigoBarras;
	}
	/**
	 * @param codigoBarras the codigoBarras to set
	 */
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}



	@Override
	public String toString() {
		return "Articulo [numeroDeEstante=" + numeroDeEstante + ", cantidadStock=" + cantidadStock + ", codigoBarras="
				+ codigoBarras + "]";
	}
	
	
	
	
	
	
}
