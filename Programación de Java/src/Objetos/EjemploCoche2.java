/**
 * 
 */
package Objetos;

/**
 * @author IGOR
 *
 */
public class EjemploCoche2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EjemploCoche micoche = new EjemploCoche("Rojo","7777AAA", 70000);
		EjemploCoche miotrocoche = new EjemploCoche("Gris","1234ABC", 10000);
		
		System.out.println("La matrícula de mi coche es:" + micoche.matricula);
		System.out.println("La matrícula de mi coche es:" + miotrocoche.matricula);
	
		//float media = estadística.media(valores).
		System.out.println("\nEl factorial de 4 es: " + Estadística.factorial(4));
		//factorial de 4 es 4
	
	
	}

}
