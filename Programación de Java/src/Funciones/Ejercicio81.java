/**
 * 
 */
package Funciones;

/**
 * @author IGOR
 * / Método al que se le pasan dos enteros y muestra todos los
     números comprendidos entre ellos, ellos inclusive.
     Llamad al metodo "intervalo".
 */
public class Ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intervalo(5,15); //Los números que se pintan son los que hay entre el 5 y el 15, ellos incluidos.
	}
	
	private static void intervalo(int n1, int n2)
	{
		for (int i = n1; i<=n2; i++)
		{
			System.out.print(" "+i);
		}
	}
}
