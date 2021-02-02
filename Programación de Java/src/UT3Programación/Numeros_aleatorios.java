/**
 * 
 */
package UT3Programación;

/**
 * @author IGOR
 * Generador de números aleatorios. Ejemplo de Nayra.
 */
public class Numeros_aleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		
		//número aleatorio entre 1 y 1
		int numero = (int)(Math.random()*10) +1;
		System.out.println(numero);
		
		//número aleatorio entre 1 y 4:
		int numero2 = (int)(Math.random()*4) +1;
		System.out.println(numero2);
		
	}

}
