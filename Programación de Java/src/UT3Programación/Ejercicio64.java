
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * Leer por teclado dos tablas de 5 números enteros y mezclarlas en una  
   tercera de la forma:  el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 
 */
public class Ejercicio64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//INTRODUCCIÓN Y DEFINICIÓN DE ARRAYS:
		int ArrayA[];
		ArrayA = new int [5];
		int ArrayB[];
		ArrayB = new int [5];
		int ArrayC[];
		ArrayC = new int [10];
		
		
		//INICIAMOS EL PROGRAMA:
		
		//TABLA A:
		System.out.println("NÚMEROS DE LA TABLA A, INTRODUCE 5 NUMEROS:");
		
		for (int i = 0; i < ArrayA.length; i++)
		{
			System.out.println("Numero:");
			ArrayA[i] = sc.nextInt();
		}
		
		//TABLA B:
		System.out.println("NÚMEROS DE LA TABLA B, INTRODUCE 5 NUMEROS:");
		
		for (int i = 0; i < ArrayB.length; i++)
		{
			System.out.println("Numero:");
			ArrayB[i] = sc.nextInt();
		}
		
		//TABLA C:		
		int j=0;
		for (int i = 0; i < ArrayC.length; i+=2) 
		{
			while (i<j)
			{
				ArrayC[i]=ArrayA[j];
				ArrayC[i+1]=ArrayB[j];
				j++;
			}
		}	
		
		System.out.println("NÚMEROS DE LA TABLA C DESORDENADOS:" ArrayC[i]);
		
		sc.close();
	}

}
