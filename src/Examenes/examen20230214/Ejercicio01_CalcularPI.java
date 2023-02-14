package Examenes.examen20230214;

public class Ejercicio01_CalcularPI {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double pi = 3;
		int num1=2 , num2=3 , num3=4;
		int sum=-2;
		for (int i = 0; i < 6; i++) {
			sum += 2;
			if(i % 2 == 0) {
				pi += ((double)4/(double)((num1+sum)*(num2+sum)*(num3+sum)));
			}else {
				pi -= ((double)4/(double)((num1+sum)*(num2+sum)*(num3+sum)));
			}
		}
		System.out.println("El valor de PI es : "+pi);
		
	}
}
