/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Ejercicio2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc= new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor, introduce un numero: "); 
		
		numero = sc.nextInt();
    
		    if (numero/2==0) { 
		        System.out.println ("es par"); 
		    } else if (numero/2!=0) { 
		    	System.out.println ("es impar"); 
		    } 
		} 
	}
