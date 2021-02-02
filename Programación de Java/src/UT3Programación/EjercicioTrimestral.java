/**
 * 
 */
package UT3Programación;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ISMAEL MORILLAS & IGOR BOULLOSA.
 * 	ODISEA POR EL ESPACIO, ASTEROIDES ¡CUIDADO!.
 */
public class EjercicioTrimestral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Random aleatorio = new Random(); //Usaremos el paquete "RANDOM" para la creación de asteroides aleatorios.
		
		System.out.println("Introduce un número entero para empezar:");
		int space = sc.nextInt();
		
		char spacedim [][] = new char [space][space]; //Éste será nuestro Array en el programa.
		float ratioAsteroids = 0.35f;
		
		// Introducimos los datos (.) en el Array. (INICIALIZACIÓN DE ARRAY)
		for (int y = 0; y < spacedim.length; y++)
		{
			for (int x = 0; x < spacedim.length; x++)
			{
				spacedim[x][y] = '.'; 
			}
		}

		//Creación de Asteroides:
		for (int i = 0; i < (int) (space * space) * ratioAsteroids; i++) // En este FOR usamos como "fin" un % fijo de asteroides.
		{
			boolean not_over = false; //Utilizaremos este boolean para que no se solapen los asteroides.
			
			do
			{
				int x = aleatorio.nextInt(space);
				int y = aleatorio.nextInt(space);
				
				if (spacedim[x][y] != '*')
				{
					spacedim[x][y] = '*';
					not_over = true;
				}
			}
			while(!not_over);
		}
		
		
		// Sustituye los "." del array por "@" en estas posiciones para crear la entrada-salida:
				spacedim[0][0] = '@';
				spacedim[space - 1][space - 1] = '@';
		
		// Mostramos por pantalla el array (DISPLAY)
		for (int y = 0; y < spacedim.length; y++)
		{
			for (int x = 0; x < spacedim.length; x++)
			{
				System.out.print(spacedim[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println(); //Después del 1er mapa, mostramos por pantalla el número de asteroides en el espacio.
		System.out.println("Número de asteroides en el espacio: ¡" +(int)((space * space) * ratioAsteroids)+ "!");
		System.out.println("Hemos conseguido llegar hasta aquí:");
		
		//-------------------------------------------------------------------------------------------------------------//
		
		//AHORA EMPIEZA LA 2ª PARTE DEL PROGRAMA.
		
		//Declaración de variables y booleans:
		int x = 0;
		int y = 0;
		
		boolean canRight 	 = false;
		boolean canDown		 = false;
		boolean canDiagonal	 = false;
		
		do //Ahora empezamos a 1º MIRAR y 2º MOVERNOS por el cinturón de asteroides:
		{
			spacedim[x][y] = '@'; //Empezamos en la posición/coordenadas [0][0] (Entrada):
			
			
			if (x < space - 1 && y < space - 1)
			{
				canDiagonal = spacedim[x + 1][y + 1] == '.';
			}
			else
			{
				canDiagonal = false;
			}
			
			if (x < space - 1)
			{
				canRight = spacedim[x + 1][y] == '.';
			}
			else
			{
				canRight = false;
			}
			
			if (y < space - 1)
			{
				canDown = spacedim[x][y + 1] == '.';
			}
			else
			{
				canDown = false;
			}
			
			
			//Introducimos el orden de prioridad en el que queremos que se mueva nuestra nave por el espacio.
			
			if (canDiagonal)
			{
				x++;
				y++;	
				continue;
			}
			
			if (canRight)
			{
				x++;
				continue;
			}
			
			if (canDown)
			{
				y++;	
				continue;
			}
			
			// Especificamos el final de nuestra ruta espacial.
			
			if (x == space - 1 && y == space - 1)
			{
				break;
			}
			
		} while (canDiagonal || canRight || canDown); 
		
		//Finalmente sacamos por pantalla nuestro mapa final, con asteroides y la ruta que hemos seguido.
		System.out.println();
		
		for (y = 0; y < spacedim.length; y++)
		{
			for (x = 0; x < spacedim.length; x++)
			{
				System.out.print(spacedim[x][y] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

//Especificamos cómo van a funcionar nuestros booleans.
/*
canDiagonal	= x < space - 1 && y < space - 1 ? spacedim[x + 1][y + 1] == '.' : false;
canRight	= x < space - 1 ? spacedim[x + 1][y] == '.' : false;
canDown		= y < space - 1 ? spacedim[x][y + 1] == '.' : false;		
*/
