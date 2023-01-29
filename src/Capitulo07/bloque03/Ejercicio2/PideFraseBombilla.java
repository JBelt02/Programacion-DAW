package Capitulo07.bloque03.Ejercicio2;

import java.util.Scanner;

public class PideFraseBombilla {

	public static void main(String[] args) {
		try {
			pideFraseBombilla();
			
		}catch(EspacioBlancoException e) {
			System.out.println(e.getMessage());
		}catch(CantidadPalabrasException e) {
			System.out.println(e.getMessage());
		}catch(LenguajeSoezException e) {
			System.out.println(e.getMessage());
		}catch(NoBombillaException e) {
			System.out.println(e.getMessage());
		} 

	}
	

	/**
	 * @throws EspacioBlancoException
	 * @throws CantidadPalabrasException
	 * @throws NoBombillaException
	 * @throws LenguajeSoezException
	 */
	private static void pideFraseBombilla() throws EspacioBlancoException , CantidadPalabrasException ,NoBombillaException , LenguajeSoezException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una Frase con la Palabra bombilla");
		String phra = sc.next();
		
		String bombilla = new String("bombilla");
		String tonto = new String ("tonto");
		String tonta = new String("tonta");
		String idiota = new String ("idiota");
		
		
		
		if(phra.trim().length() == 0) {
			throw new EspacioBlancoException("No se puede escribir solo espacios en blanco");
			
		}
		String[] arra = phra.split("\\s+");
		if(arra.length < 3) {
				throw new CantidadPalabrasException("La longitdu minima permitida es de 3 palabras");
					
			}
		for(String a : arra) {
			if(a.equalsIgnoreCase(tonto) || a.equalsIgnoreCase(tonta) || a.equalsIgnoreCase(idiota)) {
				throw new LenguajeSoezException("No esta permitido el lenguaje soez");
					
			}
			break;
		}
				 
		boolean contieneBombilla = false;
		for(String s : arra) {
			if(s.equalsIgnoreCase(bombilla)) {
				contieneBombilla = true;
				if(!contieneBombilla) {
					throw new NoBombillaException("La frase debe contener la palabra bombilla ");
				}
			}
			break;
		}
			
				
	}
}
		
	

		



