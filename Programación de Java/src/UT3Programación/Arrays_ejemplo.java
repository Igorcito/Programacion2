/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Arrays_ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int elefantes[];
		elefantes = new int[3];
		elefantes[0]=45;
		elefantes[1]=68;
		elefantes[2]=300;
		System.out.println(elefantes[2]);
		
		float notas[] = {5.5F, 6.2F, 7.8F, 9.3F};
		notas[3] = 9.3F;
		System.out.println(notas[1]);
		
		//Bucle para recorrer el array e inicializarlo a 0:
		for(int i = 0; i<=elefantes.length; i++) 
		{
			System.out.println(elefantes[i]);
		}
		
		//Bucle para recorrer array y pintarlo por pantalla:
		for(int i = 0; i<=3; i++) 
		{
			System.out.println(elefantes[i]);
		}
		
		//Bucle para recorrer array y completarlo con valores introducidos por el usuario:
		for(int i = 0; i<=elefantes.length; i++) 
		{
			System.out.println("Introduce el peso del elefante "+i);
		}

		
		
		
	}
}
