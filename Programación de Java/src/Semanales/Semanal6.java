/**
 * 
 */
package Semanales;

import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Semanal6 {
	
	//logica! funciones! strings! debugear! clases!
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe la frase 1:");
		String frase1 = entrada.nextLine();
		frase1 = frase1.trim(); // Descartar todos los espacios del pricipio y de final
		
		System.out.println("Escribe la frase 2:");
		String frase2 = entrada.nextLine();
		frase2 = frase2.trim();

		String caracteresValidos = " AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789'@.?";
		
		boolean frase1_correcta = true;
		
		if (frase1.length() > 1000)
		{
			frase1_correcta = false;
		}
		
		for (int i = 0; i < frase1.length(); i++)
		{
			String c = frase1.substring(i, i + 1);

			if (!caracteresValidos.contains(c.toLowerCase()))
			{
				frase1_correcta = false;
				break;
			}
		}

		System.out.println(frase1_correcta);
		
		String letrasDisponibles = frase1;
		
		for (int i = 0; i < frase1.length(); i++)
		{
			String c = frase1.substring(i, i + 1);

			if (letrasDisponibles.contains(c))
			{
				int index = letrasDisponibles.indexOf(c);
				System.out.print(index);
			}
		}
		

	}

}
