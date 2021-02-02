/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR BOULLOSA GARCIA
 * MENÚ DE ESTADO DE ÁNIMO.
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner opcion= new Scanner(System.in);
		int opcion;
		
		// Creamos el menú:
		
		System.out.println("Hola. Como te encuentras hoy?");
		System.out.println("1. Contento (pulsa 1).");
		System.out.println("2. Regular (pulsa 2).");
		System.out.println("3. Triste (pulsa 3).");
		System.out.println("4. Salir (pulsa 4).");
	
		// Elige una opción del menú:
		// 1. Estoy Contento.
		// 2. Estoy Regular.
		// 3. Estoy Triste.
		// 4. Salir.
		
		// Leo la opción elegida y la guardo en la variable "opción":
		opcion = sc.nextInt();
		
		// Según la opción elegida devuelvo una frase.
		
		// caso1: Genial, sigue así. (Sacamos por pantalla la frase1)
		// caso2: Bueno, el día mejorará. (Sacamos por pantalla la frase3)
		// caso3: Tranquilo, mañana será otro día. (Sacamos por pantalla la frase5)
		// caso4: ¡Que tengas un buen día, adiós! (Sacamos por pantalla la frase6)
		// casoD: Respuesta no valida (Sacamos por pantalla la frase7) - (repetimos el menú)
		//Vuelvo a pintar el menú si la opción no es 0.
		
		
		int opcion = opcion.nextint;
		
		

	}

}
