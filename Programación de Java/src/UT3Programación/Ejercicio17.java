/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * Mismo ejercicio que el 16 pero si el 2º númmero es menor que el 1º, hay que intercambiarlos (Hay qye usar una variable auxiliar).
 */
public class Ejercicio17 {

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
		
		if(stop<start)
		{	
			aux = stop;
			stop = start;
			start =  aux;
		}
		
		for(int i = start; i<=stop ; i=i+intervalo)
		{
			System.out.println(i + " ");
		}

		entrada.close();
	}

}
