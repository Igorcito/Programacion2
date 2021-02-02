/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR BOULLOSA GARCIA
 * COMPARAR 3 NÚMEROS Y DECIR CUÁL ES EL MAYOR, MEDIO Y CUÁL ES EL MENOR.
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INTRODUCIMOS LAS VARIABLES DE LOS 3 NÚMEROS:
		Scanner numero=new Scanner(System.in);
		int a,b,c,aux;

		//PREGUNTAMOS LOS 3 NÚMEROS:
		System.out.println("Introduce 3 numeros y los ordenare de mayor a menor:");
		System.out.println("Cual es el primer numero");
		a = numero.nextInt();
		System.out.println("Cual es el segundo numero");
		b = numero.nextInt();
		System.out.println("Cual es el tercer numero");
		c = numero.nextInt();
		
		//EMPEZAMOS A COMPARAR:
		if(a>=b && a>=c) {	System.out.println("El mayor numero es:"+a);
		}else if(b>=a && b>=c) { System.out.println("El mayor numero es:"+b);	
		}
		numero.close();
	}
}