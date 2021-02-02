/**
 * 
 */
package UT3Programación;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author IGOR
 * ESCALERA DE COLOR.
 */
public class Semanal5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int cartas [] = new int [4];
		char palos [] = new char [4];
		
		System.out.println("Solo puedes introducir números del 1 al 13: \n");		
		System.out.println("Los palos de las cartas son: (escríbelos en minúsculas)");
		System.out.println("c = Corazones.");
		System.out.println("d = Diamantes.");
		System.out.println("p = Picas.");
		System.out.println("t = Tréboles. \n");
		System.out.println("Ahora introduce las 4 cartas que tienes en la mano: \n");
		
		 
		for (int i = 0; i<cartas.length; i++)
		{
			System.out.println("¿Qué carta tienes en la mano?");
			cartas [i] = entrada.nextInt();
			System.out.println("¿De qué palo es? (Recuerda, escribe en minúscula).");
			palos [i] = entrada.next().charAt(0);
		
		}
		
		boolean correcto = true;
		
		for (int i = 0; i < palos.length-1; i++)
		{
			if (palos[i] == palos[i+1])
			{
				correcto = true;
			}
			else
			{
				correcto = false;
			}
		}
		
		if (!correcto)
		{
			System.out.println("No es del mismo palo, no hay escalera de color.");
		}
		else
		{
			Arrays.sort(cartas); //Ya lo he ordenado, la posición i = 0.
			
			int primeraCarta = cartas[0];
			int cartaActual = 0;
			int cartasQueFaltan = 0;
			int cartaQueFalta = 0;
			int cartaReal = 0;
			
			for (int i = 0; i < cartas.length + 1; i++)
			{
				// Calculamos la carta esperada en esta ronda.
				int cartaEsperada = primeraCarta + i;
				
				// Cogemos la carta real del array.
				if (cartaActual < cartas.length)
				{
					cartaReal = cartas[cartaActual];
				}
				
				// Comprobamos si lo esperado es lo que hemos obtenido del array.
				if (cartaEsperada != cartaReal)
				{
					// La carta falta: la anotamos.
					cartasQueFaltan++;
					cartaQueFalta = cartaEsperada;
				}
				else
				{
					// La carta la tenemos: Pasamos a la siguiente.
					cartaActual++;
				}
			}
			
			if (cartasQueFaltan > 1)
			{
				System.out.println("No puedes hacer la escalera.");
			}
			else
			{
				System.out.println("menfado uwu te falta la " + cartaQueFalta + " uwu.");
			}
			
		}
				
		entrada.close();
	}

}
