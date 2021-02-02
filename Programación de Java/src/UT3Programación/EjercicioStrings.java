/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * Simulación de una calculadora.
 */
public class EjercicioStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leertexto = new Scanner(System.in);
		Scanner leernum = new Scanner(System.in);
		char signo = ' ';
		int numero = 0;
		
		int numerototal;
		signo = leertexto.nextLine().charAt(0);
		System.out.println(signo);
		
		
		//------------------------------------------------
		System.out.println("Introduce un número:");
		int numero1 = leertexto.nextInt();
		System.out.println("¿Qué operación quieres hacer?");
		char oper = leertexto.nextLine();
		System.out.println("Valor actual: " +numerototal);
		System.out.println("Introduce el 2º número:");
		int numero2 = leertexto.nextInt();
		
		leertexto.close();
	}

}
