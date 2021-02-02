/**
 * 
 */
package UT3Programación;

/**
 * @author IGOR
 *
 */
public class HojaPruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Comparación de palos de cartas iguales:
		boolean correcto=false;
		for (int i = 0; i < palos.length-1; i++) {
			if (palos[i]==palos[i+1]) {
				correcto=true;
			}else {
				correcto=false;
			}
		}
		if (!correcto) {
			System.out.println("No son todos del mismo palo, por lo tanto no hay escalera.");
		}else {
			System.out.println("Seguimos el programa.");
		}
	}

}
---------------------------------------------------------------

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
			
			int contador = 0;
			
			for (int i = 0; i < cartas.length-1; i++)
			{
				if (cartas[i] != cartas[i+1]-1)
				{
					contador++;
				}
			}
			
			if (contador > 2) 
			{
				int cartaFalta = 0;
				
				for (int i = 0; i < cartas.length-1; i++)
				{
					if (cartas[i] != cartas[i+1]-1)
					{
						System.out.println("Te falta la carta con valor:" +(cartas[i]+1));
					}
					else
					{		
							cartaFalta=(cartas[3]+1);
					}
				}
				
				System.out.println("Te falta la carta con valor:" +cartaFalta);
			}
			else
			{
				System.out.println("No se puede hacer la escalera.");
			}
			
		}
				
		entrada.close();
	}

}
