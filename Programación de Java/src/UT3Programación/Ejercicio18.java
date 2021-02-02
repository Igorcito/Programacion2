/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *18. Repetir el ejercicio anterior, pero si el segundo número que introduce el usuario es menor que el primero
 * volver a pedírselo hasta que introduzca uno mayor. 
 */
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de una variable Auxiliar:
		int aux;
				
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe numero inicial:");
		int start = entrada.nextInt();
		System.out.println("Escribe numero final:");
		int stop = entrada.nextInt();
		System.out.println("Escribe numero intervalo:");
		int intervalo = entrada.nextInt();
		
		
		for(int i = start; i<=stop ; i=i+intervalo)
		{
			System.out.println(i + " ");
		}
	
		entrada.close();
	}

}
