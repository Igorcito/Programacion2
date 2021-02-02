/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * 22.Escribe un programa que calcule ab (a elevado a b)  pidiendo por teclado a y b (no puede usar la funcion pow).
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int resultado;
		
		System.out.println("Escribe el número base:");
		int nbase = sc.nextInt();
		System.out.println("Escribe el exponente:");
		int exponente = sc.nextInt();
		
		resultado = nbase;
		
		for(int i = 1; i < exponente; i ++)
		{
			resultado = nbase * resultado;
		}
			System.out.println("Resultado:" + resultado);
		sc.close();
	}

}
