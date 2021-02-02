/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *Crear un array de enteros de 10 posiciones, pedir números al usuario hasta rellenarlo. 
  Mostrar a continuación la media de los numeros del array y cuál es el mayor y el menor. 
 */
public class Ejercicio63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros[];
		numeros = new int [10];
		int max = 0;
		int min = 0;
		int media = 0;
		
		
		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Introduce el numero: "+(i+1));
			numeros[i] = sc.nextInt();	
		}
		
		//-----------------
		min = numeros[0]; //Aquí inicializamos las variantes "mínimo" y "máximo" con su valor mínimo y máximo, que es 0.
		max = numeros[0]; //Si no queremos hacer ésto tenemos que usar las variables "int max = Integer.MAX_VALUE" y " "int min = Integer.MIN_VALUE". 
		//-----------------
		
		for(int i = 0; i < numeros.length; i++)
		{
			if(numeros[i] < min) //Sacamos el mínimo número.
			{
				min = numeros[i];
			}
			if(numeros[i] > max) //Sacamos el máximo número.
			{
				max = numeros[i];
			}
			media += numeros[i]; //Media = números del array + media (la media comienza en 0 y le vamos sumando los del array).
		}
		
		media /= numeros.length;
		
		System.out.println("El número menor es:" +min);
		System.out.println("El número mayor es:" +max);
		System.out.println("La media de los números es:" +media);
		
		/*
		La siguiente print es para concatenar prints en una sola.
		System.out.println("El número menor es:" +min+ "El número mayor es:" +max+ "La media es:" +media);
		*/
		sc.close();
	}

}
