/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Examen_prueba_enero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);

		//Inicialización de Array: Si el valor de la taquilla es 0 está abierta, si es 1 está cerrada.	
		int taquillas [] = new int [10];
			taquillas [0]=0;
			taquillas [1]=0;
			taquillas [2]=0;
			taquillas [3]=0;
			taquillas [4]=0;
			taquillas [5]=0;
			taquillas [6]=0;
			taquillas [7]=0;
			taquillas [8]=0;
			taquillas [9]=0;
			
		int numero;
		int numero2;
		
		do {
			
		System.out.println("Pulsa 1 para USAR una taquilla, Pulsa 2 para DEJAR una taquilla y 0 para SALIR:");
		numero = entrada.nextInt();
		
				if (numero == 1)
				{	
					System.out.println("Este es el estado de las taquillas:");
					for(int i = 0; i<=9; i++) 
					{
						System.out.println(taquillas[i]);
					}
					System.out.println("¿Qué taquilla quieres usar (del 1 al 10)?:");
					numero2 = entrada.nextInt();
					if (taquillas[numero2-1]==0)
					{
						taquillas[numero2-1]=1;
						System.out.println("La taquilla está abierta");
					}else {
						System.out.println("La taquilla está cerrada");
					}
				}
				
				if(numero == 2)
				{
					for(int i = 0; i<=9; i++) 
					{
						System.out.println(taquillas[i]);
					}
					System.out.println("¿Qué taquilla quieres cerrar (del 1 al 10)?:");
				}
				
				if (numero == 0)
				{
					System.out.println("Adios.");
				}
		}while (numero !=0);
	} 

}
