/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Ejercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros [] =  new int [10];
		
		System.out.println("Introduce 10 números enteros que quieras:");
		System.out.println(" ");
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println("Introduce el número " +(i+1)+ ":");
			numeros [i] = sc.nextInt();
			
			if (numeros [i] == numeros [i])
			{
				System.out.println("El número que has introducido está repetido...");
			}
			else
			{
				
			}
		}
		
		System.out.println("Los números introducidos son:");
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.print("[" +numeros[i]+ "], ");
		}
		
		sc.close();
	}

}
