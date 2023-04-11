package Capitulo07.ejercicioMenuYListeners;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;





public class pideNumerosAlUsuario {

	private static List<SobreNumerosListener> listeners = new ArrayList<SobreNumerosListener>();
	
	/**
	 * 
	 * @param l
	 */
	public static void addSobreNumerosListener (SobreNumerosListener l) {
		listeners.add(l);
	}
	
	/**
	 * 
	 * @param l
	 */
	public static void removeSobreNumerosListener (SobreNumerosListener l) {
		listeners.remove(l);
	}
	private static void compruebaResultSumYMult (int result ) {
		if(result >= 1000) {
			fireResultMayorque100();
			return;
		}
	}
	private static void compruebaResulrest (int result ) {
		if(result < 0) {
			fireResultMenorQue0();
			return;
		}
	}
	private static void compruebaOperadorDiv (int numero2 ) {
		if(numero2 == 0) {
			fireDivisorIgualACero();
			return;
		}
	}
	private static void compruebaNumRaiz (int numero1 ) {
		if(numero1 < 0) {
			fireNumeroMenorQueCero();
			return;
		}
	}
	
	public static void main(String[] args) {
		String str;
		int opcion = 0, numero1 = 0, numero2 = 0, result = 0;
		System.out.println("Menú:");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		System.out.println("5.- Raiz");
		
		str = JOptionPane.showInputDialog("Introduzca la opción: (En el caso de la raiz solo se tomara el primer numero seleccionado) ");
		opcion = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el primer número: ");
		numero1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		numero2 = Integer.parseInt(str);
		
		
		switch(opcion) {
		case 1:
			result = numero1 + numero2;
			compruebaResultSumYMult(result);
			System.out.println("La suma vale: " + result);
			break;
		case 2:
			result = numero1 - numero2;
			compruebaResulrest(result);
			System.out.println("La suma vale: " + result);
			break;
		case 3:
			result = numero1 * numero2;
			compruebaResultSumYMult(result);
			System.out.println("La suma vale: " + result);
			break;
		case 4:
			result = numero1 / numero2;
			 compruebaOperadorDiv(numero2);
			System.out.println("La suma vale: " + result);
			break;
		case 5:
			result = (int) Math.sqrt(numero1);
			System.out.println("La suma vale: " + result);
			break;
		default:
			System.out.println("La opción " + opcion + " no está contemplada");
		}

	}

}
