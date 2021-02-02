/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * Pedir un número de inicio, de fin y un intervalo entre ellos.
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe numero inicial:");
		int start = entrada.nextInt();
		System.out.println("Escribe numero final:");
		int stop = entrada.nextInt();
		System.out.println("Escribe numero intervalo:");
		int intervalo = entrada.nextInt();
		
		for(int i = start; i<=stop ; i=i+intervalo) {
			System.out.println(i + " ");
		}
		
		/**
		//Version con while
		int j = start;
		while (j <= stop) {
			System.out.println(j + " ");
			j = j + intervalo;
		}
		**/
		
		entrada.close();
		
	}

}
