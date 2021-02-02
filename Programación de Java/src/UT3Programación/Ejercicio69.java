/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Ejercicio69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, pos;   //Estas 2 variables las creamos para, una vez introducidos los 8 números,
						//introducir 2 nuevos en las posiciones que queramos.
						
		int numeros [] = new int [10];
		
		System.out.println("Introduce los 8 números que quieras:");
		System.out.println(" ");
		
		for (int i = 0; i < 8; i++)
		{
			System.out.println("Número en la posición " +(i+1)+ ":" );
			numeros [i] = sc.nextInt();	
		}
		
		for (int i = 0; i < 2; i++)
		{
			System.out.println("Introduce un nuevo número:");
			num = sc.nextInt();
			System.out.println("Ahora introduce su posición:");
			pos = sc.nextInt();
		}
		
		//Ahora que ya tenemos los 2 nuevos números introducidos con sus respectivas posiciones, debemos
		// desplazar los números que ya teníamos en Array (numeros) hacia la siguiente casilla, empezando
		//por la que queremos usar para el nuevo número.
		
		
		
		sc.close();
	}

}
