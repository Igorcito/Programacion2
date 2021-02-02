package UT622;

import java.util.Scanner;

public class Pruebaactividad22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//CREACIÓN DE OBJETOS:
		
		//EJERCICIO 1: Usando el constructor vacio:
		Libro libro1 = new Libro();
		libro1.setTitulo("El Silmarillion");
		libro1.setAutor("Tolkien");
		libro1.setEjemplares(5);
		libro1.setPrestados(4);
		
		//EJERCICIO 2: Usando el constructor con parámetros:
		Libro libro2 = new Libro("El señor de los Anillos", "Tolkien", 10, 9);

		//EJERCICIO 3: Simula un alquiler del libro1 y comprueba si se ha hecho o no.
		libro1.prestamo();
		
		//EJERCICIO 4: Muestra el numero de ejemplares prestados de libro1.
		System.out.println("Los ejemplares del libro 1 son: " + libro1.getEjemplares());
		
		//EJERCICIO 5: Simula otro alquiler del libro 1 y vuelve a mostrar los ejemplares prestados.
		libro1.prestamo();
		System.out.println("Los ejemplares del libro 1 son: " + libro1.getEjemplares());
		
		//EJERCICIO 6: Realiza una devolucion de un ejemplar del libro1.
		libro1.devolucion();
		
		//EJERCICIO 7: Pon (set) el numero de ejemplares prestados del libro1 a 0.
		libro1.setEjemplares(0);
		
		//EJERCICIO 8: Pon (set) el numero de ejemplares prestados del libro1 a 0.
		libro1.devolucion();
		System.out.println("Los ejemplares del libro 1 son: " + libro1.getEjemplares());
		System.out.println();
		
		//EJERCICIO 9: Muestra el contenido de libro2 (tostring).
		System.out.println(libro2.toString());
		System.out.println();
		
		//EJERCICIO 10: Pide al usuario que introduzca los datos de un tercer libro (libro3) y muéstralo después.
		Libro libro3 = new Libro();
		System.out.println("Introduce el título de tu libro: ");
		libro3.setTitulo(entrada.nextLine());
		System.out.println("Introduce el autor de tu libro: ");
		libro3.setAutor(entrada.nextLine());
		System.out.println("Introduce el número de ejemplares de tu libro: ");
		libro3.setEjemplares(entrada.nextInt());
		System.out.println("Como es un nuevo libro, no hay ninguno prestado ahora mismo. ");
		libro3.setPrestados(0);
		System.out.println();
		System.out.println("RESULTADO: ");
		System.out.println(libro3.toString());
		
		
		entrada.close();
	}
	
}
