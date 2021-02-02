/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Semanal3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DECLARACION DE VARIABLES:
		Scanner sc = new Scanner(System.in);
		int superficie;
		int campos;
		
		do {
			System.out.println("Introduce los m2 que tiene tu superficie o pulsa 0 para salir:");
			superficie = sc.nextInt();
			
			if (superficie != 0) {
				
				do {
					System.out.println("Cuántos campos de fútbol crees que son?:");
					campos = sc.nextInt();
					
					if (campos == 0) {
						System.out.print("No se puede dividir por 0. ");
					}
					
				} while (campos == 0);
				
				if (campos != 0) {
					float mediaCampo = superficie / campos;
			
					if (mediaCampo >= 4050 && mediaCampo <= 10800) {
						System.out.println("SI");
						System.out.println("");
					} else {
						System.out.println("NO");
						System.out.println("");
					}
					
				}
				
			} else {
				System.out.println("");
				System.out.println("Adios.");
			}
			
		} while (superficie != 0);	
		
		sc.close();
	}
}