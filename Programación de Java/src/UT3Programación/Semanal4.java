/**
 * 
 */
package UT3Programación;

import java.util.Scanner;


/**
 * @author IGOR
 * Sobre la tela de una araña
 */
public class Semanal4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int pesotela;
		int elefante;
		int suma = 0;
		

		
		System.out.println("Si pulsas 0 en la pregunta, el programa se detendrá y se cerrará.");
		System.out.println(" ");
		
		do {
	
				System.out.println("Qué peso soporta la tela de araña?");
				pesotela = sc.nextInt();
				System.out.println("Introduce el peso del primer elefante.");
				elefante = sc.nextInt();
				
				suma = elefante;
				
				if (elefante == 0) {
					System.out.println("La tela de araña aguanta más peso.");
					System.out.println(" ");
				}else{
		
					do
					{
						System.out.println("Introduce el peso del siguiente elefante.");
						elefante = sc.nextInt();
						
						suma = suma + elefante;
					
					} while (suma<pesotela || elefante != 0); 
					
						if (suma>pesotela)
						{
						System.out.println("¡La tela de araña se ha roto!");
						System.out.println(" ");
						}
						else
						{
						System.out.println("La tela de araña aguanta más peso.");
						System.out.println(" ");
						}
					
				}
				
		} while (pesotela != 0);
		
		sc.close();
		
	}

}
