/**
 * 
 */
package UT622;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner (System.in);
		
		ArrayList<Libro> biblioteca = new ArrayList<Libro>();
		
		//VARIABLES:
		int opcion;
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		
		System.out.println("Hola.");
		
		do
		{
			//MENÚ DE OPCIONES:
			System.out.println("¿Qué quieres hacer ahora?: ");
			System.out.println(" ");
			System.out.println("1. Dar de alta un libro: (Pulsa 1)");
			System.out.println("2. Consultar un libro: (Pulsa 2)");
			System.out.println("3. Dar de baja un libro: (Pulsa 3)");
			System.out.println("4. Hacer un préstamo: (Pulsa 4)");
			System.out.println("5. Salir: (Pulsa 0)");
			System.out.println(" ");
			opcion = entrada.nextInt();
		
			//OPCIÓNES:
			switch(opcion) 
			{
				case 1: System.out.println("Vas a dar de alta un libro.");
						System.out.println("---------------------------");
						System.out.println(" ");
						System.out.println("¿Cuál es el título del libro?");
						titulo = entrada2.nextLine();
						System.out.println("¿Quién es su autor?");
						autor = entrada2.nextLine();
						System.out.println("¿Cuántos ejemplares hay?");
						ejemplares = entrada.nextInt();
						System.out.println("¿Cuántos están prestados?");
						prestados = entrada.nextInt();
						
						if (prestados > ejemplares)
						{
							prestados = 0;
						}
						
						biblioteca.add(new Libro (titulo, autor, ejemplares, prestados));
						System.out.println("¡Felicidades! El libro se ha dado de alta satisfactoriamente en la posición. " + biblioteca.size());   
						System.out.println(" ");
						System.out.println(" ");
						
						break;
						
				case 2: System.out.println("Estás haciendo la búsqueda de un libro:");
						System.out.println("---------------------------------------");
						System.out.println("Escribe el título del libro que quieres encontrar.");
						titulo = entrada2.nextLine();
						System.out.println(" ");
						
						for (int i=0; i<biblioteca.size(); i++)
						{
							if (biblioteca.get(i).getTitulo().equals(titulo))
							{
								System.out.println("He encontrado el libro que buscas:");
								System.out.println(biblioteca.get(i));
								System.out.println(" ");
								System.out.println(" ");
								
								/*System.out.println("He encontrado el libro que buscas:");
								System.out.println("Su posición es: " + (i+1));
								System.out.println("Titulo: " + biblioteca.get(i).getTitulo());
								System.out.println("Autor: " + biblioteca.get(i).getAutor());
								System.out.println("Ejemplares: " + biblioteca.get(i).getEjemplares());
								System.out.println("Prestados: " + biblioteca.get(i).getPrestados());
								System.out.println(" ");*/
							}
							else
							{
							System.out.println("El libro que buscas no está disponbible.");
							System.out.println(" ");
							System.out.println(" ");
							}
						}
					
						/*System.out.println("Estos son los libros dados de alta:");
						System.out.println("-----------------------------------");
						System.out.println(" ");
						
						for (int i=0; i<biblioteca.size(); i++)
						{
							System.out.println("Su posición es: " + (i+1));
							System.out.println("Titulo: " + biblioteca.get(i).getTitulo());
							System.out.println("Autor: " + biblioteca.get(i).getAutor());
							System.out.println("Ejemplares: " + biblioteca.get(i).getEjemplares());
							System.out.println("Prestados: " + biblioteca.get(i).getPrestados());
							System.out.println(" ");
							System.out.println(" ");
						}*/
						
						break;
						
				case 3: System.out.println("Vas a dar de baja un libro.");
						System.out.println("---------------------------");
						System.out.println(" ");
						System.out.println("¿Qué libro quieres dar de baja?");
						titulo = entrada2.nextLine();
						
						for (int i=0; i<biblioteca.size(); i++)
						{
							if (biblioteca.get(i).getTitulo().equals(titulo))
							{
								biblioteca.remove(i);
							}
						}
						System.out.println("El libro se ha dado de baja correctamente:");
						System.out.println(" ");
						System.out.println(" ");
						
						break;
					
				case 4: System.out.println("¿Qué libro quieres alquilar?");
						titulo = entrada2.nextLine();
					
					for (int i=0; i<biblioteca.size(); i++)
					{
						if (biblioteca.get(i).getTitulo().equals(titulo))
						{
							biblioteca.get(i).prestamo();
						}
					}

						break;
			}
			
		}while(opcion != 0);
	
		System.out.println(" ");
		System.out.println("Adios.");
		
		entrada.close();
		entrada2.close();
	}

}
