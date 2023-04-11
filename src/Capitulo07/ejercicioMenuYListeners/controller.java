package Capitulo07.ejercicioMenuYListeners;

public class controller implements SobreNumerosListener {
	
	

	/**
	 * 
	 */
	public controller() {
		super();
		
	}

	@Override
	public void sumYMultMayoresDe() {
		System.out.println("El resultado de la suma/multiplicacion es mayor de 1000 ");
		
	}

	@Override
	public void restMenorQue() {
		System.out.println("El resultado de la resta es menor que 0 ");
		
	}

	@Override
	public void divDiferenteA() {
		System.out.println("El divisor de la operacion es 0 ");
		
	}

	@Override
	public void raizNoNeg() {
		System.out.println("El operador de la raiz es un numero negativo ");
		
	}

}
