/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * 25.Escribe un programa que pida un número y nos diga si es o no un número primo.
 */
public class Ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int numero; 
        int contador = 0; 
        int i; 
        
        System.out.println("Escribe un numero:"); 
        numero = sc.nextInt(); 

        contador = 0; 

        for(i = 1; i <= numero; i++) 
        { 
            if((numero % i) == 0) 
            { 
                contador++; 
            } 
        } 
        if(contador <= 2) 
        { 
            System.out.println("El numero es primo"); 
        }else{ 
            System.out.println("El numero no es primo"); 
        }
        
        sc.close();
    } 
} 