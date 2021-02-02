/**
 * 
 */
package UT3Programación;

/**
 * @author IGOR
 *
 */
public class Ejercicio70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla = new int[10][10];
		
		//Rellenar la matriz:
		for (int i = 0; i < tabla.length; i++)
		{
			for (int j = 0; j < tabla[i].length; j++)
			{
				tabla[i][j] = i*j;
			}
		}
		
		//Pintar la matriz:
		for (int i = 0; i < tabla.length; i++)
		{
			for (int j = 0; j < tabla[i].length; j++)
			{
				System.out.print(tabla[i][j]+ " ");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
