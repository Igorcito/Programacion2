/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR BOULLOSA GARCIA
 */ //DESCUENTO EN MEGAPLAZA

public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		float importe;
		
		System.out.println("Cual es el importe de tu compra? ");
		importe = sc.nextFloat();
		
		if(importe>=200)
		    {
			System.out.println("El importe total de tu compra es de: " +importe*0.8);
			} else if(importe>=100 && importe<200) 
			{
				System.out.println("El importe total de tu compra es de: " +importe*0.9);
			} else
			{
				System.out.println("El importe total de tu compra es de: " +importe);
	        }
		sc.close();
	}

}
