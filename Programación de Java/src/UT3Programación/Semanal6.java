/**
 * 
 */
package UT3Programación;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Semanal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada  = new Scanner(System.in); //Scanner para Int.
		Scanner entrada2 = new Scanner(System.in); //Scanner para String.
		
		//VARIABLES:
		String caracterespermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuwxyz";
		int opcion = 0;
		String primerapalabra = "";
		String segundapalabra = "";
	
		do //REEPTIREMOS EL PROGRAMA.
		{
			System.out.println("MENÚ DE OPCIONES:");
			System.out.println("Buscar anagrama. (Pulsar 1)");
			System.out.println("Salir.           (Pulsar 0)");
			System.out.println(" ");
			opcion = entrada.nextInt();
			
			if(opcion == 1)
			{
				boolean palabracorrecta = true;
				
				do
				{
					palabracorrecta = true;
					
					System.out.println("Escribe la 1ª palabra.");
					primerapalabra = entrada2.nextLine();
					
					if(primerapalabra.length() > 1000) //LA PALABRA ESCRITA NO DEBE SER MAYOR DE 1.000 CARÁCTERES.
					{
						System.out.println("La palabra es muy grande. Escríbela otra vez.");
						System.out.println(" ");
					}
					
					//MIRAMOS SI LA PALABRA TIENE LOS CARÁCTERES PERMITIDOS. SI NO, PEDIMOS LA PALABRA OTRA VEZ.
					for (char letra :primerapalabra.toCharArray())
					{
						if (!caracterespermitidos.contains(Character.toString(letra)))
						{
							palabracorrecta = false;
						}
					}
					
					if (!palabracorrecta) //SI NO ES CORRECTA, PEDIMOS QUE SOLO ESCRIBA CARACTERES PERMITIDOS.
					{
						System.out.println("Escribe solo carácteres ingleses.");
						System.out.println(" ");
					}
					
				} while (!palabracorrecta || primerapalabra.length() > 1000);
				
			
				do //REPETIMOS OTRO BUCLE PARA LA 2ª PALABRA:
				{
					palabracorrecta = true;
					
					System.out.println("Ahora escribe la 2ª palabra.");
					segundapalabra = entrada2.nextLine();
					
					if(segundapalabra.length() > 1000)
					{
						System.out.println("La palabra es muy grande. Escríbela otra vez.");
						System.out.println("");
					}
					
					for (char character :segundapalabra.toCharArray())
					{
						if (!caracterespermitidos.contains(Character.toString(character)))
						{
							palabracorrecta = false;
						}
					}
					
					if (!palabracorrecta)
					{
						System.out.println("Escribe solo carácteres ingleses.");
						System.out.println(" ");
					}
					
				} while (!palabracorrecta || segundapalabra.length() > 1000);
				
				//TRANSFORMAMOS TODAS LAS LERTAS A MINÚSCULAS.
				primerapalabra = primerapalabra.toLowerCase();
				segundapalabra = segundapalabra.toLowerCase();

				boolean anagrama = true;
				
				for (char character :primerapalabra.toCharArray())
				{
					int caracteres1 = primerapalabra.length() - primerapalabra.replace(Character.toString(character), "").length();
					
					int caracteres2 = segundapalabra.length() - segundapalabra.replace(Character.toString(character), "").length();
					
					if (caracteres1 != caracteres2)
					{
						anagrama = false;
					}
				}
				
				if (anagrama) //MOSTRAMOS POR PANTALLA SI ES ANAGRAMA O NO.
				{
					System.out.println("Es un anagrama.");
					System.out.println(" ");
				} else {
					System.out.println("No es un anagrama.");
					System.out.println(" ");
				}
			}
				
		} while(opcion != 0);
		
		System.out.println("Adios.");
		
		entrada.close();
		entrada2.close();

	}

}
