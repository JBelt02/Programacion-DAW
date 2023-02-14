package Examenes.examen20230214;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;




public class Ejercicio04_FicheroPropiedades {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		String nombre = Ejercicio04_FicheroPropiedades.getProperty("PROP_STRING_01");
		int edad = Ejercicio04_FicheroPropiedades.getIntProperty("PROP_NUMBER_02");
		float estatura = Ejercicio04_FicheroPropiedades.getFloatProperty("PROP_FLOAT_03");
		boolean esHombre = Ejercicio04_FicheroPropiedades.getBooleanProperty("PROP_BOOLEAN_04");
		
		System.out.println("Usuario leído del fichero de propiedades: " + nombre);
		System.out.println("Edad del usuario: " + edad);
		System.out.println("Estatura del usuario " + estatura);
		System.out.println("¿Es Hombre?: " + esHombre);

		List<Integer> lista = new ArrayList<Integer>();
		Properties props = Ejercicio04_FicheroPropiedades.getPropiedades();
		
		
	}
	
	
	private static Properties propiedades = null;


	
	/**
	 * 
	 * @return
	 */
	public static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/Examenes/examen20230214/propiedades.properties");
//				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static boolean getBooleanProperty (String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}
}
