package Capitulo07.bloque01;

import java.util.Scanner;

public class Ejercicio02_Contraseña {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cont;
		do {
			System.out.println("Introduzca su contraseña : ");
			cont = sc.next();
		}while(ValidaContr(cont));
		System.out.println("Contraseña valida");
	}
	
	public static boolean ValidaContr(String cont) {
		boolean bandMayusc = false;
		boolean bandMins = false;
		boolean bandTam = false;
		boolean bandCarc = false;
		boolean band = false;
		
		String[] it = cont.split("|");
		for(String s : it) {
			if(s.equals(s.toUpperCase())) {
				bandMayusc = true;
			}
			if(s.equals(s.toLowerCase())) {
				bandMins = true;
			}
			if(s.length()>1) {
				bandTam = true;
			}
			if(s.equals("!") || s.equals( "`" ) ||s.equals("·") ||s.equals("$") ||s.equals("%") ||s.equals("&") ||s.equals("/") ||s.equals("!") ||s.equals("(") ||s.equals(")") ||s.equals("=") ||s.equals("_") ) {
				bandCarc = true;
			}
			if(bandMayusc & bandMins & bandTam & bandCarc) {
				band = true;
			}
		}
		
		return band;
		
	}

}
