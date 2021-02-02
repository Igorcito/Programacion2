/**
 * 
 */
package Funciones;

/**
 * @author IGOR
 * / Método al que se le pasan 2 enteros y devuelve un array 
     relleno con los números comprendidos entre ellos, ellos inclusive.
     (Hacemos el ejercicio a partir del ejercio 81).
 */
public class Ejercicio81b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado[] = intervalo2(numero1, numero2);//EJ 81b 

		for(int i=0; i<resultado.length;i++)
		{ 
			System.out.println(resultado[i]); 
		} 

		private static int[] intervalo2(int numero1, int numero2) { 
		int array1[]=new int[numero2-numero1+1]; 

		for (int i=numero1, j=0; i<=numero2; i++, j++)
		{ 
			array1[j]=i; 
		} 

		return array1; 

		}
}

