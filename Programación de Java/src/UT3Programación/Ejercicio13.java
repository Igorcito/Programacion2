/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INTRODUCIMOS LAS VARIABLES:
		Scanner numero= new Scanner(System.in);
		float nota;
		
		//PREGUNTAMOS LA NOTA DEL EXAMEN:
		System.out.println("Qué nota has sacado en el examen?");
		nota = numero.nextFloat();
		
		if(nota < 0 || nota > 10) {
			System.out.println("Tu nota no es correcta. Por favor inténtalo de nuevo.");
		}else if(nota >=0 && nota <5) {
			System.out.println("Tu nota es: INSUFICIENTE");
		}else if(nota >=5 && nota <7) {
			System.out.println("Tu nota es: BIEN");
		}else if(nota >=7 && nota <9) {
			System.out.println("Tu nota es: NOTABLE");
		}else if(nota >=9) {
			System.out.println("Tu nota es: SOBRESALIENTE");
		}else {
			System.out.println("ERROR");
		}
		numero.close();			
	}

}
