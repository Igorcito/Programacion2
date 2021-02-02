/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 * CREAR UN PROCESADOR FIFO.
 */
public class ProcesadorFIFO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//TE = Tiempo de ejecución	(preguntamos).
		//TL = Tiempo de llegada.	(preguntamos).
		//TR = Tiempo de retorno.
		
		int te1, te2, tl1, tl2, tr1, tr2;
		
		int procesoactivo = 0; //Variable para definir que proceso está activo.
		
		System.out.println("Introduce el tiempo de llegada del procesador 1:");
		tl1 = sc.nextInt();
		System.out.println("Introduce el tiempo de llegada del procesador 2:");
		tl2 = sc.nextInt();
		System.out.println("Introduce el tiempo de ejecución del procesador 1:");
		te1 = sc.nextInt();
		System.out.println("Introduce el tiempo de ejecución del procesador 2:");
		te2 = sc.nextInt();
		
		if (tl1<tl2)
		{
			procesoactivo=1;
		}
		
		sc.close();
	}

}
