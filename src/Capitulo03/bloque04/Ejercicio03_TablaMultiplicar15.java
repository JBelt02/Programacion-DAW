package Capitulo03.bloque04;


public class Ejercicio03_TablaMultiplicar15 {

	public static void main(String[] args) {
		int n = 1 ;
		int m = 0 ; 
		int res=0 ;
		do {
			
			if (m <= 10) {
				res = n * m ;
				System.out.println("La tabla del "+n+" por "+m+" es "+res);
				++m;
			}else {
				m = 0;
				n++;
			}
			
		}while(n <= 15);
		

	}

}
