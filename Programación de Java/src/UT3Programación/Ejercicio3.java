/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR BOULLOSA GARCIA
 * EJEMPLO PEDIR DATOS POR PANTALLA.
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Para pedir datos al usuario necesito una variable de tipo Scanner.
		//En este caso se llama "entrada" pero podría llamarse de cualquier modo.
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero: ");
		
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero = entrada.nextInt();
		
		System.out.print("El numero introducido es: ");
		System .out.println(numero);
	}

}
