package Objetos;

public class Estadística {

	private static float media(float[] valores) {
		//TODO
		float media[] = 0;
		for (float i: valores) {
			
		}
		return media[i];
	}
	
	private static float moda(float[] valores) {
		//TODO
		
		return 0;
	}
	
	public static int factorial(int valor) {
		
		if (valor == 1)
			return 1;
		else
			return valor*factorial(valor-1);
	}
	
	private static int variacionSinRepeticion(int n, int m) {
		//TODO
		int resultado = factorial(m) / (factorial(m-n));
		return resultado;
	}
	
	private static int variacionConRepeticion(int n) {
		//TODO 
		int resultado = factorial(n);
		return resultado;
	}
	
	public static long permutacion () {
		//TODO
		
		return 0;
	}
	
}
