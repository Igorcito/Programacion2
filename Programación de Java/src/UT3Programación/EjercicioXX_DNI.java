/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * Calcular la letra del DNI.
 */
public class EjercicioXX_DNI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 

		int dni;
		char letra [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int resto;
		
		System.out.println("Cuál es el número de tu DNI?:");
		dni = sc.nextInt();
		
		resto = dni %23;
		
		System.out.println("La letra del DNI es: " +letra[resto]);
		
		sc.close();
	}

}
